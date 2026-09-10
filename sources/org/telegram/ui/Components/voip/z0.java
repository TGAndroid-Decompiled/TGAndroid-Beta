package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.si1;
public final class z0 extends GestureDetector.SimpleOnGestureListener {
    public boolean f28553a;
    public boolean f28554b;
    public final si1 f28555c;

    public z0(si1 si1Var) {
        this.f28555c = si1Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        this.f28553a = true;
        return super.onDown(motionEvent);
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float x10 = motionEvent.getX() - motionEvent2.getX();
        float y3 = motionEvent.getY() - motionEvent2.getY();
        if (Math.abs(x10) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(x10) / 3.0f > y3 && this.f28553a && !this.f28554b) {
            this.f28553a = false;
            org.telegram.ui.c0 c0Var = new org.telegram.ui.c0(this, x10, 2);
            si1 si1Var = this.f28555c;
            ValueAnimator valueAnimator = si1Var.U;
            if (valueAnimator != null) {
                this.f28554b = true;
                AndroidUtilities.runOnUIThread(c0Var, (valueAnimator.getDuration() - si1Var.U.getCurrentPlayTime()) + 50);
            } else {
                c0Var.run();
            }
        }
        return super.onScroll(motionEvent, motionEvent2, f7, f10);
    }
}
