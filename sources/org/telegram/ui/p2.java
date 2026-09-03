package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class p2 extends m2.h {
    public final u2 f36923t0;

    public p2(u2 u2Var, Context context) {
        super(context);
        this.f36923t0 = u2Var;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        u2 u2Var = this.f36923t0;
        if (actionMasked == 0) {
            u2Var.f38671x.f36361c0.requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            u2Var.f38671x.f36361c0.requestDisallowInterceptTouchEvent(false);
        }
        u2Var.f38671x.k();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        u2 u2Var = this.f36923t0;
        if (actionMasked == 0) {
            u2Var.f38671x.f36361c0.requestDisallowInterceptTouchEvent(true);
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return onTouchEvent;
        }
        u2Var.f38671x.f36361c0.requestDisallowInterceptTouchEvent(false);
        return onTouchEvent;
    }
}
