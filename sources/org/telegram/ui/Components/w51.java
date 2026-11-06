package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class w51 implements Runnable {
    public final int f39866a;
    public final z51 f39867b;

    public w51(z51 z51Var, int i7) {
        this.f39866a = i7;
        this.f39867b = z51Var;
    }

    @Override
    public final void run() {
        switch (this.f39866a) {
            case 0:
                z51 z51Var = this.f39867b;
                z51Var.h = 0.0f;
                v5 v5Var = z51Var.f40881b;
                if (v5Var != null) {
                    v5Var.u();
                    z51Var.f40881b = null;
                    return;
                }
                return;
            case 1:
                z51 z51Var2 = this.f39867b;
                z51Var2.f40879a = true;
                z51Var2.f40886e = null;
                if (z51Var2.f40881b != null) {
                    z51Var2.f40893s = true;
                    PhotoViewer photoViewer = z51Var2.M.f47563a;
                    if (photoViewer.f41514t3) {
                        photoViewer.Y2(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                z51 z51Var3 = this.f39867b;
                z51Var3.f40879a = true;
                z51Var3.f40886e = null;
                if (z51Var3.f40881b != null) {
                    z51Var3.f40893s = true;
                    PhotoViewer photoViewer2 = z51Var3.M.f47563a;
                    if (photoViewer2.f41514t3) {
                        photoViewer2.Y2(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
