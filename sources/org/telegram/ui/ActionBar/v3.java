package org.telegram.ui.ActionBar;

import android.view.View;
public final class v3 implements Runnable {
    public final int f30127a;
    public final x3 f30128b;

    public v3(x3 x3Var, int i7) {
        this.f30127a = i7;
        this.f30128b = x3Var;
    }

    @Override
    public final void run() {
        switch (this.f30127a) {
            case 0:
                x3 x3Var = this.f30128b;
                View view = x3Var.f30265m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    w3 w3Var = x3Var.f30271s;
                    w3Var.getClass();
                    System.currentTimeMillis();
                    w3Var.f30219c = false;
                    x3Var.f30271s.a();
                    return;
                }
                return;
            default:
                x3 x3Var2 = this.f30128b;
                View view2 = x3Var2.f30265m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    w3 w3Var2 = x3Var2.f30271s;
                    w3Var2.f30218b = false;
                    w3Var2.a();
                    return;
                }
                return;
        }
    }
}
