package org.telegram.ui.ActionBar;

import android.view.View;
public final class i4 implements Runnable {
    public final int f20951a;
    public final k4 f20952b;

    public i4(k4 k4Var, int i10) {
        this.f20951a = i10;
        this.f20952b = k4Var;
    }

    @Override
    public final void run() {
        switch (this.f20951a) {
            case 0:
                k4 k4Var = this.f20952b;
                View view = k4Var.f21107m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    j4 j4Var = k4Var.f21113s;
                    j4Var.getClass();
                    System.currentTimeMillis();
                    j4Var.f20995c = false;
                    k4Var.f21113s.a();
                    return;
                }
                return;
            default:
                k4 k4Var2 = this.f20952b;
                View view2 = k4Var2.f21107m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    j4 j4Var2 = k4Var2.f21113s;
                    j4Var2.f20994b = false;
                    j4Var2.a();
                    return;
                }
                return;
        }
    }
}
