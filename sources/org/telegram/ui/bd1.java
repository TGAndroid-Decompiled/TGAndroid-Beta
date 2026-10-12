package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
public final class bd1 implements org.telegram.ui.Components.pp0, org.telegram.ui.Components.c30 {
    public final zd1 f36141a;

    public bd1(zd1 zd1Var) {
        this.f36141a = zd1Var;
    }

    @Override
    public void X(float f7, boolean z10) {
        zd1 zd1Var = this.f36141a;
        zd1Var.l1 = f7;
        zd1Var.k1();
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public int m0() {
        return 0;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.f36141a.f44741c;
        if (scroller != null) {
            scroller.abortAnimation();
            return true;
        }
        return true;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        zd1 zd1Var = this.f36141a;
        Scroller scroller = zd1Var.f44741c;
        if (scroller != null) {
            scroller.abortAnimation();
            zd1Var.f44741c.fling((int) zd1Var.X1, 0, Math.round(-f7), Math.round(f10), 0, (int) zd1Var.W1, 0, Integer.MAX_VALUE);
            zd1Var.f44797x0.postInvalidate();
            return true;
        }
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        zd1 zd1Var = this.f36141a;
        Scroller scroller = zd1Var.f44741c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        zd1Var.X1 = Utilities.clamp(zd1Var.X1 + f7, zd1Var.W1, 0.0f);
        zd1Var.V0();
        zd1Var.f44797x0.invalidate();
        return true;
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public void X0() {
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public void z() {
    }
}
