package org.telegram.ui.ActionBar;

import android.view.View;
public final class f4 implements Runnable {
    public final int f20609a;
    public final h4 f20610b;

    public f4(h4 h4Var, int i10) {
        this.f20609a = i10;
        this.f20610b = h4Var;
    }

    @Override
    public final void run() {
        switch (this.f20609a) {
            case 0:
                h4 h4Var = this.f20610b;
                View view = h4Var.f20685m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    g4 g4Var = h4Var.f20691s;
                    g4Var.getClass();
                    System.currentTimeMillis();
                    g4Var.f20658c = false;
                    h4Var.f20691s.a();
                    return;
                }
                return;
            default:
                h4 h4Var2 = this.f20610b;
                View view2 = h4Var2.f20685m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    g4 g4Var2 = h4Var2.f20691s;
                    g4Var2.f20657b = false;
                    g4Var2.a();
                    return;
                }
                return;
        }
    }
}
