package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
public final class gp0 implements r0.o, org.telegram.ui.ActionBar.n1 {
    public final int f27245a;
    public final mq0 f27246b;

    public gp0(mq0 mq0Var, int i10) {
        this.f27245a = i10;
        this.f27246b = mq0Var;
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        WindowInsets g10 = m1Var.g();
        mq0 mq0Var = this.f27246b;
        mq0Var.processLegacyContainerInsets(g10);
        i0.b f10 = m1Var.f46452a.f(519);
        if (!mq0Var.D0.equals(f10)) {
            mq0Var.D0 = f10;
            mq0Var.container.requestLayout();
        }
        return r0.m1.f46451b;
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.p1 p1Var;
        org.telegram.ui.ActionBar.p1 p1Var2;
        switch (this.f27245a) {
            case 1:
                mq0 mq0Var = this.f27246b;
                mq0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (p1Var = mq0Var.G0) != null && p1Var.isShowing()) {
                    mq0Var.G0.d(true);
                    return;
                }
                return;
            default:
                mq0 mq0Var2 = this.f27246b;
                mq0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (p1Var2 = mq0Var2.G0) != null && p1Var2.isShowing()) {
                    mq0Var2.G0.d(true);
                    return;
                }
                return;
        }
    }
}
