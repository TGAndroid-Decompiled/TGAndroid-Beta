package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class w51 implements Runnable {
    public final int f39889a;
    public final z51 f39890b;

    public w51(z51 z51Var, int i7) {
        this.f39889a = i7;
        this.f39890b = z51Var;
    }

    @Override
    public final void run() {
        switch (this.f39889a) {
            case 0:
                z51 z51Var = this.f39890b;
                z51Var.h = 0.0f;
                u5 u5Var = z51Var.f40867b;
                if (u5Var != null) {
                    u5Var.u();
                    z51Var.f40867b = null;
                    return;
                }
                return;
            case 1:
                z51 z51Var2 = this.f39890b;
                z51Var2.f40865a = true;
                z51Var2.f40872e = null;
                if (z51Var2.f40867b != null) {
                    z51Var2.f40879s = true;
                    PhotoViewer photoViewer = z51Var2.M.f48556a;
                    if (photoViewer.f41516t3) {
                        photoViewer.Y2(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                z51 z51Var3 = this.f39890b;
                z51Var3.f40865a = true;
                z51Var3.f40872e = null;
                if (z51Var3.f40867b != null) {
                    z51Var3.f40879s = true;
                    PhotoViewer photoViewer2 = z51Var3.M.f48556a;
                    if (photoViewer2.f41516t3) {
                        photoViewer2.Y2(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
