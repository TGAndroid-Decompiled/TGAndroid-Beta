package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.eh1;

public final class x0 extends GestureDetector.SimpleOnGestureListener {

    public boolean f33979a;

    public boolean f33980b;

    public final eh1 f33981c;

    public x0(eh1 eh1Var) {
        this.f33981c = eh1Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        this.f33979a = true;
        return super.onDown(motionEvent);
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x8 = motionEvent.getX() - motionEvent2.getX();
        float y10 = motionEvent.getY() - motionEvent2.getY();
        if (Math.abs(x8) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(x8) / 3.0f > y10 && this.f33979a && !this.f33980b) {
            this.f33979a = false;
            org.telegram.ui.e0 e0Var = new org.telegram.ui.e0(this, x8, 2);
            eh1 eh1Var = this.f33981c;
            ValueAnimator valueAnimator = eh1Var.Q;
            if (valueAnimator != null) {
                this.f33980b = true;
                AndroidUtilities.runOnUIThread(e0Var, (valueAnimator.getDuration() - eh1Var.Q.getCurrentPlayTime()) + 50);
            } else {
                e0Var.run();
            }
        }
        return super.onScroll(motionEvent, motionEvent2, f10, f11);
    }
}
