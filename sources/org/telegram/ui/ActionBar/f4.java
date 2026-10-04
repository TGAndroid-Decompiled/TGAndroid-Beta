package org.telegram.ui.ActionBar;

import android.view.View;
public final class f4 implements Runnable {
    public final int f20605a;
    public final h4 f20606b;

    public f4(h4 h4Var, int i10) {
        this.f20605a = i10;
        this.f20606b = h4Var;
    }

    @Override
    public final void run() {
        switch (this.f20605a) {
            case 0:
                h4 h4Var = this.f20606b;
                View view = h4Var.f20681m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    g4 g4Var = h4Var.f20687s;
                    g4Var.getClass();
                    System.currentTimeMillis();
                    g4Var.f20654c = false;
                    h4Var.f20687s.a();
                    return;
                }
                return;
            default:
                h4 h4Var2 = this.f20606b;
                View view2 = h4Var2.f20681m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    g4 g4Var2 = h4Var2.f20687s;
                    g4Var2.f20653b = false;
                    g4Var2.a();
                    return;
                }
                return;
        }
    }
}
