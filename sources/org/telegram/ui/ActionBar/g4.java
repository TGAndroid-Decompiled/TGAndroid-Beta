package org.telegram.ui.ActionBar;

import android.view.View;
public final class g4 implements Runnable {
    public final int f18872a;
    public final i4 f18873b;

    public g4(i4 i4Var, int i10) {
        this.f18872a = i10;
        this.f18873b = i4Var;
    }

    @Override
    public final void run() {
        switch (this.f18872a) {
            case 0:
                i4 i4Var = this.f18873b;
                View view = i4Var.f18934m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    h4 h4Var = i4Var.f18940s;
                    h4Var.getClass();
                    System.currentTimeMillis();
                    h4Var.f18909c = false;
                    i4Var.f18940s.a();
                    return;
                }
                return;
            default:
                i4 i4Var2 = this.f18873b;
                View view2 = i4Var2.f18934m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    h4 h4Var2 = i4Var2.f18940s;
                    h4Var2.f18908b = false;
                    h4Var2.a();
                    return;
                }
                return;
        }
    }
}
