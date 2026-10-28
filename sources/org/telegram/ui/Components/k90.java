package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class k90 implements org.telegram.ui.ActionBar.b2, org.telegram.ui.ActionBar.m1 {
    public final int f29908a;
    public final s90 f29909b;

    public k90(s90 s90Var, int i10) {
        this.f29908a = i10;
        this.f29909b = s90Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f29908a) {
            case 0:
                r90 r90Var = this.f29909b.f32525r;
                if (r90Var != null) {
                    r90Var.k();
                    return;
                }
                return;
            default:
                r90 r90Var2 = this.f29909b.f32525r;
                if (r90Var2 != null) {
                    r90Var2.d();
                    return;
                }
                return;
        }
    }

    @Override
    public void n(KeyEvent keyEvent) {
        s90 s90Var = this.f29909b;
        s90Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && s90Var.f32526s.isShowing()) {
            s90Var.f32526s.d(true);
        }
    }
}
