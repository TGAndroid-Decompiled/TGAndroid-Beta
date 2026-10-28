package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.kh1;
public final class y0 extends GestureDetector.SimpleOnGestureListener {
    public boolean f34318a;
    public boolean f34319b;
    public final kh1 f34320c;

    public y0(kh1 kh1Var) {
        this.f34320c = kh1Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        this.f34318a = true;
        return super.onDown(motionEvent);
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float x9 = motionEvent.getX() - motionEvent2.getX();
        float y3 = motionEvent.getY() - motionEvent2.getY();
        if (Math.abs(x9) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(x9) / 3.0f > y3 && this.f34318a && !this.f34319b) {
            this.f34318a = false;
            org.telegram.ui.b0 b0Var = new org.telegram.ui.b0(this, x9, 3);
            kh1 kh1Var = this.f34320c;
            ValueAnimator valueAnimator = kh1Var.U;
            if (valueAnimator != null) {
                this.f34319b = true;
                AndroidUtilities.runOnUIThread(b0Var, (valueAnimator.getDuration() - kh1Var.U.getCurrentPlayTime()) + 50);
            } else {
                b0Var.run();
            }
        }
        return super.onScroll(motionEvent, motionEvent2, f7, f10);
    }
}
