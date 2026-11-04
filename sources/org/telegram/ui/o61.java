package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
public final class o61 implements org.telegram.ui.Components.om0, org.telegram.ui.Components.u00 {
    public final l71 f48209a;

    public o61(l71 l71Var) {
        this.f48209a = l71Var;
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public void k(boolean z10, float f10) {
        l71 l71Var = this.f48209a;
        l71Var.f47182n1 = f10;
        l71Var.p1();
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.f48209a.f47149c;
        if (scroller != null) {
            scroller.abortAnimation();
            return true;
        }
        return true;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        l71 l71Var = this.f48209a;
        Scroller scroller = l71Var.f47149c;
        if (scroller != null) {
            scroller.abortAnimation();
            l71Var.f47149c.fling((int) l71Var.Z1, 0, Math.round(-f10), Math.round(f11), 0, (int) l71Var.Y1, 0, Integer.MAX_VALUE);
            l71Var.f47210z0.postInvalidate();
            return true;
        }
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        l71 l71Var = this.f48209a;
        Scroller scroller = l71Var.f47149c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        l71Var.Z1 = Utilities.i(l71Var.Z1 + f10, l71Var.Y1, 0.0f);
        l71Var.a1();
        l71Var.f47210z0.invalidate();
        return true;
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public int q0() {
        return 0;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public void D() {
    }

    @Override
    public void a1() {
    }
}
