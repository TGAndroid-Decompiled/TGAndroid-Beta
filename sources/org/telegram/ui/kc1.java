package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
public final class kc1 implements org.telegram.ui.Components.jo0, org.telegram.ui.Components.k20 {
    public final jd1 f38252a;

    public kc1(jd1 jd1Var) {
        this.f38252a = jd1Var;
    }

    @Override
    public void X(float f10, boolean z4) {
        jd1 jd1Var = this.f38252a;
        jd1Var.f37989i1 = f10;
        jd1Var.k1();
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
        Scroller scroller = this.f38252a.f37968c;
        if (scroller != null) {
            scroller.abortAnimation();
            return true;
        }
        return true;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        jd1 jd1Var = this.f38252a;
        Scroller scroller = jd1Var.f37968c;
        if (scroller != null) {
            scroller.abortAnimation();
            jd1Var.f37968c.fling((int) jd1Var.U1, 0, Math.round(-f10), Math.round(f11), 0, (int) jd1Var.T1, 0, Integer.MAX_VALUE);
            jd1Var.f38013u0.postInvalidate();
            return true;
        }
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        jd1 jd1Var = this.f38252a;
        Scroller scroller = jd1Var.f37968c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        jd1Var.U1 = Utilities.clamp(jd1Var.U1 + f10, jd1Var.T1, 0.0f);
        jd1Var.V0();
        jd1Var.f38013u0.invalidate();
        return true;
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public void A() {
    }

    @Override
    public void X0() {
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
    }
}
