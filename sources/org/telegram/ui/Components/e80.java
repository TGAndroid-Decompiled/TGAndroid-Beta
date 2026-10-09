package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class e80 implements org.telegram.ui.ActionBar.l1 {
    public final int f25987a;
    public final p80 f25988b;

    public e80(p80 p80Var, int i10) {
        this.f25987a = i10;
        this.f25988b = p80Var;
    }

    @Override
    public final void o(KeyEvent keyEvent) {
        p80 p80Var;
        k80 k80Var;
        p80 p80Var2;
        k80 k80Var2;
        switch (this.f25987a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (k80Var = (p80Var = this.f25988b).f29779m) != null && k80Var.isShowing()) {
                    p80Var.u();
                    return;
                }
                return;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (k80Var2 = (p80Var2 = this.f25988b).f29779m) != null && k80Var2.isShowing()) {
                    p80Var2.u();
                    return;
                }
                return;
        }
    }
}
