package org.telegram.ui.ActionBar;

import android.view.View;
public final class h4 implements Runnable {
    public final int f19756a;
    public final j4 f19757b;

    public h4(j4 j4Var, int i10) {
        this.f19756a = i10;
        this.f19757b = j4Var;
    }

    @Override
    public final void run() {
        switch (this.f19756a) {
            case 0:
                j4 j4Var = this.f19757b;
                View view = j4Var.f19838m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    i4 i4Var = j4Var.f19844s;
                    i4Var.getClass();
                    System.currentTimeMillis();
                    i4Var.f19800c = false;
                    j4Var.f19844s.a();
                    return;
                }
                return;
            default:
                j4 j4Var2 = this.f19757b;
                View view2 = j4Var2.f19838m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    i4 i4Var2 = j4Var2.f19844s;
                    i4Var2.f19799b = false;
                    i4Var2.a();
                    return;
                }
                return;
        }
    }
}
