package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class z50 implements org.telegram.ui.ActionBar.e1 {
    public final int f40910a;
    public final l60 f40911b;

    public z50(l60 l60Var, int i7) {
        this.f40910a = i7;
        this.f40911b = l60Var;
    }

    @Override
    public final void j(KeyEvent keyEvent) {
        l60 l60Var;
        g60 g60Var;
        l60 l60Var2;
        g60 g60Var2;
        switch (this.f40910a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g60Var = (l60Var = this.f40911b).f35607m) != null && g60Var.isShowing()) {
                    l60Var.u();
                    return;
                }
                return;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g60Var2 = (l60Var2 = this.f40911b).f35607m) != null && g60Var2.isShowing()) {
                    l60Var2.u();
                    return;
                }
                return;
        }
    }
}
