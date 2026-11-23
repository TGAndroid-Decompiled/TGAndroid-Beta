package org.telegram.ui.ActionBar;

import android.view.View;
public final class v3 implements Runnable {
    public final int f30096a;
    public final x3 f30097b;

    public v3(x3 x3Var, int i7) {
        this.f30096a = i7;
        this.f30097b = x3Var;
    }

    @Override
    public final void run() {
        switch (this.f30096a) {
            case 0:
                x3 x3Var = this.f30097b;
                View view = x3Var.f30234m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    w3 w3Var = x3Var.f30240s;
                    w3Var.getClass();
                    System.currentTimeMillis();
                    w3Var.f30188c = false;
                    x3Var.f30240s.a();
                    return;
                }
                return;
            default:
                x3 x3Var2 = this.f30097b;
                View view2 = x3Var2.f30234m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    w3 w3Var2 = x3Var2.f30240s;
                    w3Var2.f30187b = false;
                    w3Var2.a();
                    return;
                }
                return;
        }
    }
}
