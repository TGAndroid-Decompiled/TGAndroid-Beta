package org.telegram.ui.ActionBar;

import android.view.View;
public final class f4 implements Runnable {
    public final int f18631a;
    public final h4 f18632b;

    public f4(h4 h4Var, int i10) {
        this.f18631a = i10;
        this.f18632b = h4Var;
    }

    @Override
    public final void run() {
        switch (this.f18631a) {
            case 0:
                h4 h4Var = this.f18632b;
                View view = h4Var.f18719m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    g4 g4Var = h4Var.f18725s;
                    g4Var.getClass();
                    System.currentTimeMillis();
                    g4Var.f18677c = false;
                    h4Var.f18725s.a();
                    return;
                }
                return;
            default:
                h4 h4Var2 = this.f18632b;
                View view2 = h4Var2.f18719m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    g4 g4Var2 = h4Var2.f18725s;
                    g4Var2.f18676b = false;
                    g4Var2.a();
                    return;
                }
                return;
        }
    }
}
