package org.telegram.ui.ActionBar;

import android.view.View;
public final class i4 implements Runnable {
    public final int f17829a;
    public final k4 f17830b;

    public i4(k4 k4Var, int i10) {
        this.f17829a = i10;
        this.f17830b = k4Var;
    }

    @Override
    public final void run() {
        switch (this.f17829a) {
            case 0:
                k4 k4Var = this.f17830b;
                View view = k4Var.f18353m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    j4 j4Var = k4Var.f18359s;
                    j4Var.getClass();
                    System.currentTimeMillis();
                    j4Var.f17860c = false;
                    k4Var.f18359s.a();
                    return;
                }
                return;
            default:
                k4 k4Var2 = this.f17830b;
                View view2 = k4Var2.f18353m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    j4 j4Var2 = k4Var2.f18359s;
                    j4Var2.f17859b = false;
                    j4Var2.a();
                    return;
                }
                return;
        }
    }
}
