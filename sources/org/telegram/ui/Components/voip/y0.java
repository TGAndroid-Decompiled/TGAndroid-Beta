package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.hh1;
public final class y0 extends GestureDetector.SimpleOnGestureListener {
    public boolean f32018a;
    public boolean f32019b;
    public final hh1 f32020c;

    public y0(hh1 hh1Var) {
        this.f32020c = hh1Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        this.f32018a = true;
        return super.onDown(motionEvent);
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float x10 = motionEvent.getX() - motionEvent2.getX();
        float y3 = motionEvent.getY() - motionEvent2.getY();
        if (Math.abs(x10) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(x10) / 3.0f > y3 && this.f32018a && !this.f32019b) {
            this.f32018a = false;
            org.telegram.ui.b0 b0Var = new org.telegram.ui.b0(this, x10, 2);
            hh1 hh1Var = this.f32020c;
            ValueAnimator valueAnimator = hh1Var.U;
            if (valueAnimator != null) {
                this.f32019b = true;
                AndroidUtilities.runOnUIThread(b0Var, (valueAnimator.getDuration() - hh1Var.U.getCurrentPlayTime()) + 50);
            } else {
                b0Var.run();
            }
        }
        return super.onScroll(motionEvent, motionEvent2, f7, f10);
    }
}
