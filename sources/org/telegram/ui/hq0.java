package org.telegram.ui;

import android.view.KeyEvent;
public final class hq0 implements org.telegram.ui.Components.f5, org.telegram.ui.ActionBar.k1 {
    public final int f36907a;
    public final qq0 f36908b;

    public hq0(qq0 qq0Var, int i10) {
        this.f36907a = i10;
        this.f36908b = qq0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f36907a) {
            case 0:
                qq0 qq0Var = this.f36908b;
                qq0Var.V(qq0Var.f39517b, qq0Var.f39518c, z10, i10);
                qq0Var.finishFragment();
                return;
            default:
                qq0 qq0Var2 = this.f36908b;
                qq0Var2.V(qq0Var2.f39517b, qq0Var2.f39518c, z10, i10);
                qq0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        qq0 qq0Var = this.f36908b;
        qq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = qq0Var.I) != null && m1Var.isShowing()) {
            qq0Var.I.d(true);
        }
    }
}
