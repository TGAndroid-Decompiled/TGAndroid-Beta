package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class m81 implements Runnable {
    public final int f28533a;
    public final q81 f28534b;

    public m81(q81 q81Var, int i10) {
        this.f28533a = i10;
        this.f28534b = q81Var;
    }

    @Override
    public final void run() {
        switch (this.f28533a) {
            case 0:
                q81 q81Var = this.f28534b;
                q81Var.h = 0.0f;
                c6 c6Var = q81Var.f29833b;
                if (c6Var != null) {
                    c6Var.u();
                    q81Var.f29833b = null;
                    return;
                }
                return;
            case 1:
                q81 q81Var2 = this.f28534b;
                q81Var2.f29831a = true;
                q81Var2.e = null;
                if (q81Var2.f29833b != null) {
                    q81Var2.f29844s = true;
                    PhotoViewer photoViewer = q81Var2.M.f35828a;
                    if (photoViewer.f33726u3) {
                        photoViewer.d3(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                q81 q81Var3 = this.f28534b;
                q81Var3.f29831a = true;
                q81Var3.e = null;
                if (q81Var3.f29833b != null) {
                    q81Var3.f29844s = true;
                    PhotoViewer photoViewer2 = q81Var3.M.f35828a;
                    if (photoViewer2.f33726u3) {
                        photoViewer2.d3(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
