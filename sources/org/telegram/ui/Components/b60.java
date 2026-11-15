package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class b60 implements org.telegram.ui.ActionBar.e1 {
    public final int f33208a;
    public final m60 f33209b;

    public b60(m60 m60Var, int i7) {
        this.f33208a = i7;
        this.f33209b = m60Var;
    }

    @Override
    public final void j(KeyEvent keyEvent) {
        m60 m60Var;
        i60 i60Var;
        m60 m60Var2;
        i60 i60Var2;
        switch (this.f33208a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (i60Var = (m60Var = this.f33209b).f37101m) != null && i60Var.isShowing()) {
                    m60Var.u();
                    return;
                }
                return;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (i60Var2 = (m60Var2 = this.f33209b).f37101m) != null && i60Var2.isShowing()) {
                    m60Var2.u();
                    return;
                }
                return;
        }
    }
}
