package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class o2 extends m2.g {
    public final t2 f40869s0;

    public o2(t2 t2Var, Context context) {
        super(context);
        this.f40869s0 = t2Var;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        t2 t2Var = this.f40869s0;
        if (actionMasked == 0) {
            t2Var.f42820x.f40012b0.requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            t2Var.f42820x.f40012b0.requestDisallowInterceptTouchEvent(false);
        }
        t2Var.f42820x.k();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        t2 t2Var = this.f40869s0;
        if (actionMasked == 0) {
            t2Var.f42820x.f40012b0.requestDisallowInterceptTouchEvent(true);
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return onTouchEvent;
        }
        t2Var.f42820x.f40012b0.requestDisallowInterceptTouchEvent(false);
        return onTouchEvent;
    }
}
