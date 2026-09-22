package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class k2 extends z4.g {
    public final p2 f35030w0;

    public k2(p2 p2Var, Context context) {
        super(context);
        this.f35030w0 = p2Var;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        p2 p2Var = this.f35030w0;
        if (actionMasked == 0) {
            p2Var.f36403x.f34076f0.requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            p2Var.f36403x.f34076f0.requestDisallowInterceptTouchEvent(false);
        }
        p2Var.f36403x.k();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        p2 p2Var = this.f35030w0;
        if (actionMasked == 0) {
            p2Var.f36403x.f34076f0.requestDisallowInterceptTouchEvent(true);
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return onTouchEvent;
        }
        p2Var.f36403x.f34076f0.requestDisallowInterceptTouchEvent(false);
        return onTouchEvent;
    }
}
