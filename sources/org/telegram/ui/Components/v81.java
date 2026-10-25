package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class v81 implements Runnable {
    public final int f33597a;
    public final z81 f33598b;

    public v81(z81 z81Var, int i10) {
        this.f33597a = i10;
        this.f33598b = z81Var;
    }

    @Override
    public final void run() {
        switch (this.f33597a) {
            case 0:
                z81 z81Var = this.f33598b;
                z81Var.h = 0.0f;
                g6 g6Var = z81Var.f35244b;
                if (g6Var != null) {
                    g6Var.u();
                    z81Var.f35244b = null;
                    return;
                }
                return;
            case 1:
                z81 z81Var2 = this.f33598b;
                z81Var2.f35242a = true;
                z81Var2.e = null;
                if (z81Var2.f35244b != null) {
                    z81Var2.f35255s = true;
                    PhotoViewer photoViewer = z81Var2.M.f39437a;
                    if (photoViewer.f35787u3) {
                        photoViewer.d3(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                z81 z81Var3 = this.f33598b;
                z81Var3.f35242a = true;
                z81Var3.e = null;
                if (z81Var3.f35244b != null) {
                    z81Var3.f35255s = true;
                    PhotoViewer photoViewer2 = z81Var3.M.f39437a;
                    if (photoViewer2.f35787u3) {
                        photoViewer2.d3(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
