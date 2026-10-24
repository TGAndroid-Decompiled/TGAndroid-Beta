package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.gh1;
public final class y0 extends GestureDetector.SimpleOnGestureListener {
    public boolean f31988a;
    public boolean f31989b;
    public final gh1 f31990c;

    public y0(gh1 gh1Var) {
        this.f31990c = gh1Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        this.f31988a = true;
        return super.onDown(motionEvent);
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float x10 = motionEvent.getX() - motionEvent2.getX();
        float y3 = motionEvent.getY() - motionEvent2.getY();
        if (Math.abs(x10) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(x10) / 3.0f > y3 && this.f31988a && !this.f31989b) {
            this.f31988a = false;
            org.telegram.ui.b0 b0Var = new org.telegram.ui.b0(this, x10, 2);
            gh1 gh1Var = this.f31990c;
            ValueAnimator valueAnimator = gh1Var.U;
            if (valueAnimator != null) {
                this.f31989b = true;
                AndroidUtilities.runOnUIThread(b0Var, (valueAnimator.getDuration() - gh1Var.U.getCurrentPlayTime()) + 50);
            } else {
                b0Var.run();
            }
        }
        return super.onScroll(motionEvent, motionEvent2, f7, f10);
    }
}
