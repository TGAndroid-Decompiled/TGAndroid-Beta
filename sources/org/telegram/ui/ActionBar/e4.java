package org.telegram.ui.ActionBar;

import android.view.View;
public final class e4 implements Runnable {
    public final int f19440a;
    public final g4 f19441b;

    public e4(g4 g4Var, int i10) {
        this.f19440a = i10;
        this.f19441b = g4Var;
    }

    @Override
    public final void run() {
        switch (this.f19440a) {
            case 0:
                g4 g4Var = this.f19441b;
                View view = g4Var.f19529m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    f4 f4Var = g4Var.f19535s;
                    f4Var.getClass();
                    System.currentTimeMillis();
                    f4Var.f19486c = false;
                    g4Var.f19535s.a();
                    return;
                }
                return;
            default:
                g4 g4Var2 = this.f19441b;
                View view2 = g4Var2.f19529m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    f4 f4Var2 = g4Var2.f19535s;
                    f4Var2.f19485b = false;
                    f4Var2.a();
                    return;
                }
                return;
        }
    }
}
