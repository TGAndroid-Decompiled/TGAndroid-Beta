package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
public final class vo0 implements r0.o, org.telegram.ui.ActionBar.m1 {
    public final int f33599a;
    public final dq0 f33600b;

    public vo0(dq0 dq0Var, int i10) {
        this.f33599a = i10;
        this.f33600b = dq0Var;
    }

    @Override
    public r0.m1 I0(View view, r0.m1 m1Var) {
        WindowInsets g10 = m1Var.g();
        dq0 dq0Var = this.f33600b;
        dq0Var.processLegacyContainerInsets(g10);
        i0.b f9 = m1Var.f46843a.f(519);
        if (!dq0Var.C0.equals(f9)) {
            dq0Var.C0 = f9;
            dq0Var.container.requestLayout();
        }
        return r0.m1.f46842b;
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        org.telegram.ui.ActionBar.o1 o1Var2;
        switch (this.f33599a) {
            case 1:
                dq0 dq0Var = this.f33600b;
                dq0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = dq0Var.F0) != null && o1Var.isShowing()) {
                    dq0Var.F0.d(true);
                    return;
                }
                return;
            default:
                dq0 dq0Var2 = this.f33600b;
                dq0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var2 = dq0Var2.F0) != null && o1Var2.isShowing()) {
                    dq0Var2.F0.d(true);
                    return;
                }
                return;
        }
    }
}
