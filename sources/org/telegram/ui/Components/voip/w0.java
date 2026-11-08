package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.ui.zb1;
public final class w0 extends GestureDetector.SimpleOnGestureListener {
    public boolean f39587a;
    public boolean f39588b;
    public final zb1 f39589c;

    public w0(zb1 zb1Var) {
        this.f39589c = zb1Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        this.f39587a = true;
        return super.onDown(motionEvent);
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x10 = motionEvent.getX() - motionEvent2.getX();
        float y10 = motionEvent.getY() - motionEvent2.getY();
        if (Math.abs(x10) > org.telegram.messenger.g0.a1(true, 0.4f) && Math.abs(x10) / 3.0f > y10 && this.f39587a && !this.f39588b) {
            this.f39587a = false;
            org.telegram.ui.b0 b0Var = new org.telegram.ui.b0(this, x10, 2);
            zb1 zb1Var = this.f39589c;
            ValueAnimator valueAnimator = zb1Var.U;
            if (valueAnimator != null) {
                this.f39588b = true;
                org.telegram.messenger.g0.i3(b0Var, (valueAnimator.getDuration() - zb1Var.U.getCurrentPlayTime()) + 50);
            } else {
                b0Var.run();
            }
        }
        return super.onScroll(motionEvent, motionEvent2, f10, f11);
    }
}
