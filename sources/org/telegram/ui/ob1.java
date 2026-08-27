package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;

public final class ob1 implements org.telegram.ui.Components.pn0, org.telegram.ui.Components.w10 {

    public final nc1 f41056a;

    public ob1(nc1 nc1Var) {
        this.f41056a = nc1Var;
    }

    @Override
    public void P(float f10, boolean z10) {
        nc1 nc1Var = this.f41056a;
        nc1Var.f40760h1 = f10;
        nc1Var.k1();
    }

    @Override
    public int a0() {
        return 0;
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.f41056a.f40742c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        return true;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        nc1 nc1Var = this.f41056a;
        Scroller scroller = nc1Var.f40742c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        nc1Var.f40742c.fling((int) nc1Var.T1, 0, Math.round(-f10), Math.round(f11), 0, (int) nc1Var.S1, 0, Integer.MAX_VALUE);
        nc1Var.f40784t0.postInvalidate();
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        nc1 nc1Var = this.f41056a;
        Scroller scroller = nc1Var.f40742c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        nc1Var.T1 = Utilities.clamp(nc1Var.T1 + f10, nc1Var.S1, 0.0f);
        nc1Var.V0();
        nc1Var.f40784t0.invalidate();
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
    public void r() {
    }
}
