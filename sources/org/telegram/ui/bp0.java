package org.telegram.ui;

import android.view.KeyEvent;

public final class bp0 implements org.telegram.ui.Components.x4, org.telegram.ui.ActionBar.l1 {

    public final int f36863a;

    public final jp0 f36864b;

    public bp0(jp0 jp0Var, int i10) {
        this.f36863a = i10;
        this.f36864b = jp0Var;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        switch (this.f36863a) {
            case 0:
                jp0 jp0Var = this.f36864b;
                jp0Var.V(jp0Var.f39462b, jp0Var.f39463c, z10, i10);
                jp0Var.finishFragment();
                break;
            default:
                jp0 jp0Var2 = this.f36864b;
                jp0Var2.V(jp0Var2.f39462b, jp0Var2.f39463c, z10, i10);
                jp0Var2.finishFragment();
                break;
        }
    }

    @Override
    public void k(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        jp0 jp0Var = this.f36864b;
        jp0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = jp0Var.E) != null && n1Var.isShowing()) {
            jp0Var.E.d(true);
        }
    }
}
