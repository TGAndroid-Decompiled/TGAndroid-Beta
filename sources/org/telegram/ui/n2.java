package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class n2 extends z4.g {
    public final s2 f39396w0;

    public n2(s2 s2Var, Context context) {
        super(context);
        this.f39396w0 = s2Var;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        s2 s2Var = this.f39396w0;
        if (actionMasked == 0) {
            s2Var.f41337x.f38769f0.requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            s2Var.f41337x.f38769f0.requestDisallowInterceptTouchEvent(false);
        }
        s2Var.f41337x.k();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        s2 s2Var = this.f39396w0;
        if (actionMasked == 0) {
            s2Var.f41337x.f38769f0.requestDisallowInterceptTouchEvent(true);
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return onTouchEvent;
        }
        s2Var.f41337x.f38769f0.requestDisallowInterceptTouchEvent(false);
        return onTouchEvent;
    }
}
