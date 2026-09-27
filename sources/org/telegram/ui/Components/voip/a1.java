package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.di1;
public final class a1 extends GestureDetector.SimpleOnGestureListener {
    public boolean f29203a;
    public boolean f29204b;
    public final di1 f29205c;

    public a1(di1 di1Var) {
        this.f29205c = di1Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        this.f29203a = true;
        return super.onDown(motionEvent);
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float x10 = motionEvent.getX() - motionEvent2.getX();
        float y3 = motionEvent.getY() - motionEvent2.getY();
        if (Math.abs(x10) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(x10) / 3.0f > y3 && this.f29203a && !this.f29204b) {
            this.f29203a = false;
            org.telegram.ui.d0 d0Var = new org.telegram.ui.d0(this, x10, 2);
            di1 di1Var = this.f29205c;
            ValueAnimator valueAnimator = di1Var.U;
            if (valueAnimator != null) {
                this.f29204b = true;
                AndroidUtilities.runOnUIThread(d0Var, (valueAnimator.getDuration() - di1Var.U.getCurrentPlayTime()) + 50);
            } else {
                d0Var.run();
            }
        }
        return super.onScroll(motionEvent, motionEvent2, f7, f10);
    }
}
