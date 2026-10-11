package org.telegram.ui;

import android.view.KeyEvent;
public final class aq0 implements org.telegram.ui.Components.f5, org.telegram.ui.ActionBar.k1 {
    public final int f36128a;
    public final jq0 f36129b;

    public aq0(jq0 jq0Var, int i10) {
        this.f36128a = i10;
        this.f36129b = jq0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f36128a) {
            case 0:
                jq0 jq0Var = this.f36129b;
                jq0Var.V(jq0Var.f39100b, jq0Var.f39101c, z10, i10);
                jq0Var.finishFragment();
                return;
            default:
                jq0 jq0Var2 = this.f36129b;
                jq0Var2.V(jq0Var2.f39100b, jq0Var2.f39101c, z10, i10);
                jq0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        jq0 jq0Var = this.f36129b;
        jq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = jq0Var.I) != null && m1Var.isShowing()) {
            jq0Var.I.d(true);
        }
    }
}
