package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
public final class cq0 implements r0.n, org.telegram.ui.ActionBar.k1 {
    public final int f23874a;
    public final ir0 f23875b;

    public cq0(ir0 ir0Var, int i10) {
        this.f23874a = i10;
        this.f23875b = ir0Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        WindowInsets g10 = l1Var.g();
        ir0 ir0Var = this.f23875b;
        ir0Var.processLegacyContainerInsets(g10);
        i0.b f7 = l1Var.f43497a.f(519);
        if (!ir0Var.G0.equals(f7)) {
            ir0Var.G0 = f7;
            ir0Var.container.requestLayout();
        }
        return r0.l1.f43496b;
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        org.telegram.ui.ActionBar.m1 m1Var2;
        switch (this.f23874a) {
            case 1:
                ir0 ir0Var = this.f23875b;
                ir0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = ir0Var.J0) != null && m1Var.isShowing()) {
                    ir0Var.J0.d(true);
                    return;
                }
                return;
            default:
                ir0 ir0Var2 = this.f23875b;
                ir0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var2 = ir0Var2.J0) != null && m1Var2.isShowing()) {
                    ir0Var2.J0.d(true);
                    return;
                }
                return;
        }
    }
}
