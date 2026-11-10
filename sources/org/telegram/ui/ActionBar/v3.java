package org.telegram.ui.ActionBar;

import android.view.View;
public final class v3 implements Runnable {
    public final int f28618a;
    public final x3 f28619b;

    public v3(x3 x3Var, int i7) {
        this.f28618a = i7;
        this.f28619b = x3Var;
    }

    @Override
    public final void run() {
        switch (this.f28618a) {
            case 0:
                x3 x3Var = this.f28619b;
                View view = x3Var.f28758m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    w3 w3Var = x3Var.f28764s;
                    w3Var.getClass();
                    System.currentTimeMillis();
                    w3Var.f28717c = false;
                    x3Var.f28764s.a();
                    return;
                }
                return;
            default:
                x3 x3Var2 = this.f28619b;
                View view2 = x3Var2.f28758m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    w3 w3Var2 = x3Var2.f28764s;
                    w3Var2.f28716b = false;
                    w3Var2.a();
                    return;
                }
                return;
        }
    }
}
