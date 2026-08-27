package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

public final class p2 extends m2.g {

    public final u2 f41249s0;

    public p2(u2 u2Var, Context context) {
        super(context);
        this.f41249s0 = u2Var;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        u2 u2Var = this.f41249s0;
        if (actionMasked == 0) {
            u2Var.f43077x.f40333b0.requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            u2Var.f43077x.f40333b0.requestDisallowInterceptTouchEvent(false);
        }
        u2Var.f43077x.k();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        u2 u2Var = this.f41249s0;
        if (actionMasked == 0) {
            u2Var.f43077x.f40333b0.requestDisallowInterceptTouchEvent(true);
        }
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return zOnTouchEvent;
        }
        u2Var.f43077x.f40333b0.requestDisallowInterceptTouchEvent(false);
        return zOnTouchEvent;
    }
}
