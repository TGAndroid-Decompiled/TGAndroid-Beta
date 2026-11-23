package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class l61 implements Runnable {
    public final int f37096a;
    public final o61 f37097b;

    public l61(o61 o61Var, int i7) {
        this.f37096a = i7;
        this.f37097b = o61Var;
    }

    @Override
    public final void run() {
        switch (this.f37096a) {
            case 0:
                o61 o61Var = this.f37097b;
                o61Var.h = 0.0f;
                c6 c6Var = o61Var.f38091b;
                if (c6Var != null) {
                    c6Var.u();
                    o61Var.f38091b = null;
                    return;
                }
                return;
            case 1:
                o61 o61Var2 = this.f37097b;
                o61Var2.f38089a = true;
                o61Var2.f38096e = null;
                if (o61Var2.f38091b != null) {
                    o61Var2.f38104s = true;
                    PhotoViewer photoViewer = o61Var2.N.f51247a;
                    if (photoViewer.f43350u3) {
                        photoViewer.Z2(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                o61 o61Var3 = this.f37097b;
                o61Var3.f38089a = true;
                o61Var3.f38096e = null;
                if (o61Var3.f38091b != null) {
                    o61Var3.f38104s = true;
                    PhotoViewer photoViewer2 = o61Var3.N.f51247a;
                    if (photoViewer2.f43350u3) {
                        photoViewer2.Z2(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
