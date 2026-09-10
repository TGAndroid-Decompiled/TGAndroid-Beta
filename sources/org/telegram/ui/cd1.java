package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
public final class cd1 implements org.telegram.ui.Components.no0, org.telegram.ui.Components.r20 {
    public final ae1 f31647a;

    public cd1(ae1 ae1Var) {
        this.f31647a = ae1Var;
    }

    @Override
    public void W(float f7, boolean z10) {
        ae1 ae1Var = this.f31647a;
        ae1Var.l1 = f7;
        ae1Var.k1();
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public int k0() {
        return 0;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.f31647a.f30921c;
        if (scroller != null) {
            scroller.abortAnimation();
            return true;
        }
        return true;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        ae1 ae1Var = this.f31647a;
        Scroller scroller = ae1Var.f30921c;
        if (scroller != null) {
            scroller.abortAnimation();
            ae1Var.f30921c.fling((int) ae1Var.X1, 0, Math.round(-f7), Math.round(f10), 0, (int) ae1Var.W1, 0, Integer.MAX_VALUE);
            ae1Var.f30976x0.postInvalidate();
            return true;
        }
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        ae1 ae1Var = this.f31647a;
        Scroller scroller = ae1Var.f30921c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        ae1Var.X1 = Utilities.clamp(ae1Var.X1 + f7, ae1Var.W1, 0.0f);
        ae1Var.V0();
        ae1Var.f30976x0.invalidate();
        return true;
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public void b1() {
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public void y() {
    }
}
