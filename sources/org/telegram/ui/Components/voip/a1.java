package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.mi1;
public final class a1 extends GestureDetector.SimpleOnGestureListener {
    public boolean f28848a;
    public boolean f28849b;
    public final mi1 f28850c;

    public a1(mi1 mi1Var) {
        this.f28850c = mi1Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        this.f28848a = true;
        return super.onDown(motionEvent);
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float x10 = motionEvent.getX() - motionEvent2.getX();
        float y3 = motionEvent.getY() - motionEvent2.getY();
        if (Math.abs(x10) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(x10) / 3.0f > y3 && this.f28848a && !this.f28849b) {
            this.f28848a = false;
            org.telegram.ui.b0 b0Var = new org.telegram.ui.b0(this, x10, 2);
            mi1 mi1Var = this.f28850c;
            ValueAnimator valueAnimator = mi1Var.U;
            if (valueAnimator != null) {
                this.f28849b = true;
                AndroidUtilities.runOnUIThread(b0Var, (valueAnimator.getDuration() - mi1Var.U.getCurrentPlayTime()) + 50);
            } else {
                b0Var.run();
            }
        }
        return super.onScroll(motionEvent, motionEvent2, f7, f10);
    }
}
