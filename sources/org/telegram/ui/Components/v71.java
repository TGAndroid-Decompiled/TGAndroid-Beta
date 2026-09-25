package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class v71 implements Runnable {
    public final int f29069a;
    public final a81 f29070b;

    public v71(a81 a81Var, int i10) {
        this.f29069a = i10;
        this.f29070b = a81Var;
    }

    @Override
    public final void run() {
        switch (this.f29069a) {
            case 0:
                a81 a81Var = this.f29070b;
                a81Var.h = 0.0f;
                d6 d6Var = a81Var.f22617b;
                if (d6Var != null) {
                    d6Var.u();
                    a81Var.f22617b = null;
                    return;
                }
                return;
            case 1:
                a81 a81Var2 = this.f29070b;
                a81Var2.f22615a = true;
                a81Var2.e = null;
                if (a81Var2.f22617b != null) {
                    a81Var2.f22628s = true;
                    PhotoViewer photoViewer = a81Var2.M.f34574a;
                    if (photoViewer.f31367u3) {
                        photoViewer.a3(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                a81 a81Var3 = this.f29070b;
                a81Var3.f22615a = true;
                a81Var3.e = null;
                if (a81Var3.f22617b != null) {
                    a81Var3.f22628s = true;
                    PhotoViewer photoViewer2 = a81Var3.M.f34574a;
                    if (photoViewer2.f31367u3) {
                        photoViewer2.a3(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
