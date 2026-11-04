package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.ui.sb1;
public final class i0 extends GestureDetector.SimpleOnGestureListener {
    public boolean f39402a;
    public boolean f39403b;
    public final sb1 f39404c;

    public i0(sb1 sb1Var) {
        this.f39404c = sb1Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        this.f39402a = true;
        return super.onDown(motionEvent);
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x10 = motionEvent.getX() - motionEvent2.getX();
        float y9 = motionEvent.getY() - motionEvent2.getY();
        if (Math.abs(x10) > org.telegram.messenger.g0.a1(true, 0.4f) && Math.abs(x10) / 3.0f > y9 && this.f39402a && !this.f39403b) {
            this.f39402a = false;
            org.telegram.ui.c0 c0Var = new org.telegram.ui.c0(this, x10, 2);
            sb1 sb1Var = this.f39404c;
            ValueAnimator valueAnimator = sb1Var.V;
            if (valueAnimator != null) {
                this.f39403b = true;
                org.telegram.messenger.g0.i3(c0Var, (valueAnimator.getDuration() - sb1Var.V.getCurrentPlayTime()) + 50);
            } else {
                c0Var.run();
            }
        }
        return super.onScroll(motionEvent, motionEvent2, f10, f11);
    }
}
