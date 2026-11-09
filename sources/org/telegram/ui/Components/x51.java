package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class x51 implements Runnable {
    public final int f40304a;
    public final a61 f40305b;

    public x51(a61 a61Var, int i7) {
        this.f40304a = i7;
        this.f40305b = a61Var;
    }

    @Override
    public final void run() {
        switch (this.f40304a) {
            case 0:
                a61 a61Var = this.f40305b;
                a61Var.h = 0.0f;
                v5 v5Var = a61Var.f31725b;
                if (v5Var != null) {
                    v5Var.u();
                    a61Var.f31725b = null;
                    return;
                }
                return;
            case 1:
                a61 a61Var2 = this.f40305b;
                a61Var2.f31723a = true;
                a61Var2.f31730e = null;
                if (a61Var2.f31725b != null) {
                    a61Var2.f31737s = true;
                    PhotoViewer photoViewer = a61Var2.M.f48210a;
                    if (photoViewer.f41525t3) {
                        photoViewer.Y2(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                a61 a61Var3 = this.f40305b;
                a61Var3.f31723a = true;
                a61Var3.f31730e = null;
                if (a61Var3.f31725b != null) {
                    a61Var3.f31737s = true;
                    PhotoViewer photoViewer2 = a61Var3.M.f48210a;
                    if (photoViewer2.f41525t3) {
                        photoViewer2.Y2(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
