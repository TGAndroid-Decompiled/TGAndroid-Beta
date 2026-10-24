package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class m2 extends z4.h {
    public final r2 f39424w0;

    public m2(r2 r2Var, Context context) {
        super(context);
        this.f39424w0 = r2Var;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        r2 r2Var = this.f39424w0;
        if (actionMasked == 0) {
            r2Var.f40989y.f38760f0.requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            r2Var.f40989y.f38760f0.requestDisallowInterceptTouchEvent(false);
        }
        r2Var.f40989y.k();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        r2 r2Var = this.f39424w0;
        if (actionMasked == 0) {
            r2Var.f40989y.f38760f0.requestDisallowInterceptTouchEvent(true);
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return onTouchEvent;
        }
        r2Var.f40989y.f38760f0.requestDisallowInterceptTouchEvent(false);
        return onTouchEvent;
    }
}
