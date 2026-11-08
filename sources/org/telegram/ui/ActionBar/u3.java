package org.telegram.ui.ActionBar;

import android.view.View;
public final class u3 implements Runnable {
    public final int f28599a;
    public final w3 f28600b;

    public u3(w3 w3Var, int i7) {
        this.f28599a = i7;
        this.f28600b = w3Var;
    }

    @Override
    public final void run() {
        switch (this.f28599a) {
            case 0:
                w3 w3Var = this.f28600b;
                View view = w3Var.f28709m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    v3 v3Var = w3Var.f28715s;
                    v3Var.getClass();
                    System.currentTimeMillis();
                    v3Var.f28661c = false;
                    w3Var.f28715s.a();
                    return;
                }
                return;
            default:
                w3 w3Var2 = this.f28600b;
                View view2 = w3Var2.f28709m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    v3 v3Var2 = w3Var2.f28715s;
                    v3Var2.f28660b = false;
                    v3Var2.a();
                    return;
                }
                return;
        }
    }
}
