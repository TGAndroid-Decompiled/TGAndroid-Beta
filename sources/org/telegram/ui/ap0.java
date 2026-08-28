package org.telegram.ui;

import android.view.KeyEvent;
public final class ap0 implements org.telegram.ui.Components.x4, org.telegram.ui.ActionBar.m1 {
    public final int f36533a;
    public final ip0 f36534b;

    public ap0(ip0 ip0Var, int i9) {
        this.f36533a = i9;
        this.f36534b = ip0Var;
    }

    @Override
    public void B(int i9, int i10, boolean z10) {
        switch (this.f36533a) {
            case 0:
                ip0 ip0Var = this.f36534b;
                ip0Var.U(ip0Var.f39240b, ip0Var.f39241c, z10, i9);
                ip0Var.finishFragment();
                return;
            default:
                ip0 ip0Var2 = this.f36534b;
                ip0Var2.U(ip0Var2.f39240b, ip0Var2.f39241c, z10, i9);
                ip0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void k(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        ip0 ip0Var = this.f36534b;
        ip0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = ip0Var.E) != null && o1Var.isShowing()) {
            ip0Var.E.d(true);
        }
    }
}
