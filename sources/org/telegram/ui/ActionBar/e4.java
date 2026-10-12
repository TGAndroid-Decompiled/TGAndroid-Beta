package org.telegram.ui.ActionBar;

import android.view.View;
public final class e4 implements Runnable {
    public final int f20343a;
    public final g4 f20344b;

    public e4(g4 g4Var, int i10) {
        this.f20343a = i10;
        this.f20344b = g4Var;
    }

    @Override
    public final void run() {
        switch (this.f20343a) {
            case 0:
                g4 g4Var = this.f20344b;
                View view = g4Var.f20421m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    f4 f4Var = g4Var.f20427s;
                    f4Var.getClass();
                    System.currentTimeMillis();
                    f4Var.f20393c = false;
                    g4Var.f20427s.a();
                    return;
                }
                return;
            default:
                g4 g4Var2 = this.f20344b;
                View view2 = g4Var2.f20421m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    f4 f4Var2 = g4Var2.f20427s;
                    f4Var2.f20392b = false;
                    f4Var2.a();
                    return;
                }
                return;
        }
    }
}
