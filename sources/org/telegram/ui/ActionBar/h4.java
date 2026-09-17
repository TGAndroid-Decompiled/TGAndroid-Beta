package org.telegram.ui.ActionBar;

import android.view.View;
public final class h4 implements Runnable {
    public final int f18715a;
    public final j4 f18716b;

    public h4(j4 j4Var, int i10) {
        this.f18715a = i10;
        this.f18716b = j4Var;
    }

    @Override
    public final void run() {
        switch (this.f18715a) {
            case 0:
                j4 j4Var = this.f18716b;
                View view = j4Var.f18792m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    i4 i4Var = j4Var.f18798s;
                    i4Var.getClass();
                    System.currentTimeMillis();
                    i4Var.f18751c = false;
                    j4Var.f18798s.a();
                    return;
                }
                return;
            default:
                j4 j4Var2 = this.f18716b;
                View view2 = j4Var2.f18792m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    i4 i4Var2 = j4Var2.f18798s;
                    i4Var2.f18750b = false;
                    i4Var2.a();
                    return;
                }
                return;
        }
    }
}
