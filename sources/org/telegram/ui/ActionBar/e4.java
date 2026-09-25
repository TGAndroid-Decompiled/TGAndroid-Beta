package org.telegram.ui.ActionBar;

import android.view.View;
public final class e4 implements Runnable {
    public final int f18854a;
    public final g4 f18855b;

    public e4(g4 g4Var, int i10) {
        this.f18854a = i10;
        this.f18855b = g4Var;
    }

    @Override
    public final void run() {
        switch (this.f18854a) {
            case 0:
                g4 g4Var = this.f18855b;
                View view = g4Var.f18926m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    f4 f4Var = g4Var.f18932s;
                    f4Var.getClass();
                    System.currentTimeMillis();
                    f4Var.f18881c = false;
                    g4Var.f18932s.a();
                    return;
                }
                return;
            default:
                g4 g4Var2 = this.f18855b;
                View view2 = g4Var2.f18926m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    f4 f4Var2 = g4Var2.f18932s;
                    f4Var2.f18880b = false;
                    f4Var2.a();
                    return;
                }
                return;
        }
    }
}
