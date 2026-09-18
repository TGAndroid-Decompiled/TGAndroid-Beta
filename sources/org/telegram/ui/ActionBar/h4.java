package org.telegram.ui.ActionBar;

import android.view.View;
public final class h4 implements Runnable {
    public final int f18716a;
    public final j4 f18717b;

    public h4(j4 j4Var, int i10) {
        this.f18716a = i10;
        this.f18717b = j4Var;
    }

    @Override
    public final void run() {
        switch (this.f18716a) {
            case 0:
                j4 j4Var = this.f18717b;
                View view = j4Var.f18793m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    i4 i4Var = j4Var.f18799s;
                    i4Var.getClass();
                    System.currentTimeMillis();
                    i4Var.f18752c = false;
                    j4Var.f18799s.a();
                    return;
                }
                return;
            default:
                j4 j4Var2 = this.f18717b;
                View view2 = j4Var2.f18793m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    i4 i4Var2 = j4Var2.f18799s;
                    i4Var2.f18751b = false;
                    i4Var2.a();
                    return;
                }
                return;
        }
    }
}
