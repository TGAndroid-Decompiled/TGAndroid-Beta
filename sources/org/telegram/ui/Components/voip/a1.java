package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.ui.zb1;
public final class a1 extends GestureDetector.SimpleOnGestureListener {
    public boolean f40765a;
    public boolean f40766b;
    public final zb1 f40767c;

    public a1(zb1 zb1Var) {
        this.f40767c = zb1Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        this.f40765a = true;
        return super.onDown(motionEvent);
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x10 = motionEvent.getX() - motionEvent2.getX();
        float y10 = motionEvent.getY() - motionEvent2.getY();
        if (Math.abs(x10) > org.telegram.messenger.g0.a1(true, 0.4f) && Math.abs(x10) / 3.0f > y10 && this.f40765a && !this.f40766b) {
            this.f40765a = false;
            org.telegram.ui.a0 a0Var = new org.telegram.ui.a0(this, x10, 2);
            zb1 zb1Var = this.f40767c;
            ValueAnimator valueAnimator = zb1Var.V;
            if (valueAnimator != null) {
                this.f40766b = true;
                org.telegram.messenger.g0.h3(a0Var, (valueAnimator.getDuration() - zb1Var.V.getCurrentPlayTime()) + 50);
            } else {
                a0Var.run();
            }
        }
        return super.onScroll(motionEvent, motionEvent2, f10, f11);
    }
}
