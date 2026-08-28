package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.fh1;
public final class x0 extends GestureDetector.SimpleOnGestureListener {
    public boolean f33929a;
    public boolean f33930b;
    public final fh1 f33931c;

    public x0(fh1 fh1Var) {
        this.f33931c = fh1Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        this.f33929a = true;
        return super.onDown(motionEvent);
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x10 = motionEvent.getX() - motionEvent2.getX();
        float y10 = motionEvent.getY() - motionEvent2.getY();
        if (Math.abs(x10) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(x10) / 3.0f > y10 && this.f33929a && !this.f33930b) {
            this.f33929a = false;
            org.telegram.ui.d0 d0Var = new org.telegram.ui.d0(this, x10, 2);
            fh1 fh1Var = this.f33931c;
            ValueAnimator valueAnimator = fh1Var.Q;
            if (valueAnimator != null) {
                this.f33930b = true;
                AndroidUtilities.runOnUIThread(d0Var, (valueAnimator.getDuration() - fh1Var.Q.getCurrentPlayTime()) + 50);
            } else {
                d0Var.run();
            }
        }
        return super.onScroll(motionEvent, motionEvent2, f10, f11);
    }
}
