package org.telegram.ui.ActionBar;

import android.view.View;
public final class g4 implements Runnable {
    public final int f18919a;
    public final i4 f18920b;

    public g4(i4 i4Var, int i10) {
        this.f18919a = i10;
        this.f18920b = i4Var;
    }

    @Override
    public final void run() {
        switch (this.f18919a) {
            case 0:
                i4 i4Var = this.f18920b;
                View view = i4Var.f18981m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    h4 h4Var = i4Var.f18987s;
                    h4Var.getClass();
                    System.currentTimeMillis();
                    h4Var.f18937c = false;
                    i4Var.f18987s.a();
                    return;
                }
                return;
            default:
                i4 i4Var2 = this.f18920b;
                View view2 = i4Var2.f18981m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    h4 h4Var2 = i4Var2.f18987s;
                    h4Var2.f18936b = false;
                    h4Var2.a();
                    return;
                }
                return;
        }
    }
}
