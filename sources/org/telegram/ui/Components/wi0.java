package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
public final class wi0 implements View.OnTouchListener {
    public float f39977a;
    public float f39978b;
    public boolean f39979c;

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            if (motionEvent.getAction() == 0) {
                this.f39977a = motionEvent.getX();
                this.f39978b = motionEvent.getY();
                this.f39979c = true;
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (motionEvent.getAction() == 2) {
                float x10 = this.f39977a - motionEvent.getX();
                float y10 = this.f39978b - motionEvent.getY();
                float scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
                if (this.f39979c) {
                    if (Math.sqrt((y10 * y10) + (x10 * x10)) > scaledTouchSlop) {
                        this.f39979c = false;
                        parent.requestDisallowInterceptTouchEvent(false);
                        return false;
                    }
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.f39979c = false;
                parent.requestDisallowInterceptTouchEvent(false);
                return false;
            }
        }
        return false;
    }
}
