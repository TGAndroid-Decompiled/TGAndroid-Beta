package org.telegram.ui.ActionBar;

import android.view.View;
public final class e4 implements Runnable {
    public final int f19740a;
    public final g4 f19741b;

    public e4(g4 g4Var, int i10) {
        this.f19740a = i10;
        this.f19741b = g4Var;
    }

    @Override
    public final void run() {
        switch (this.f19740a) {
            case 0:
                g4 g4Var = this.f19741b;
                View view = g4Var.f19829m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    f4 f4Var = g4Var.f19835s;
                    f4Var.getClass();
                    System.currentTimeMillis();
                    f4Var.f19786c = false;
                    g4Var.f19835s.a();
                    return;
                }
                return;
            default:
                g4 g4Var2 = this.f19741b;
                View view2 = g4Var2.f19829m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    f4 f4Var2 = g4Var2.f19835s;
                    f4Var2.f19785b = false;
                    f4Var2.a();
                    return;
                }
                return;
        }
    }
}
