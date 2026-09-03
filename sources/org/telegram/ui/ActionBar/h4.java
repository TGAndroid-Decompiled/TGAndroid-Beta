package org.telegram.ui.ActionBar;

import android.view.View;
public final class h4 implements Runnable {
    public final int f19731a;
    public final j4 f19732b;

    public h4(j4 j4Var, int i10) {
        this.f19731a = i10;
        this.f19732b = j4Var;
    }

    @Override
    public final void run() {
        switch (this.f19731a) {
            case 0:
                j4 j4Var = this.f19732b;
                View view = j4Var.f19813m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    i4 i4Var = j4Var.f19819s;
                    i4Var.getClass();
                    System.currentTimeMillis();
                    i4Var.f19775c = false;
                    j4Var.f19819s.a();
                    return;
                }
                return;
            default:
                j4 j4Var2 = this.f19732b;
                View view2 = j4Var2.f19813m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    i4 i4Var2 = j4Var2.f19819s;
                    i4Var2.f19774b = false;
                    i4Var2.a();
                    return;
                }
                return;
        }
    }
}
