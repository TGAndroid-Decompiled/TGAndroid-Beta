package org.telegram.ui.ActionBar;

import android.view.View;
public final class b4 implements Runnable {
    public final int f20187a;
    public final d4 f20188b;

    public b4(d4 d4Var, int i10) {
        this.f20187a = i10;
        this.f20188b = d4Var;
    }

    @Override
    public final void run() {
        switch (this.f20187a) {
            case 0:
                d4 d4Var = this.f20188b;
                View view = d4Var.f20262m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    c4 c4Var = d4Var.f20268s;
                    c4Var.getClass();
                    System.currentTimeMillis();
                    c4Var.f20208c = false;
                    d4Var.f20268s.a();
                    return;
                }
                return;
            default:
                d4 d4Var2 = this.f20188b;
                View view2 = d4Var2.f20262m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    c4 c4Var2 = d4Var2.f20268s;
                    c4Var2.f20207b = false;
                    c4Var2.a();
                    return;
                }
                return;
        }
    }
}
