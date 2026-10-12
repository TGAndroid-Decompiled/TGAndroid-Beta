package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.wi1;
public final class y0 extends GestureDetector.SimpleOnGestureListener {
    public boolean f30593a;
    public boolean f30594b;
    public final wi1 f30595c;

    public y0(wi1 wi1Var) {
        this.f30595c = wi1Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        this.f30593a = true;
        return super.onDown(motionEvent);
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float x10 = motionEvent.getX() - motionEvent2.getX();
        float y3 = motionEvent.getY() - motionEvent2.getY();
        if (Math.abs(x10) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(x10) / 3.0f > y3 && this.f30593a && !this.f30594b) {
            this.f30593a = false;
            org.telegram.ui.c0 c0Var = new org.telegram.ui.c0(this, x10, 2);
            wi1 wi1Var = this.f30595c;
            ValueAnimator valueAnimator = wi1Var.U;
            if (valueAnimator != null) {
                this.f30594b = true;
                AndroidUtilities.runOnUIThread(c0Var, (valueAnimator.getDuration() - wi1Var.U.getCurrentPlayTime()) + 50);
            } else {
                c0Var.run();
            }
        }
        return super.onScroll(motionEvent, motionEvent2, f7, f10);
    }
}
