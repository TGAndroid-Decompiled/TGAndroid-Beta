package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ih1;
public final class y0 extends GestureDetector.SimpleOnGestureListener {
    public boolean f34210a;
    public boolean f34211b;
    public final ih1 f34212c;

    public y0(ih1 ih1Var) {
        this.f34212c = ih1Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        this.f34210a = true;
        return super.onDown(motionEvent);
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float x9 = motionEvent.getX() - motionEvent2.getX();
        float y3 = motionEvent.getY() - motionEvent2.getY();
        if (Math.abs(x9) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(x9) / 3.0f > y3 && this.f34210a && !this.f34211b) {
            this.f34210a = false;
            org.telegram.ui.b0 b0Var = new org.telegram.ui.b0(this, x9, 3);
            ih1 ih1Var = this.f34212c;
            ValueAnimator valueAnimator = ih1Var.U;
            if (valueAnimator != null) {
                this.f34211b = true;
                AndroidUtilities.runOnUIThread(b0Var, (valueAnimator.getDuration() - ih1Var.U.getCurrentPlayTime()) + 50);
            } else {
                b0Var.run();
            }
        }
        return super.onScroll(motionEvent, motionEvent2, f7, f10);
    }
}
