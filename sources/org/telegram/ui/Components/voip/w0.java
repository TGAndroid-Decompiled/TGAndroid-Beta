package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.ui.cc1;
public final class w0 extends GestureDetector.SimpleOnGestureListener {
    public boolean f39676a;
    public boolean f39677b;
    public final cc1 f39678c;

    public w0(cc1 cc1Var) {
        this.f39678c = cc1Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        this.f39676a = true;
        return super.onDown(motionEvent);
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x10 = motionEvent.getX() - motionEvent2.getX();
        float y10 = motionEvent.getY() - motionEvent2.getY();
        if (Math.abs(x10) > org.telegram.messenger.g0.a1(true, 0.4f) && Math.abs(x10) / 3.0f > y10 && this.f39676a && !this.f39677b) {
            this.f39676a = false;
            org.telegram.ui.b0 b0Var = new org.telegram.ui.b0(this, x10, 2);
            cc1 cc1Var = this.f39678c;
            ValueAnimator valueAnimator = cc1Var.U;
            if (valueAnimator != null) {
                this.f39677b = true;
                org.telegram.messenger.g0.i3(b0Var, (valueAnimator.getDuration() - cc1Var.U.getCurrentPlayTime()) + 50);
            } else {
                b0Var.run();
            }
        }
        return super.onScroll(motionEvent, motionEvent2, f10, f11);
    }
}
