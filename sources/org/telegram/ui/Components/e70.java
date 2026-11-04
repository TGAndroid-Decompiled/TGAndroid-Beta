package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class e70 implements org.telegram.ui.ActionBar.p1, org.telegram.ui.ActionBar.d1 {
    public final int f33301a;
    public final m70 f33302b;

    public e70(m70 m70Var, int i3) {
        this.f33301a = i3;
        this.f33302b = m70Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f33301a) {
            case 0:
                l70 l70Var = this.f33302b.f36061r;
                if (l70Var != null) {
                    l70Var.i();
                    return;
                }
                return;
            default:
                l70 l70Var2 = this.f33302b.f36061r;
                if (l70Var2 != null) {
                    l70Var2.d();
                    return;
                }
                return;
        }
    }

    @Override
    public void k(KeyEvent keyEvent) {
        m70 m70Var = this.f33302b;
        m70Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && m70Var.f36062s.isShowing()) {
            m70Var.f36062s.d(true);
        }
    }
}
