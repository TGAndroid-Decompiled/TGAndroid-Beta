package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class n2 extends m2.h {
    public final s2 f36432t0;

    public n2(s2 s2Var, Context context) {
        super(context);
        this.f36432t0 = s2Var;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        s2 s2Var = this.f36432t0;
        if (actionMasked == 0) {
            s2Var.f38180x.f35931c0.requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            s2Var.f38180x.f35931c0.requestDisallowInterceptTouchEvent(false);
        }
        s2Var.f38180x.k();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        s2 s2Var = this.f36432t0;
        if (actionMasked == 0) {
            s2Var.f38180x.f35931c0.requestDisallowInterceptTouchEvent(true);
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return onTouchEvent;
        }
        s2Var.f38180x.f35931c0.requestDisallowInterceptTouchEvent(false);
        return onTouchEvent;
    }
}
