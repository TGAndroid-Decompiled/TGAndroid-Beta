package org.telegram.ui.ActionBar;

import android.view.View;
public final class i4 implements Runnable {
    public final int f20950a;
    public final k4 f20951b;

    public i4(k4 k4Var, int i10) {
        this.f20950a = i10;
        this.f20951b = k4Var;
    }

    @Override
    public final void run() {
        switch (this.f20950a) {
            case 0:
                k4 k4Var = this.f20951b;
                View view = k4Var.f21106m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    j4 j4Var = k4Var.f21112s;
                    j4Var.getClass();
                    System.currentTimeMillis();
                    j4Var.f20994c = false;
                    k4Var.f21112s.a();
                    return;
                }
                return;
            default:
                k4 k4Var2 = this.f20951b;
                View view2 = k4Var2.f21106m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    j4 j4Var2 = k4Var2.f21112s;
                    j4Var2.f20993b = false;
                    j4Var2.a();
                    return;
                }
                return;
        }
    }
}
