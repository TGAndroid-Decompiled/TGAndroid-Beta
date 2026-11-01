package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class j2 extends z4.g {
    public final o2 f38255w0;

    public j2(o2 o2Var, Context context) {
        super(context);
        this.f38255w0 = o2Var;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        o2 o2Var = this.f38255w0;
        if (actionMasked == 0) {
            o2Var.D.f37677f0.requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            o2Var.D.f37677f0.requestDisallowInterceptTouchEvent(false);
        }
        o2Var.D.i();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        o2 o2Var = this.f38255w0;
        if (actionMasked == 0) {
            o2Var.D.f37677f0.requestDisallowInterceptTouchEvent(true);
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return onTouchEvent;
        }
        o2Var.D.f37677f0.requestDisallowInterceptTouchEvent(false);
        return onTouchEvent;
    }
}
