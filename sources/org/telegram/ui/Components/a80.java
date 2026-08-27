package org.telegram.ui.Components;

import android.view.KeyEvent;

public final class a80 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.ActionBar.l1 {

    public final int f26658a;

    public final i80 f26659b;

    public a80(i80 i80Var, int i10) {
        this.f26658a = i10;
        this.f26659b = i80Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f26658a) {
            case 0:
                h80 h80Var = this.f26659b.f29275r;
                if (h80Var != null) {
                    h80Var.k();
                }
                break;
            default:
                h80 h80Var2 = this.f26659b.f29275r;
                if (h80Var2 != null) {
                    h80Var2.c();
                }
                break;
        }
    }

    @Override
    public void k(KeyEvent keyEvent) {
        i80 i80Var = this.f26659b;
        i80Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && i80Var.f29276s.isShowing()) {
            i80Var.f29276s.d(true);
        }
    }
}
