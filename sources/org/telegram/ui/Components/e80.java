package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class e80 implements org.telegram.ui.ActionBar.k1 {
    public final int f26015a;
    public final p80 f26016b;

    public e80(p80 p80Var, int i10) {
        this.f26015a = i10;
        this.f26016b = p80Var;
    }

    @Override
    public final void o(KeyEvent keyEvent) {
        p80 p80Var;
        k80 k80Var;
        p80 p80Var2;
        k80 k80Var2;
        switch (this.f26015a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (k80Var = (p80Var = this.f26016b).f29769m) != null && k80Var.isShowing()) {
                    p80Var.u();
                    return;
                }
                return;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (k80Var2 = (p80Var2 = this.f26016b).f29769m) != null && k80Var2.isShowing()) {
                    p80Var2.u();
                    return;
                }
                return;
        }
    }
}
