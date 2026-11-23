package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
public final class lj0 implements View.OnTouchListener {
    public float f37200a;
    public float f37201b;
    public boolean f37202c;

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            if (motionEvent.getAction() == 0) {
                this.f37200a = motionEvent.getX();
                this.f37201b = motionEvent.getY();
                this.f37202c = true;
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (motionEvent.getAction() == 2) {
                float x10 = this.f37200a - motionEvent.getX();
                float y10 = this.f37201b - motionEvent.getY();
                float scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
                if (this.f37202c) {
                    if (Math.sqrt((y10 * y10) + (x10 * x10)) > scaledTouchSlop) {
                        this.f37202c = false;
                        parent.requestDisallowInterceptTouchEvent(false);
                        return false;
                    }
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.f37202c = false;
                parent.requestDisallowInterceptTouchEvent(false);
                return false;
            }
        }
        return false;
    }
}
