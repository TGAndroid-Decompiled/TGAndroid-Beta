package org.telegram.ui.ActionBar;

import android.view.View;
public final class g4 implements Runnable {
    public final int f18904a;
    public final i4 f18905b;

    public g4(i4 i4Var, int i10) {
        this.f18904a = i10;
        this.f18905b = i4Var;
    }

    @Override
    public final void run() {
        switch (this.f18904a) {
            case 0:
                i4 i4Var = this.f18905b;
                View view = i4Var.f18966m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    h4 h4Var = i4Var.f18972s;
                    h4Var.getClass();
                    System.currentTimeMillis();
                    h4Var.f18922c = false;
                    i4Var.f18972s.a();
                    return;
                }
                return;
            default:
                i4 i4Var2 = this.f18905b;
                View view2 = i4Var2.f18966m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    h4 h4Var2 = i4Var2.f18972s;
                    h4Var2.f18921b = false;
                    h4Var2.a();
                    return;
                }
                return;
        }
    }
}
