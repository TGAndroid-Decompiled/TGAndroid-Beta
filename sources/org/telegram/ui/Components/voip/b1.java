package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.qi1;
public final class b1 extends GestureDetector.SimpleOnGestureListener {
    public boolean f31594a;
    public boolean f31595b;
    public final qi1 f31596c;

    public b1(qi1 qi1Var) {
        this.f31596c = qi1Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        this.f31594a = true;
        return super.onDown(motionEvent);
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float x10 = motionEvent.getX() - motionEvent2.getX();
        float y3 = motionEvent.getY() - motionEvent2.getY();
        if (Math.abs(x10) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(x10) / 3.0f > y3 && this.f31594a && !this.f31595b) {
            this.f31594a = false;
            org.telegram.ui.c0 c0Var = new org.telegram.ui.c0(this, x10, 2);
            qi1 qi1Var = this.f31596c;
            ValueAnimator valueAnimator = qi1Var.U;
            if (valueAnimator != null) {
                this.f31595b = true;
                AndroidUtilities.runOnUIThread(c0Var, (valueAnimator.getDuration() - qi1Var.U.getCurrentPlayTime()) + 50);
            } else {
                c0Var.run();
            }
        }
        return super.onScroll(motionEvent, motionEvent2, f7, f10);
    }
}
