package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.ui.bc1;
public final class z0 extends GestureDetector.SimpleOnGestureListener {
    public boolean f41506a;
    public boolean f41507b;
    public final bc1 f41508c;

    public z0(bc1 bc1Var) {
        this.f41508c = bc1Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        this.f41506a = true;
        return super.onDown(motionEvent);
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x10 = motionEvent.getX() - motionEvent2.getX();
        float y10 = motionEvent.getY() - motionEvent2.getY();
        if (Math.abs(x10) > org.telegram.messenger.g0.a1(true, 0.4f) && Math.abs(x10) / 3.0f > y10 && this.f41506a && !this.f41507b) {
            this.f41506a = false;
            org.telegram.ui.a0 a0Var = new org.telegram.ui.a0(this, x10, 2);
            bc1 bc1Var = this.f41508c;
            ValueAnimator valueAnimator = bc1Var.V;
            if (valueAnimator != null) {
                this.f41507b = true;
                org.telegram.messenger.g0.h3(a0Var, (valueAnimator.getDuration() - bc1Var.V.getCurrentPlayTime()) + 50);
            } else {
                a0Var.run();
            }
        }
        return super.onScroll(motionEvent, motionEvent2, f10, f11);
    }
}
