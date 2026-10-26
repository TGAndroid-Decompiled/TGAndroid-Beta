package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class v81 implements Runnable {
    public final int f33600a;
    public final z81 f33601b;

    public v81(z81 z81Var, int i10) {
        this.f33600a = i10;
        this.f33601b = z81Var;
    }

    @Override
    public final void run() {
        switch (this.f33600a) {
            case 0:
                z81 z81Var = this.f33601b;
                z81Var.h = 0.0f;
                g6 g6Var = z81Var.f35247b;
                if (g6Var != null) {
                    g6Var.u();
                    z81Var.f35247b = null;
                    return;
                }
                return;
            case 1:
                z81 z81Var2 = this.f33601b;
                z81Var2.f35245a = true;
                z81Var2.e = null;
                if (z81Var2.f35247b != null) {
                    z81Var2.f35258s = true;
                    PhotoViewer photoViewer = z81Var2.M.f39440a;
                    if (photoViewer.f35790u3) {
                        photoViewer.d3(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                z81 z81Var3 = this.f33601b;
                z81Var3.f35245a = true;
                z81Var3.e = null;
                if (z81Var3.f35247b != null) {
                    z81Var3.f35258s = true;
                    PhotoViewer photoViewer2 = z81Var3.M.f39440a;
                    if (photoViewer2.f35790u3) {
                        photoViewer2.d3(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
