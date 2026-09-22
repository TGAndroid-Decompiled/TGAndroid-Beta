package org.telegram.ui;

import android.view.KeyEvent;
public final class bq0 implements org.telegram.ui.Components.b5, org.telegram.ui.ActionBar.l1 {
    public final int f32566a;
    public final jq0 f32567b;

    public bq0(jq0 jq0Var, int i10) {
        this.f32566a = i10;
        this.f32567b = jq0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f32566a) {
            case 0:
                jq0 jq0Var = this.f32567b;
                jq0Var.V(jq0Var.f34965b, jq0Var.f34966c, z10, i10);
                jq0Var.finishFragment();
                return;
            default:
                jq0 jq0Var2 = this.f32567b;
                jq0Var2.V(jq0Var2.f34965b, jq0Var2.f34966c, z10, i10);
                jq0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        jq0 jq0Var = this.f32567b;
        jq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = jq0Var.I) != null && n1Var.isShowing()) {
            jq0Var.I.d(true);
        }
    }
}
