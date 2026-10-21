package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
public final class mb1 implements org.telegram.ui.Components.cp0, org.telegram.ui.Components.r20 {
    public final kc1 f39172a;

    public mb1(kc1 kc1Var) {
        this.f39172a = kc1Var;
    }

    @Override
    public void L(float f7, boolean z10) {
        kc1 kc1Var = this.f39172a;
        kc1Var.l1 = f7;
        kc1Var.k1();
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
        Scroller scroller = this.f39172a.f38524c;
        if (scroller != null) {
            scroller.abortAnimation();
            return true;
        }
        return true;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        kc1 kc1Var = this.f39172a;
        Scroller scroller = kc1Var.f38524c;
        if (scroller != null) {
            scroller.abortAnimation();
            kc1Var.f38524c.fling((int) kc1Var.X1, 0, Math.round(-f7), Math.round(f10), 0, (int) kc1Var.W1, 0, Integer.MAX_VALUE);
            kc1Var.f38579x0.postInvalidate();
            return true;
        }
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        kc1 kc1Var = this.f39172a;
        Scroller scroller = kc1Var.f38524c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        kc1Var.X1 = Utilities.clamp(kc1Var.X1 + f7, kc1Var.W1, 0.0f);
        kc1Var.V0();
        kc1Var.f38579x0.invalidate();
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
