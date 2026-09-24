package org.telegram.ui.ActionBar;

import android.view.View;
public final class e4 implements Runnable {
    public final int f18839a;
    public final g4 f18840b;

    public e4(g4 g4Var, int i10) {
        this.f18839a = i10;
        this.f18840b = g4Var;
    }

    @Override
    public final void run() {
        switch (this.f18839a) {
            case 0:
                g4 g4Var = this.f18840b;
                View view = g4Var.f18911m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    f4 f4Var = g4Var.f18917s;
                    f4Var.getClass();
                    System.currentTimeMillis();
                    f4Var.f18866c = false;
                    g4Var.f18917s.a();
                    return;
                }
                return;
            default:
                g4 g4Var2 = this.f18840b;
                View view2 = g4Var2.f18911m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    f4 f4Var2 = g4Var2.f18917s;
                    f4Var2.f18865b = false;
                    f4Var2.a();
                    return;
                }
                return;
        }
    }
}
