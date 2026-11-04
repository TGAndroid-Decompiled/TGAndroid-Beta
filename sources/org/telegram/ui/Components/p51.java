package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class p51 implements Runnable {
    public final int f37069a;
    public final s51 f37070b;

    public p51(s51 s51Var, int i3) {
        this.f37069a = i3;
        this.f37070b = s51Var;
    }

    @Override
    public final void run() {
        switch (this.f37069a) {
            case 0:
                s51 s51Var = this.f37070b;
                s51Var.h = 0.0f;
                t5 t5Var = s51Var.f37915b;
                if (t5Var != null) {
                    t5Var.u();
                    s51Var.f37915b = null;
                    return;
                }
                return;
            case 1:
                s51 s51Var2 = this.f37070b;
                s51Var2.f37913a = true;
                s51Var2.f37920e = null;
                if (s51Var2.f37915b != null) {
                    s51Var2.f37928s = true;
                    PhotoViewer photoViewer = s51Var2.N.f45683a;
                    if (photoViewer.f41561v3) {
                        photoViewer.e3(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                s51 s51Var3 = this.f37070b;
                s51Var3.f37913a = true;
                s51Var3.f37920e = null;
                if (s51Var3.f37915b != null) {
                    s51Var3.f37928s = true;
                    PhotoViewer photoViewer2 = s51Var3.N.f45683a;
                    if (photoViewer2.f41561v3) {
                        photoViewer2.e3(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
