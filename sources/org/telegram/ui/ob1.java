package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
public final class ob1 implements org.telegram.ui.Components.bp0, org.telegram.ui.Components.r20 {
    public final mc1 f39717a;

    public ob1(mc1 mc1Var) {
        this.f39717a = mc1Var;
    }

    @Override
    public void L(float f7, boolean z10) {
        mc1 mc1Var = this.f39717a;
        mc1Var.l1 = f7;
        mc1Var.k1();
    }

    @Override
    public int Y() {
        return 0;
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.f39717a.f39085c;
        if (scroller != null) {
            scroller.abortAnimation();
            return true;
        }
        return true;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        mc1 mc1Var = this.f39717a;
        Scroller scroller = mc1Var.f39085c;
        if (scroller != null) {
            scroller.abortAnimation();
            mc1Var.f39085c.fling((int) mc1Var.X1, 0, Math.round(-f7), Math.round(f10), 0, (int) mc1Var.W1, 0, Integer.MAX_VALUE);
            mc1Var.f39140x0.postInvalidate();
            return true;
        }
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        mc1 mc1Var = this.f39717a;
        Scroller scroller = mc1Var.f39085c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        mc1Var.X1 = Utilities.clamp(mc1Var.X1 + f7, mc1Var.W1, 0.0f);
        mc1Var.V0();
        mc1Var.f39140x0.invalidate();
        return true;
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public void N0() {
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public void v() {
    }
}
