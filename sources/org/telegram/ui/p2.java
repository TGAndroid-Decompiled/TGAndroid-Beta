package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class p2 extends m2.g {
    public final u2 f41282s0;

    public p2(u2 u2Var, Context context) {
        super(context);
        this.f41282s0 = u2Var;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        u2 u2Var = this.f41282s0;
        if (actionMasked == 0) {
            u2Var.f43144x.f40390b0.requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            u2Var.f43144x.f40390b0.requestDisallowInterceptTouchEvent(false);
        }
        u2Var.f43144x.k();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        u2 u2Var = this.f41282s0;
        if (actionMasked == 0) {
            u2Var.f43144x.f40390b0.requestDisallowInterceptTouchEvent(true);
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return onTouchEvent;
        }
        u2Var.f43144x.f40390b0.requestDisallowInterceptTouchEvent(false);
        return onTouchEvent;
    }
}
