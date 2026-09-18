package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class w80 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.ActionBar.l1 {
    public final int f29957a;
    public final e90 f29958b;

    public w80(e90 e90Var, int i10) {
        this.f29957a = i10;
        this.f29958b = e90Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f29957a) {
            case 0:
                d90 d90Var = this.f29958b.f23828r;
                if (d90Var != null) {
                    d90Var.k();
                    return;
                }
                return;
            default:
                d90 d90Var2 = this.f29958b.f23828r;
                if (d90Var2 != null) {
                    d90Var2.e();
                    return;
                }
                return;
        }
    }

    @Override
    public void p(KeyEvent keyEvent) {
        e90 e90Var = this.f29958b;
        e90Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && e90Var.f23829s.isShowing()) {
            e90Var.f23829s.d(true);
        }
    }
}
