package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class x51 implements Runnable {
    public final int f41594a;
    public final a61 f41595b;

    public x51(a61 a61Var, int i7) {
        this.f41594a = i7;
        this.f41595b = a61Var;
    }

    @Override
    public final void run() {
        switch (this.f41594a) {
            case 0:
                a61 a61Var = this.f41595b;
                a61Var.h = 0.0f;
                t5 t5Var = a61Var.f32889b;
                if (t5Var != null) {
                    t5Var.u();
                    a61Var.f32889b = null;
                    return;
                }
                return;
            case 1:
                a61 a61Var2 = this.f41595b;
                a61Var2.f32887a = true;
                a61Var2.f32894e = null;
                if (a61Var2.f32889b != null) {
                    a61Var2.f32902s = true;
                    PhotoViewer photoViewer = a61Var2.N.f49587a;
                    if (photoViewer.f42895u3) {
                        photoViewer.Z2(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                a61 a61Var3 = this.f41595b;
                a61Var3.f32887a = true;
                a61Var3.f32894e = null;
                if (a61Var3.f32889b != null) {
                    a61Var3.f32902s = true;
                    PhotoViewer photoViewer2 = a61Var3.N.f49587a;
                    if (photoViewer2.f42895u3) {
                        photoViewer2.Z2(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
