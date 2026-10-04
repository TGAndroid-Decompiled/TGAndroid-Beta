package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class g81 implements Runnable {
    public final int f26715a;
    public final k81 f26716b;

    public g81(k81 k81Var, int i10) {
        this.f26715a = i10;
        this.f26716b = k81Var;
    }

    @Override
    public final void run() {
        switch (this.f26715a) {
            case 0:
                k81 k81Var = this.f26716b;
                k81Var.h = 0.0f;
                d6 d6Var = k81Var.f28009b;
                if (d6Var != null) {
                    d6Var.u();
                    k81Var.f28009b = null;
                    return;
                }
                return;
            case 1:
                k81 k81Var2 = this.f26716b;
                k81Var2.f28007a = true;
                k81Var2.f28014e = null;
                if (k81Var2.f28009b != null) {
                    k81Var2.f28021s = true;
                    PhotoViewer photoViewer = k81Var2.M.f38328a;
                    if (photoViewer.f34037u3) {
                        photoViewer.b3(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                k81 k81Var3 = this.f26716b;
                k81Var3.f28007a = true;
                k81Var3.f28014e = null;
                if (k81Var3.f28009b != null) {
                    k81Var3.f28021s = true;
                    PhotoViewer photoViewer2 = k81Var3.M.f38328a;
                    if (photoViewer2.f34037u3) {
                        photoViewer2.b3(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
