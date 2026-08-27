package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

public final class kk0 implements View.OnTouchListener {

    public float f30127a;

    public float f30128b;

    public boolean f30129c;

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            if (motionEvent.getAction() == 0) {
                this.f30127a = motionEvent.getX();
                this.f30128b = motionEvent.getY();
                this.f30129c = true;
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (motionEvent.getAction() == 2) {
                float x8 = this.f30127a - motionEvent.getX();
                float y10 = this.f30128b - motionEvent.getY();
                float scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
                if (this.f30129c) {
                    if (Math.sqrt((y10 * y10) + (x8 * x8)) > scaledTouchSlop) {
                        this.f30129c = false;
                        parent.requestDisallowInterceptTouchEvent(false);
                        return false;
                    }
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.f30129c = false;
                parent.requestDisallowInterceptTouchEvent(false);
                return false;
            }
        }
        return false;
    }
}
