package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class j2 extends c5.l {
    public final o2 f48881x0;

    public j2(o2 o2Var, Context context) {
        super(context);
        this.f48881x0 = o2Var;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        o2 o2Var = this.f48881x0;
        if (actionMasked == 0) {
            o2Var.E.f47906g0.requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            o2Var.E.f47906g0.requestDisallowInterceptTouchEvent(false);
        }
        o2Var.E.i();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        o2 o2Var = this.f48881x0;
        if (actionMasked == 0) {
            o2Var.E.f47906g0.requestDisallowInterceptTouchEvent(true);
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return onTouchEvent;
        }
        o2Var.E.f47906g0.requestDisallowInterceptTouchEvent(false);
        return onTouchEvent;
    }
}
