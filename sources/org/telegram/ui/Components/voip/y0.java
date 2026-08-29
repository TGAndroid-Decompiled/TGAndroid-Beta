package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.hh1;
public final class y0 extends GestureDetector.SimpleOnGestureListener {
    public boolean f34128a;
    public boolean f34129b;
    public final hh1 f34130c;

    public y0(hh1 hh1Var) {
        this.f34130c = hh1Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        this.f34128a = true;
        return super.onDown(motionEvent);
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        float x4 = motionEvent.getX() - motionEvent2.getX();
        float y8 = motionEvent.getY() - motionEvent2.getY();
        if (Math.abs(x4) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(x4) / 3.0f > y8 && this.f34128a && !this.f34129b) {
            this.f34128a = false;
            org.telegram.ui.e0 e0Var = new org.telegram.ui.e0(this, x4, 2);
            hh1 hh1Var = this.f34130c;
            ValueAnimator valueAnimator = hh1Var.Q;
            if (valueAnimator != null) {
                this.f34129b = true;
                AndroidUtilities.runOnUIThread(e0Var, (valueAnimator.getDuration() - hh1Var.Q.getCurrentPlayTime()) + 50);
            } else {
                e0Var.run();
            }
        }
        return super.onScroll(motionEvent, motionEvent2, f9, f10);
    }
}
