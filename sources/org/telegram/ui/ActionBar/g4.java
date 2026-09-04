package org.telegram.ui.ActionBar;

import android.view.View;
public final class g4 implements Runnable {
    public final int f20465a;
    public final i4 f20466b;

    public g4(i4 i4Var, int i10) {
        this.f20465a = i10;
        this.f20466b = i4Var;
    }

    @Override
    public final void run() {
        switch (this.f20465a) {
            case 0:
                i4 i4Var = this.f20466b;
                View view = i4Var.f20533m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    h4 h4Var = i4Var.f20539s;
                    h4Var.getClass();
                    System.currentTimeMillis();
                    h4Var.f20484c = false;
                    i4Var.f20539s.a();
                    return;
                }
                return;
            default:
                i4 i4Var2 = this.f20466b;
                View view2 = i4Var2.f20533m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    h4 h4Var2 = i4Var2.f20539s;
                    h4Var2.f20483b = false;
                    h4Var2.a();
                    return;
                }
                return;
        }
    }
}
