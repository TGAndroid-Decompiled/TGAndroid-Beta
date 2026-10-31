package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.ui.ud1;
public final class h0 extends GestureDetector.SimpleOnGestureListener {
    public boolean f31458a;
    public boolean f31459b;
    public final ud1 f31460c;

    public h0(ud1 ud1Var) {
        this.f31460c = ud1Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        this.f31458a = true;
        return super.onDown(motionEvent);
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float x10 = motionEvent.getX() - motionEvent2.getX();
        float y3 = motionEvent.getY() - motionEvent2.getY();
        if (Math.abs(x10) > org.telegram.messenger.i0.a1(true, 0.4f) && Math.abs(x10) / 3.0f > y3 && this.f31458a && !this.f31459b) {
            this.f31458a = false;
            org.telegram.ui.a0 a0Var = new org.telegram.ui.a0(this, x10, 2);
            ud1 ud1Var = this.f31460c;
            ValueAnimator valueAnimator = ud1Var.U;
            if (valueAnimator != null) {
                this.f31459b = true;
                org.telegram.messenger.i0.h3(a0Var, (valueAnimator.getDuration() - ud1Var.U.getCurrentPlayTime()) + 50);
            } else {
                a0Var.run();
            }
        }
        return super.onScroll(motionEvent, motionEvent2, f7, f10);
    }
}
