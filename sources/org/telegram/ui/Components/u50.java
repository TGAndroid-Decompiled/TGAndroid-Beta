package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class u50 implements org.telegram.ui.ActionBar.d1 {
    public final int f38652a;
    public final f60 f38653b;

    public u50(f60 f60Var, int i3) {
        this.f38652a = i3;
        this.f38653b = f60Var;
    }

    @Override
    public final void k(KeyEvent keyEvent) {
        f60 f60Var;
        b60 b60Var;
        f60 f60Var2;
        b60 b60Var2;
        switch (this.f38652a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (b60Var = (f60Var = this.f38653b).f33737m) != null && b60Var.isShowing()) {
                    f60Var.u();
                    return;
                }
                return;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (b60Var2 = (f60Var2 = this.f38653b).f33737m) != null && b60Var2.isShowing()) {
                    f60Var2.u();
                    return;
                }
                return;
        }
    }
}
