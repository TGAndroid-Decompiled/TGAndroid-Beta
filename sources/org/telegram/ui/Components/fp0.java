package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
public final class fp0 implements r0.o, org.telegram.ui.ActionBar.n1 {
    public final int f26972a;
    public final lq0 f26973b;

    public fp0(lq0 lq0Var, int i10) {
        this.f26972a = i10;
        this.f26973b = lq0Var;
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        WindowInsets g10 = m1Var.g();
        lq0 lq0Var = this.f26973b;
        lq0Var.processLegacyContainerInsets(g10);
        i0.b f10 = m1Var.f46483a.f(519);
        if (!lq0Var.D0.equals(f10)) {
            lq0Var.D0 = f10;
            lq0Var.container.requestLayout();
        }
        return r0.m1.f46482b;
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.p1 p1Var;
        org.telegram.ui.ActionBar.p1 p1Var2;
        switch (this.f26972a) {
            case 1:
                lq0 lq0Var = this.f26973b;
                lq0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (p1Var = lq0Var.G0) != null && p1Var.isShowing()) {
                    lq0Var.G0.d(true);
                    return;
                }
                return;
            default:
                lq0 lq0Var2 = this.f26973b;
                lq0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (p1Var2 = lq0Var2.G0) != null && p1Var2.isShowing()) {
                    lq0Var2.G0.d(true);
                    return;
                }
                return;
        }
    }
}
