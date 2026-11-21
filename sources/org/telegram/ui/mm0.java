package org.telegram.ui;

import android.view.KeyEvent;
public final class mm0 implements org.telegram.ui.Components.a5, org.telegram.ui.ActionBar.e1 {
    public final int f49938a;
    public final qm0 f49939b;

    public mm0(qm0 qm0Var, int i7) {
        this.f49938a = i7;
        this.f49939b = qm0Var;
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        switch (this.f49938a) {
            case 0:
                qm0 qm0Var = this.f49939b;
                qm0Var.a0(qm0Var.f51300b, qm0Var.f51301c, z10, i7);
                qm0Var.finishFragment();
                return;
            default:
                qm0 qm0Var2 = this.f49939b;
                qm0Var2.a0(qm0Var2.f51300b, qm0Var2.f51301c, z10, i7);
                qm0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        qm0 qm0Var = this.f49939b;
        qm0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = qm0Var.J) != null && g1Var.isShowing()) {
            qm0Var.J.d(true);
        }
    }
}
