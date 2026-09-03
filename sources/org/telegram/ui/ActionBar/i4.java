package org.telegram.ui.ActionBar;

import android.view.View;
public final class i4 implements Runnable {
    public final int f21463a;
    public final k4 f21464b;

    public i4(k4 k4Var, int i10) {
        this.f21463a = i10;
        this.f21464b = k4Var;
    }

    @Override
    public final void run() {
        switch (this.f21463a) {
            case 0:
                k4 k4Var = this.f21464b;
                View view = k4Var.f21593m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    j4 j4Var = k4Var.f21599s;
                    j4Var.getClass();
                    System.currentTimeMillis();
                    j4Var.f21499c = false;
                    k4Var.f21599s.a();
                    return;
                }
                return;
            default:
                k4 k4Var2 = this.f21464b;
                View view2 = k4Var2.f21593m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    j4 j4Var2 = k4Var2.f21599s;
                    j4Var2.f21498b = false;
                    j4Var2.a();
                    return;
                }
                return;
        }
    }
}
