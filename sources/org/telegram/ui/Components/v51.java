package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class v51 implements Runnable {
    public final int f38861a;
    public final y51 f38862b;

    public v51(y51 y51Var, int i7) {
        this.f38861a = i7;
        this.f38862b = y51Var;
    }

    @Override
    public final void run() {
        switch (this.f38861a) {
            case 0:
                y51 y51Var = this.f38862b;
                y51Var.h = 0.0f;
                v5 v5Var = y51Var.f40535b;
                if (v5Var != null) {
                    v5Var.u();
                    y51Var.f40535b = null;
                    return;
                }
                return;
            case 1:
                y51 y51Var2 = this.f38862b;
                y51Var2.f40533a = true;
                y51Var2.f40540e = null;
                if (y51Var2.f40535b != null) {
                    y51Var2.f40547s = true;
                    PhotoViewer photoViewer = y51Var2.M.f47564a;
                    if (photoViewer.f41515t3) {
                        photoViewer.Y2(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                y51 y51Var3 = this.f38862b;
                y51Var3.f40533a = true;
                y51Var3.f40540e = null;
                if (y51Var3.f40535b != null) {
                    y51Var3.f40547s = true;
                    PhotoViewer photoViewer2 = y51Var3.M.f47564a;
                    if (photoViewer2.f41515t3) {
                        photoViewer2.Y2(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
