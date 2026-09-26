package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.fi1;
public final class a1 extends GestureDetector.SimpleOnGestureListener {
    public boolean f29177a;
    public boolean f29178b;
    public final fi1 f29179c;

    public a1(fi1 fi1Var) {
        this.f29179c = fi1Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        this.f29177a = true;
        return super.onDown(motionEvent);
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float x10 = motionEvent.getX() - motionEvent2.getX();
        float y3 = motionEvent.getY() - motionEvent2.getY();
        if (Math.abs(x10) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(x10) / 3.0f > y3 && this.f29177a && !this.f29178b) {
            this.f29177a = false;
            org.telegram.ui.c0 c0Var = new org.telegram.ui.c0(this, x10, 2);
            fi1 fi1Var = this.f29179c;
            ValueAnimator valueAnimator = fi1Var.U;
            if (valueAnimator != null) {
                this.f29178b = true;
                AndroidUtilities.runOnUIThread(c0Var, (valueAnimator.getDuration() - fi1Var.U.getCurrentPlayTime()) + 50);
            } else {
                c0Var.run();
            }
        }
        return super.onScroll(motionEvent, motionEvent2, f7, f10);
    }
}
