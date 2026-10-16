package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class a80 implements org.telegram.ui.ActionBar.k1 {
    public final int f23153a;
    public final l80 f23154b;

    public a80(l80 l80Var, int i10) {
        this.f23153a = i10;
        this.f23154b = l80Var;
    }

    @Override
    public final void n(KeyEvent keyEvent) {
        l80 l80Var;
        g80 g80Var;
        l80 l80Var2;
        g80 g80Var2;
        switch (this.f23153a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g80Var = (l80Var = this.f23154b).f26658m) != null && g80Var.isShowing()) {
                    l80Var.u();
                    return;
                }
                return;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g80Var2 = (l80Var2 = this.f23154b).f26658m) != null && g80Var2.isShowing()) {
                    l80Var2.u();
                    return;
                }
                return;
        }
    }
}
