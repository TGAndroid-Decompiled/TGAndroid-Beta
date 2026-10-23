package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
public final class cq0 implements r0.n, org.telegram.ui.ActionBar.k1 {
    public final int f25405a;
    public final ir0 f25406b;

    public cq0(ir0 ir0Var, int i10) {
        this.f25405a = i10;
        this.f25406b = ir0Var;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        WindowInsets g10 = k1Var.g();
        ir0 ir0Var = this.f25406b;
        ir0Var.processLegacyContainerInsets(g10);
        i0.b f7 = k1Var.f45251a.f(519);
        if (!ir0Var.H0.equals(f7)) {
            ir0Var.H0 = f7;
            ir0Var.container.requestLayout();
        }
        return r0.k1.f45250b;
    }

    @Override
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        org.telegram.ui.ActionBar.m1 m1Var2;
        switch (this.f25405a) {
            case 1:
                ir0 ir0Var = this.f25406b;
                ir0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = ir0Var.K0) != null && m1Var.isShowing()) {
                    ir0Var.K0.d(true);
                    return;
                }
                return;
            default:
                ir0 ir0Var2 = this.f25406b;
                ir0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var2 = ir0Var2.K0) != null && m1Var2.isShowing()) {
                    ir0Var2.K0.d(true);
                    return;
                }
                return;
        }
    }
}
