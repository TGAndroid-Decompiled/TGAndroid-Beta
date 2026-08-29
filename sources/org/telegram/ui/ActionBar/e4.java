package org.telegram.ui.ActionBar;

import android.view.View;
public final class e4 implements Runnable {
    public final int f22896a;
    public final g4 f22897b;

    public e4(g4 g4Var, int i10) {
        this.f22896a = i10;
        this.f22897b = g4Var;
    }

    @Override
    public final void run() {
        switch (this.f22896a) {
            case 0:
                g4 g4Var = this.f22897b;
                View view = g4Var.f22995m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    f4 f4Var = g4Var.f23001s;
                    f4Var.getClass();
                    System.currentTimeMillis();
                    f4Var.f22935c = false;
                    g4Var.f23001s.a();
                    return;
                }
                return;
            default:
                g4 g4Var2 = this.f22897b;
                View view2 = g4Var2.f22995m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    f4 f4Var2 = g4Var2.f23001s;
                    f4Var2.f22934b = false;
                    f4Var2.a();
                    return;
                }
                return;
        }
    }
}
