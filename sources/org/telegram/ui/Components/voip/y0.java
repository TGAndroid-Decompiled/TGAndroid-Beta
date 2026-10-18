package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ch1;
public final class y0 extends GestureDetector.SimpleOnGestureListener {
    public boolean f31872a;
    public boolean f31873b;
    public final ch1 f31874c;

    public y0(ch1 ch1Var) {
        this.f31874c = ch1Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        this.f31872a = true;
        return super.onDown(motionEvent);
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float x10 = motionEvent.getX() - motionEvent2.getX();
        float y3 = motionEvent.getY() - motionEvent2.getY();
        if (Math.abs(x10) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(x10) / 3.0f > y3 && this.f31872a && !this.f31873b) {
            this.f31872a = false;
            org.telegram.ui.c0 c0Var = new org.telegram.ui.c0(this, x10, 2);
            ch1 ch1Var = this.f31874c;
            ValueAnimator valueAnimator = ch1Var.U;
            if (valueAnimator != null) {
                this.f31873b = true;
                AndroidUtilities.runOnUIThread(c0Var, (valueAnimator.getDuration() - ch1Var.U.getCurrentPlayTime()) + 50);
            } else {
                c0Var.run();
            }
        }
        return super.onScroll(motionEvent, motionEvent2, f7, f10);
    }
}
