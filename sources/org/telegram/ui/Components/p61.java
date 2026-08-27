package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;

public final class p61 implements Runnable {

    public final int f31535a;

    public final t61 f31536b;

    public p61(t61 t61Var, int i10) {
        this.f31535a = i10;
        this.f31536b = t61Var;
    }

    @Override
    public final void run() {
        switch (this.f31535a) {
            case 0:
                t61 t61Var = this.f31536b;
                t61Var.h = 0.0f;
                x5 x5Var = t61Var.f32662b;
                if (x5Var != null) {
                    x5Var.u();
                    t61Var.f32662b = null;
                }
                break;
            case 1:
                t61 t61Var2 = this.f31536b;
                t61Var2.f32660a = true;
                t61Var2.f32666e = null;
                if (t61Var2.f32662b != null) {
                    t61Var2.f32670s = true;
                    PhotoViewer photoViewer = t61Var2.I.f41411a;
                    if (photoViewer.f35730q3) {
                        photoViewer.b3(true);
                    }
                }
                break;
            default:
                t61 t61Var3 = this.f31536b;
                t61Var3.f32660a = true;
                t61Var3.f32666e = null;
                if (t61Var3.f32662b != null) {
                    t61Var3.f32670s = true;
                    PhotoViewer photoViewer2 = t61Var3.I.f41411a;
                    if (photoViewer2.f35730q3) {
                        photoViewer2.b3(true);
                    }
                }
                break;
        }
    }
}
