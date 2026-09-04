package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ni1;
public final class y0 extends GestureDetector.SimpleOnGestureListener {
    public boolean f31941a;
    public boolean f31942b;
    public final ni1 f31943c;

    public y0(ni1 ni1Var) {
        this.f31943c = ni1Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        this.f31941a = true;
        return super.onDown(motionEvent);
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float x10 = motionEvent.getX() - motionEvent2.getX();
        float y3 = motionEvent.getY() - motionEvent2.getY();
        if (Math.abs(x10) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(x10) / 3.0f > y3 && this.f31941a && !this.f31942b) {
            this.f31941a = false;
            org.telegram.ui.b0 b0Var = new org.telegram.ui.b0(this, x10, 2);
            ni1 ni1Var = this.f31943c;
            ValueAnimator valueAnimator = ni1Var.U;
            if (valueAnimator != null) {
                this.f31942b = true;
                AndroidUtilities.runOnUIThread(b0Var, (valueAnimator.getDuration() - ni1Var.U.getCurrentPlayTime()) + 50);
            } else {
                b0Var.run();
            }
        }
        return super.onScroll(motionEvent, motionEvent2, f7, f10);
    }
}
