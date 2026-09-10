package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class m2 extends z4.g {
    public final r2 f34821w0;

    public m2(r2 r2Var, Context context) {
        super(context);
        this.f34821w0 = r2Var;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        r2 r2Var = this.f34821w0;
        if (actionMasked == 0) {
            r2Var.f36179x.f33906f0.requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            r2Var.f36179x.f33906f0.requestDisallowInterceptTouchEvent(false);
        }
        r2Var.f36179x.k();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        r2 r2Var = this.f34821w0;
        if (actionMasked == 0) {
            r2Var.f36179x.f33906f0.requestDisallowInterceptTouchEvent(true);
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return onTouchEvent;
        }
        r2Var.f36179x.f33906f0.requestDisallowInterceptTouchEvent(false);
        return onTouchEvent;
    }
}
