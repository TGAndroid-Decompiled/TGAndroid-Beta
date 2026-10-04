package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class b90 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.ActionBar.l1 {
    public final int f24867a;
    public final j90 f24868b;

    public b90(j90 j90Var, int i10) {
        this.f24867a = i10;
        this.f24868b = j90Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f24867a) {
            case 0:
                i90 i90Var = this.f24868b.f27689r;
                if (i90Var != null) {
                    i90Var.i();
                    return;
                }
                return;
            default:
                i90 i90Var2 = this.f24868b.f27689r;
                if (i90Var2 != null) {
                    i90Var2.c();
                    return;
                }
                return;
        }
    }

    @Override
    public void o(KeyEvent keyEvent) {
        j90 j90Var = this.f24868b;
        j90Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && j90Var.f27690s.isShowing()) {
            j90Var.f27690s.d(true);
        }
    }
}
