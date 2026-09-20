package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class v80 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.ActionBar.l1 {
    public final int f29027a;
    public final d90 f29028b;

    public v80(d90 d90Var, int i10) {
        this.f29027a = i10;
        this.f29028b = d90Var;
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f29027a) {
            case 0:
                c90 c90Var = this.f29028b.f23537r;
                if (c90Var != null) {
                    c90Var.i();
                    return;
                }
                return;
            default:
                c90 c90Var2 = this.f29028b.f23537r;
                if (c90Var2 != null) {
                    c90Var2.e();
                    return;
                }
                return;
        }
    }

    @Override
    public void o(KeyEvent keyEvent) {
        d90 d90Var = this.f29028b;
        d90Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && d90Var.f23538s.isShowing()) {
            d90Var.f23538s.d(true);
        }
    }
}
