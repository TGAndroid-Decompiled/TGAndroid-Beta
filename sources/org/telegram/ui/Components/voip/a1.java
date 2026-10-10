package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.pi1;
public final class a1 extends GestureDetector.SimpleOnGestureListener {
    public boolean f31915a;
    public boolean f31916b;
    public final pi1 f31917c;

    public a1(pi1 pi1Var) {
        this.f31917c = pi1Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        this.f31915a = true;
        return super.onDown(motionEvent);
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float x10 = motionEvent.getX() - motionEvent2.getX();
        float y3 = motionEvent.getY() - motionEvent2.getY();
        if (Math.abs(x10) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(x10) / 3.0f > y3 && this.f31915a && !this.f31916b) {
            this.f31915a = false;
            org.telegram.ui.c0 c0Var = new org.telegram.ui.c0(this, x10, 2);
            pi1 pi1Var = this.f31917c;
            ValueAnimator valueAnimator = pi1Var.U;
            if (valueAnimator != null) {
                this.f31916b = true;
                AndroidUtilities.runOnUIThread(c0Var, (valueAnimator.getDuration() - pi1Var.U.getCurrentPlayTime()) + 50);
            } else {
                c0Var.run();
            }
        }
        return super.onScroll(motionEvent, motionEvent2, f7, f10);
    }
}
