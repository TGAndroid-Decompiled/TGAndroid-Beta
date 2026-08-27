package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;

public final class lo0 implements r0.o, org.telegram.ui.ActionBar.l1 {

    public final int f30434a;

    public final sp0 f30435b;

    public lo0(sp0 sp0Var, int i10) {
        this.f30434a = i10;
        this.f30435b = sp0Var;
    }

    @Override
    public r0.m1 I0(View view, r0.m1 m1Var) {
        WindowInsets windowInsetsG = m1Var.g();
        sp0 sp0Var = this.f30435b;
        sp0Var.processLegacyContainerInsets(windowInsetsG);
        i0.c cVarF = m1Var.f46619a.f(519);
        if (!sp0Var.C0.equals(cVarF)) {
            sp0Var.C0 = cVarF;
            sp0Var.container.requestLayout();
        }
        return r0.m1.f46618b;
    }

    @Override
    public void k(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        org.telegram.ui.ActionBar.n1 n1Var2;
        switch (this.f30434a) {
            case 1:
                sp0 sp0Var = this.f30435b;
                sp0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = sp0Var.F0) != null && n1Var.isShowing()) {
                    sp0Var.F0.d(true);
                    break;
                }
                break;
            default:
                sp0 sp0Var2 = this.f30435b;
                sp0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var2 = sp0Var2.F0) != null && n1Var2.isShowing()) {
                    sp0Var2.F0.d(true);
                    break;
                }
                break;
        }
    }
}
