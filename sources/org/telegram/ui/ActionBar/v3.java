package org.telegram.ui.ActionBar;

import android.view.View;
public final class v3 implements Runnable {
    public final int f30190a;
    public final x3 f30191b;

    public v3(x3 x3Var, int i7) {
        this.f30190a = i7;
        this.f30191b = x3Var;
    }

    @Override
    public final void run() {
        switch (this.f30190a) {
            case 0:
                x3 x3Var = this.f30191b;
                View view = x3Var.f30327m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    w3 w3Var = x3Var.f30333s;
                    w3Var.getClass();
                    System.currentTimeMillis();
                    w3Var.f30272c = false;
                    x3Var.f30333s.a();
                    return;
                }
                return;
            default:
                x3 x3Var2 = this.f30191b;
                View view2 = x3Var2.f30327m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    w3 w3Var2 = x3Var2.f30333s;
                    w3Var2.f30271b = false;
                    w3Var2.a();
                    return;
                }
                return;
        }
    }
}
