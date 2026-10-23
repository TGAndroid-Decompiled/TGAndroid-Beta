package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class i90 implements org.telegram.ui.ActionBar.z1, org.telegram.ui.ActionBar.k1 {
    public final int f27249a;
    public final r90 f27250b;

    public i90(r90 r90Var, int i10) {
        this.f27249a = i10;
        this.f27250b = r90Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f27249a) {
            case 0:
                q90 q90Var = this.f27250b.f30128r;
                if (q90Var != null) {
                    q90Var.k();
                    return;
                }
                return;
            default:
                q90 q90Var2 = this.f27250b.f30128r;
                if (q90Var2 != null) {
                    q90Var2.c();
                    return;
                }
                return;
        }
    }

    @Override
    public void j(KeyEvent keyEvent) {
        r90 r90Var = this.f27250b;
        r90Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && r90Var.f30129s.isShowing()) {
            r90Var.f30129s.d(true);
        }
    }
}
