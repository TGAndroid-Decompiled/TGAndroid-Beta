package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
public final class uk0 implements View.OnTouchListener {
    public float f33251a;
    public float f33252b;
    public boolean f33253c;

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            if (motionEvent.getAction() == 0) {
                this.f33251a = motionEvent.getX();
                this.f33252b = motionEvent.getY();
                this.f33253c = true;
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (motionEvent.getAction() == 2) {
                float x4 = this.f33251a - motionEvent.getX();
                float y8 = this.f33252b - motionEvent.getY();
                float scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
                if (this.f33253c) {
                    if (Math.sqrt((y8 * y8) + (x4 * x4)) > scaledTouchSlop) {
                        this.f33253c = false;
                        parent.requestDisallowInterceptTouchEvent(false);
                        return false;
                    }
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.f33253c = false;
                parent.requestDisallowInterceptTouchEvent(false);
                return false;
            }
        }
        return false;
    }
}
