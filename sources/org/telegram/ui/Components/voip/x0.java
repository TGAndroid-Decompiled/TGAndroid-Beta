package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.th1;
public final class x0 extends GestureDetector.SimpleOnGestureListener {
    public boolean f30023a;
    public boolean f30024b;
    public final th1 f30025c;

    public x0(th1 th1Var) {
        this.f30025c = th1Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        this.f30023a = true;
        return super.onDown(motionEvent);
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x10 = motionEvent.getX() - motionEvent2.getX();
        float y10 = motionEvent.getY() - motionEvent2.getY();
        if (Math.abs(x10) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(x10) / 3.0f > y10 && this.f30023a && !this.f30024b) {
            this.f30023a = false;
            org.telegram.ui.d0 d0Var = new org.telegram.ui.d0(this, x10, 2);
            th1 th1Var = this.f30025c;
            ValueAnimator valueAnimator = th1Var.R;
            if (valueAnimator != null) {
                this.f30024b = true;
                AndroidUtilities.runOnUIThread(d0Var, (valueAnimator.getDuration() - th1Var.R.getCurrentPlayTime()) + 50);
            } else {
                d0Var.run();
            }
        }
        return super.onScroll(motionEvent, motionEvent2, f10, f11);
    }
}
