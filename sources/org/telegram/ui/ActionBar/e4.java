package org.telegram.ui.ActionBar;

import android.view.View;
public final class e4 implements Runnable {
    public final int f18853a;
    public final g4 f18854b;

    public e4(g4 g4Var, int i10) {
        this.f18853a = i10;
        this.f18854b = g4Var;
    }

    @Override
    public final void run() {
        switch (this.f18853a) {
            case 0:
                g4 g4Var = this.f18854b;
                View view = g4Var.f18925m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    f4 f4Var = g4Var.f18931s;
                    f4Var.getClass();
                    System.currentTimeMillis();
                    f4Var.f18880c = false;
                    g4Var.f18931s.a();
                    return;
                }
                return;
            default:
                g4 g4Var2 = this.f18854b;
                View view2 = g4Var2.f18925m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    f4 f4Var2 = g4Var2.f18931s;
                    f4Var2.f18879b = false;
                    f4Var2.a();
                    return;
                }
                return;
        }
    }
}
