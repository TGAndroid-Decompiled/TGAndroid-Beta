package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class j90 implements org.telegram.ui.ActionBar.b2, org.telegram.ui.ActionBar.m1 {
    public final int f29552a;
    public final r90 f29553b;

    public j90(r90 r90Var, int i10) {
        this.f29552a = i10;
        this.f29553b = r90Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f29552a) {
            case 0:
                q90 q90Var = this.f29553b.f32175r;
                if (q90Var != null) {
                    q90Var.k();
                    return;
                }
                return;
            default:
                q90 q90Var2 = this.f29553b.f32175r;
                if (q90Var2 != null) {
                    q90Var2.d();
                    return;
                }
                return;
        }
    }

    @Override
    public void n(KeyEvent keyEvent) {
        r90 r90Var = this.f29553b;
        r90Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && r90Var.f32176s.isShowing()) {
            r90Var.f32176s.d(true);
        }
    }
}
