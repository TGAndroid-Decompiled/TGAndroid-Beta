package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
public final class ul0 implements View.OnTouchListener {
    public float f33434a;
    public float f33435b;
    public boolean f33436c;

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            if (motionEvent.getAction() == 0) {
                this.f33434a = motionEvent.getX();
                this.f33435b = motionEvent.getY();
                this.f33436c = true;
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (motionEvent.getAction() == 2) {
                float x9 = this.f33434a - motionEvent.getX();
                float y3 = this.f33435b - motionEvent.getY();
                float scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
                if (this.f33436c) {
                    if (Math.sqrt((y3 * y3) + (x9 * x9)) > scaledTouchSlop) {
                        this.f33436c = false;
                        parent.requestDisallowInterceptTouchEvent(false);
                        return false;
                    }
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.f33436c = false;
                parent.requestDisallowInterceptTouchEvent(false);
                return false;
            }
        }
        return false;
    }
}
