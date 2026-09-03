package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class p80 implements org.telegram.ui.ActionBar.c2, org.telegram.ui.ActionBar.n1 {
    public final int f27798a;
    public final x80 f27799b;

    public p80(x80 x80Var, int i10) {
        this.f27798a = i10;
        this.f27799b = x80Var;
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f27798a) {
            case 0:
                w80 w80Var = this.f27799b.f30538r;
                if (w80Var != null) {
                    w80Var.h();
                    return;
                }
                return;
            default:
                w80 w80Var2 = this.f27799b.f30538r;
                if (w80Var2 != null) {
                    w80Var2.c();
                    return;
                }
                return;
        }
    }

    @Override
    public void n(KeyEvent keyEvent) {
        x80 x80Var = this.f27799b;
        x80Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && x80Var.f30539s.isShowing()) {
            x80Var.f30539s.d(true);
        }
    }
}
