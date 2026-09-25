package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.fi1;
public final class a1 extends GestureDetector.SimpleOnGestureListener {
    public boolean f29261a;
    public boolean f29262b;
    public final fi1 f29263c;

    public a1(fi1 fi1Var) {
        this.f29263c = fi1Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        this.f29261a = true;
        return super.onDown(motionEvent);
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float x10 = motionEvent.getX() - motionEvent2.getX();
        float y3 = motionEvent.getY() - motionEvent2.getY();
        if (Math.abs(x10) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(x10) / 3.0f > y3 && this.f29261a && !this.f29262b) {
            this.f29261a = false;
            org.telegram.ui.c0 c0Var = new org.telegram.ui.c0(this, x10, 2);
            fi1 fi1Var = this.f29263c;
            ValueAnimator valueAnimator = fi1Var.U;
            if (valueAnimator != null) {
                this.f29262b = true;
                AndroidUtilities.runOnUIThread(c0Var, (valueAnimator.getDuration() - fi1Var.U.getCurrentPlayTime()) + 50);
            } else {
                c0Var.run();
            }
        }
        return super.onScroll(motionEvent, motionEvent2, f7, f10);
    }
}
