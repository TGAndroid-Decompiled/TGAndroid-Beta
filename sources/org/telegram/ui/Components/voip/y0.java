package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.vh1;
public final class y0 extends GestureDetector.SimpleOnGestureListener {
    public boolean f32472a;
    public boolean f32473b;
    public final vh1 f32474c;

    public y0(vh1 vh1Var) {
        this.f32474c = vh1Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        this.f32472a = true;
        return super.onDown(motionEvent);
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x10 = motionEvent.getX() - motionEvent2.getX();
        float y10 = motionEvent.getY() - motionEvent2.getY();
        if (Math.abs(x10) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(x10) / 3.0f > y10 && this.f32472a && !this.f32473b) {
            this.f32472a = false;
            org.telegram.ui.d0 d0Var = new org.telegram.ui.d0(this, x10, 2);
            vh1 vh1Var = this.f32474c;
            ValueAnimator valueAnimator = vh1Var.R;
            if (valueAnimator != null) {
                this.f32473b = true;
                AndroidUtilities.runOnUIThread(d0Var, (valueAnimator.getDuration() - vh1Var.R.getCurrentPlayTime()) + 50);
            } else {
                d0Var.run();
            }
        }
        return super.onScroll(motionEvent, motionEvent2, f10, f11);
    }
}
