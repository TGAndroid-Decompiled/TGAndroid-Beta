package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
public final class hl0 implements View.OnTouchListener {
    public float f27159a;
    public float f27160b;
    public boolean f27161c;

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            if (motionEvent.getAction() == 0) {
                this.f27159a = motionEvent.getX();
                this.f27160b = motionEvent.getY();
                this.f27161c = true;
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (motionEvent.getAction() == 2) {
                float x10 = this.f27159a - motionEvent.getX();
                float y3 = this.f27160b - motionEvent.getY();
                float scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
                if (this.f27161c) {
                    if (Math.sqrt((y3 * y3) + (x10 * x10)) > scaledTouchSlop) {
                        this.f27161c = false;
                        parent.requestDisallowInterceptTouchEvent(false);
                        return false;
                    }
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.f27161c = false;
                parent.requestDisallowInterceptTouchEvent(false);
                return false;
            }
        }
        return false;
    }
}
