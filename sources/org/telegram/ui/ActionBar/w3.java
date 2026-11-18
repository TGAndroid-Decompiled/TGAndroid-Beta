package org.telegram.ui.ActionBar;

import android.view.View;
public final class w3 implements Runnable {
    public final int f30144a;
    public final y3 f30145b;

    public w3(y3 y3Var, int i7) {
        this.f30144a = i7;
        this.f30145b = y3Var;
    }

    @Override
    public final void run() {
        switch (this.f30144a) {
            case 0:
                y3 y3Var = this.f30145b;
                View view = y3Var.f30282m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    x3 x3Var = y3Var.f30288s;
                    x3Var.getClass();
                    System.currentTimeMillis();
                    x3Var.f30236c = false;
                    y3Var.f30288s.a();
                    return;
                }
                return;
            default:
                y3 y3Var2 = this.f30145b;
                View view2 = y3Var2.f30282m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    x3 x3Var2 = y3Var2.f30288s;
                    x3Var2.f30235b = false;
                    x3Var2.a();
                    return;
                }
                return;
        }
    }
}
