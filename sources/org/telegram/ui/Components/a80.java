package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class a80 implements org.telegram.ui.ActionBar.m1 {
    public final int f26455a;
    public final l80 f26456b;

    public a80(l80 l80Var, int i10) {
        this.f26455a = i10;
        this.f26456b = l80Var;
    }

    @Override
    public final void n(KeyEvent keyEvent) {
        l80 l80Var;
        g80 g80Var;
        l80 l80Var2;
        g80 g80Var2;
        switch (this.f26455a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g80Var = (l80Var = this.f26456b).f30158m) != null && g80Var.isShowing()) {
                    l80Var.u();
                    return;
                }
                return;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g80Var2 = (l80Var2 = this.f26456b).f30158m) != null && g80Var2.isShowing()) {
                    l80Var2.u();
                    return;
                }
                return;
        }
    }
}
