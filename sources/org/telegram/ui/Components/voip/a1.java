package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.li1;
public final class a1 extends GestureDetector.SimpleOnGestureListener {
    public boolean f29164a;
    public boolean f29165b;
    public final li1 f29166c;

    public a1(li1 li1Var) {
        this.f29166c = li1Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        this.f29164a = true;
        return super.onDown(motionEvent);
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float x10 = motionEvent.getX() - motionEvent2.getX();
        float y3 = motionEvent.getY() - motionEvent2.getY();
        if (Math.abs(x10) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(x10) / 3.0f > y3 && this.f29164a && !this.f29165b) {
            this.f29164a = false;
            org.telegram.ui.b0 b0Var = new org.telegram.ui.b0(this, x10, 2);
            li1 li1Var = this.f29166c;
            ValueAnimator valueAnimator = li1Var.U;
            if (valueAnimator != null) {
                this.f29165b = true;
                AndroidUtilities.runOnUIThread(b0Var, (valueAnimator.getDuration() - li1Var.U.getCurrentPlayTime()) + 50);
            } else {
                b0Var.run();
            }
        }
        return super.onScroll(motionEvent, motionEvent2, f7, f10);
    }
}
