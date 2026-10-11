package org.telegram.ui.ActionBar;

import android.view.View;
public final class e4 implements Runnable {
    public final int f20570a;
    public final g4 f20571b;

    public e4(g4 g4Var, int i10) {
        this.f20570a = i10;
        this.f20571b = g4Var;
    }

    @Override
    public final void run() {
        switch (this.f20570a) {
            case 0:
                g4 g4Var = this.f20571b;
                View view = g4Var.f20648m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    f4 f4Var = g4Var.f20654s;
                    f4Var.getClass();
                    System.currentTimeMillis();
                    f4Var.f20600c = false;
                    g4Var.f20654s.a();
                    return;
                }
                return;
            default:
                g4 g4Var2 = this.f20571b;
                View view2 = g4Var2.f20648m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    f4 f4Var2 = g4Var2.f20654s;
                    f4Var2.f20599b = false;
                    f4Var2.a();
                    return;
                }
                return;
        }
    }
}
