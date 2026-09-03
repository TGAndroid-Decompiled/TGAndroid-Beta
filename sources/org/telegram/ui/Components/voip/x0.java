package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.bi1;
public final class x0 extends GestureDetector.SimpleOnGestureListener {
    public boolean f29995a;
    public boolean f29996b;
    public final bi1 f29997c;

    public x0(bi1 bi1Var) {
        this.f29997c = bi1Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        this.f29995a = true;
        return super.onDown(motionEvent);
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x10 = motionEvent.getX() - motionEvent2.getX();
        float y10 = motionEvent.getY() - motionEvent2.getY();
        if (Math.abs(x10) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(x10) / 3.0f > y10 && this.f29995a && !this.f29996b) {
            this.f29995a = false;
            org.telegram.ui.e0 e0Var = new org.telegram.ui.e0(this, x10, 2);
            bi1 bi1Var = this.f29997c;
            ValueAnimator valueAnimator = bi1Var.R;
            if (valueAnimator != null) {
                this.f29996b = true;
                AndroidUtilities.runOnUIThread(e0Var, (valueAnimator.getDuration() - bi1Var.R.getCurrentPlayTime()) + 50);
            } else {
                e0Var.run();
            }
        }
        return super.onScroll(motionEvent, motionEvent2, f10, f11);
    }
}
