package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
public final class cq0 implements r0.o, org.telegram.ui.ActionBar.k1 {
    public final int f24189a;
    public final jr0 f24190b;

    public cq0(jr0 jr0Var, int i10) {
        this.f24189a = i10;
        this.f24190b = jr0Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        WindowInsets g10 = l1Var.g();
        jr0 jr0Var = this.f24190b;
        jr0Var.processLegacyContainerInsets(g10);
        i0.b f7 = l1Var.f43741a.f(519);
        if (!jr0Var.G0.equals(f7)) {
            jr0Var.G0 = f7;
            jr0Var.container.requestLayout();
        }
        return r0.l1.f43740b;
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        org.telegram.ui.ActionBar.m1 m1Var2;
        switch (this.f24189a) {
            case 1:
                jr0 jr0Var = this.f24190b;
                jr0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = jr0Var.J0) != null && m1Var.isShowing()) {
                    jr0Var.J0.d(true);
                    return;
                }
                return;
            default:
                jr0 jr0Var2 = this.f24190b;
                jr0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var2 = jr0Var2.J0) != null && m1Var2.isShowing()) {
                    jr0Var2.J0.d(true);
                    return;
                }
                return;
        }
    }
}
