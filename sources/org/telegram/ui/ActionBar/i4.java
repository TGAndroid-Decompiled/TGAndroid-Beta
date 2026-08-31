package org.telegram.ui.ActionBar;

import android.view.View;
public final class i4 implements Runnable {
    public final int f21461a;
    public final k4 f21462b;

    public i4(k4 k4Var, int i10) {
        this.f21461a = i10;
        this.f21462b = k4Var;
    }

    @Override
    public final void run() {
        switch (this.f21461a) {
            case 0:
                k4 k4Var = this.f21462b;
                View view = k4Var.f21591m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    j4 j4Var = k4Var.f21597s;
                    j4Var.getClass();
                    System.currentTimeMillis();
                    j4Var.f21497c = false;
                    k4Var.f21597s.a();
                    return;
                }
                return;
            default:
                k4 k4Var2 = this.f21462b;
                View view2 = k4Var2.f21591m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    j4 j4Var2 = k4Var2.f21597s;
                    j4Var2.f21496b = false;
                    j4Var2.a();
                    return;
                }
                return;
        }
    }
}
