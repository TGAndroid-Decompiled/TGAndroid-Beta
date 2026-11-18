package org.telegram.ui;

import android.view.KeyEvent;
public final class mm0 implements org.telegram.ui.Components.z4, org.telegram.ui.ActionBar.f1 {
    public final int f49897a;
    public final qm0 f49898b;

    public mm0(qm0 qm0Var, int i7) {
        this.f49897a = i7;
        this.f49898b = qm0Var;
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        switch (this.f49897a) {
            case 0:
                qm0 qm0Var = this.f49898b;
                qm0Var.a0(qm0Var.f51246b, qm0Var.f51247c, z10, i7);
                qm0Var.finishFragment();
                return;
            default:
                qm0 qm0Var2 = this.f49898b;
                qm0Var2.a0(qm0Var2.f51246b, qm0Var2.f51247c, z10, i7);
                qm0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.h1 h1Var;
        qm0 qm0Var = this.f49898b;
        qm0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (h1Var = qm0Var.J) != null && h1Var.isShowing()) {
            qm0Var.J.d(true);
        }
    }
}
