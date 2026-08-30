package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
public final class ec1 implements org.telegram.ui.Components.jo0, org.telegram.ui.Components.j20 {
    public final cd1 f33989a;

    public ec1(cd1 cd1Var) {
        this.f33989a = cd1Var;
    }

    @Override
    public void Y(float f10, boolean z4) {
        cd1 cd1Var = this.f33989a;
        cd1Var.f33314i1 = f10;
        cd1Var.k1();
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public int j0() {
        return 0;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.f33989a.f33294c;
        if (scroller != null) {
            scroller.abortAnimation();
            return true;
        }
        return true;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        cd1 cd1Var = this.f33989a;
        Scroller scroller = cd1Var.f33294c;
        if (scroller != null) {
            scroller.abortAnimation();
            cd1Var.f33294c.fling((int) cd1Var.U1, 0, Math.round(-f10), Math.round(f11), 0, (int) cd1Var.T1, 0, Integer.MAX_VALUE);
            cd1Var.f33338u0.postInvalidate();
            return true;
        }
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        cd1 cd1Var = this.f33989a;
        Scroller scroller = cd1Var.f33294c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        cd1Var.U1 = Utilities.clamp(cd1Var.U1 + f10, cd1Var.T1, 0.0f);
        cd1Var.V0();
        cd1Var.f33338u0.invalidate();
        return true;
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public void B() {
    }

    @Override
    public void c1() {
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
    }
}
