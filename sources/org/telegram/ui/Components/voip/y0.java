package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.bi1;
public final class y0 extends GestureDetector.SimpleOnGestureListener {
    public boolean f32477a;
    public boolean f32478b;
    public final bi1 f32479c;

    public y0(bi1 bi1Var) {
        this.f32479c = bi1Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        this.f32477a = true;
        return super.onDown(motionEvent);
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x10 = motionEvent.getX() - motionEvent2.getX();
        float y10 = motionEvent.getY() - motionEvent2.getY();
        if (Math.abs(x10) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(x10) / 3.0f > y10 && this.f32477a && !this.f32478b) {
            this.f32477a = false;
            org.telegram.ui.d0 d0Var = new org.telegram.ui.d0(this, x10, 2);
            bi1 bi1Var = this.f32479c;
            ValueAnimator valueAnimator = bi1Var.R;
            if (valueAnimator != null) {
                this.f32478b = true;
                AndroidUtilities.runOnUIThread(d0Var, (valueAnimator.getDuration() - bi1Var.R.getCurrentPlayTime()) + 50);
            } else {
                d0Var.run();
            }
        }
        return super.onScroll(motionEvent, motionEvent2, f10, f11);
    }
}
