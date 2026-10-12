package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class h80 implements org.telegram.ui.ActionBar.k1 {
    public final int f26682a;
    public final s80 f26683b;

    public h80(s80 s80Var, int i10) {
        this.f26682a = i10;
        this.f26683b = s80Var;
    }

    @Override
    public final void o(KeyEvent keyEvent) {
        s80 s80Var;
        n80 n80Var;
        s80 s80Var2;
        n80 n80Var2;
        switch (this.f26682a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n80Var = (s80Var = this.f26683b).f30462m) != null && n80Var.isShowing()) {
                    s80Var.u();
                    return;
                }
                return;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n80Var2 = (s80Var2 = this.f26683b).f30462m) != null && n80Var2.isShowing()) {
                    s80Var2.u();
                    return;
                }
                return;
        }
    }
}
