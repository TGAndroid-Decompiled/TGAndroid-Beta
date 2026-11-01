package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.ui.sd1;
public final class i0 extends GestureDetector.SimpleOnGestureListener {
    public boolean f31543a;
    public boolean f31544b;
    public final sd1 f31545c;

    public i0(sd1 sd1Var) {
        this.f31545c = sd1Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        this.f31543a = true;
        return super.onDown(motionEvent);
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float x10 = motionEvent.getX() - motionEvent2.getX();
        float y3 = motionEvent.getY() - motionEvent2.getY();
        if (Math.abs(x10) > org.telegram.messenger.i0.a1(true, 0.4f) && Math.abs(x10) / 3.0f > y3 && this.f31543a && !this.f31544b) {
            this.f31543a = false;
            org.telegram.ui.a0 a0Var = new org.telegram.ui.a0(this, x10, 2);
            sd1 sd1Var = this.f31545c;
            ValueAnimator valueAnimator = sd1Var.U;
            if (valueAnimator != null) {
                this.f31544b = true;
                org.telegram.messenger.i0.h3(a0Var, (valueAnimator.getDuration() - sd1Var.U.getCurrentPlayTime()) + 50);
            } else {
                a0Var.run();
            }
        }
        return super.onScroll(motionEvent, motionEvent2, f7, f10);
    }
}
