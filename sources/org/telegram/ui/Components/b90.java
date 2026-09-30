package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class b90 implements org.telegram.ui.ActionBar.z1, org.telegram.ui.ActionBar.k1 {
    public final int f22887a;
    public final j90 f22888b;

    public b90(j90 j90Var, int i10) {
        this.f22887a = i10;
        this.f22888b = j90Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f22887a) {
            case 0:
                i90 i90Var = this.f22888b.f25375r;
                if (i90Var != null) {
                    i90Var.k();
                    return;
                }
                return;
            default:
                i90 i90Var2 = this.f22888b.f25375r;
                if (i90Var2 != null) {
                    i90Var2.e();
                    return;
                }
                return;
        }
    }

    @Override
    public void p(KeyEvent keyEvent) {
        j90 j90Var = this.f22888b;
        j90Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && j90Var.f25376s.isShowing()) {
            j90Var.f25376s.d(true);
        }
    }
}
