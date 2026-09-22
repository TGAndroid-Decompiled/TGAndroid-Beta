package org.telegram.ui.ActionBar;

import android.view.View;
public final class g4 implements Runnable {
    public final int f18685a;
    public final i4 f18686b;

    public g4(i4 i4Var, int i10) {
        this.f18685a = i10;
        this.f18686b = i4Var;
    }

    @Override
    public final void run() {
        switch (this.f18685a) {
            case 0:
                i4 i4Var = this.f18686b;
                View view = i4Var.f18764m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    h4 h4Var = i4Var.f18770s;
                    h4Var.getClass();
                    System.currentTimeMillis();
                    h4Var.f18722c = false;
                    i4Var.f18770s.a();
                    return;
                }
                return;
            default:
                i4 i4Var2 = this.f18686b;
                View view2 = i4Var2.f18764m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    h4 h4Var2 = i4Var2.f18770s;
                    h4Var2.f18721b = false;
                    h4Var2.a();
                    return;
                }
                return;
        }
    }
}
