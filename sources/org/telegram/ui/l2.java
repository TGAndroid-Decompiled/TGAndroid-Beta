package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class l2 extends z4.g {
    public final q2 f38201w0;

    public l2(q2 q2Var, Context context) {
        super(context);
        this.f38201w0 = q2Var;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        q2 q2Var = this.f38201w0;
        if (actionMasked == 0) {
            q2Var.f39707x.f37245f0.requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            q2Var.f39707x.f37245f0.requestDisallowInterceptTouchEvent(false);
        }
        q2Var.f39707x.k();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        q2 q2Var = this.f38201w0;
        if (actionMasked == 0) {
            q2Var.f39707x.f37245f0.requestDisallowInterceptTouchEvent(true);
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return onTouchEvent;
        }
        q2Var.f39707x.f37245f0.requestDisallowInterceptTouchEvent(false);
        return onTouchEvent;
    }
}
