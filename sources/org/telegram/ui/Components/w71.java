package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class w71 implements Runnable {
    public final int f28708a;
    public final a81 f28709b;

    public w71(a81 a81Var, int i10) {
        this.f28708a = i10;
        this.f28709b = a81Var;
    }

    @Override
    public final void run() {
        switch (this.f28708a) {
            case 0:
                a81 a81Var = this.f28709b;
                a81Var.h = 0.0f;
                c6 c6Var = a81Var.f21422b;
                if (c6Var != null) {
                    c6Var.u();
                    a81Var.f21422b = null;
                    return;
                }
                return;
            case 1:
                a81 a81Var2 = this.f28709b;
                a81Var2.f21420a = true;
                a81Var2.e = null;
                if (a81Var2.f21422b != null) {
                    a81Var2.f21433s = true;
                    PhotoViewer photoViewer = a81Var2.M.f36130a;
                    if (photoViewer.f30192u3) {
                        photoViewer.b3(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                a81 a81Var3 = this.f28709b;
                a81Var3.f21420a = true;
                a81Var3.e = null;
                if (a81Var3.f21422b != null) {
                    a81Var3.f21433s = true;
                    PhotoViewer photoViewer2 = a81Var3.M.f36130a;
                    if (photoViewer2.f30192u3) {
                        photoViewer2.b3(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
