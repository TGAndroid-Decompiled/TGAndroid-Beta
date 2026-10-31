package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
public final class p81 implements org.telegram.ui.Components.mn0, org.telegram.ui.Components.o10 {
    public final m91 f40536a;

    public p81(m91 m91Var) {
        this.f40536a = m91Var;
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public void k(boolean z10, float f7) {
        m91 m91Var = this.f40536a;
        m91Var.f39574m1 = f7;
        m91Var.o1();
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.f40536a.f39544c;
        if (scroller != null) {
            scroller.abortAnimation();
            return true;
        }
        return true;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        m91 m91Var = this.f40536a;
        Scroller scroller = m91Var.f39544c;
        if (scroller != null) {
            scroller.abortAnimation();
            m91Var.f39544c.fling((int) m91Var.Y1, 0, Math.round(-f7), Math.round(f10), 0, (int) m91Var.X1, 0, Integer.MAX_VALUE);
            m91Var.f39603y0.postInvalidate();
            return true;
        }
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        m91 m91Var = this.f40536a;
        Scroller scroller = m91Var.f39544c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        m91Var.Y1 = Utilities.i(m91Var.Y1 + f7, m91Var.X1, 0.0f);
        m91Var.Z0();
        m91Var.f39603y0.invalidate();
        return true;
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public int p0() {
        return 0;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public void C() {
    }

    @Override
    public void e1() {
    }
}
