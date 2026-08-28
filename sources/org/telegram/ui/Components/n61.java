package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class n61 implements Runnable {
    public final int f31028a;
    public final r61 f31029b;

    public n61(r61 r61Var, int i9) {
        this.f31028a = i9;
        this.f31029b = r61Var;
    }

    @Override
    public final void run() {
        switch (this.f31028a) {
            case 0:
                r61 r61Var = this.f31029b;
                r61Var.h = 0.0f;
                x5 x5Var = r61Var.f32089b;
                if (x5Var != null) {
                    x5Var.u();
                    r61Var.f32089b = null;
                    return;
                }
                return;
            case 1:
                r61 r61Var2 = this.f31029b;
                r61Var2.f32087a = true;
                r61Var2.f32093e = null;
                if (r61Var2.f32089b != null) {
                    r61Var2.f32097s = true;
                    PhotoViewer photoViewer = r61Var2.I.f41231a;
                    if (photoViewer.f35726q3) {
                        photoViewer.b3(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                r61 r61Var3 = this.f31029b;
                r61Var3.f32087a = true;
                r61Var3.f32093e = null;
                if (r61Var3.f32089b != null) {
                    r61Var3.f32097s = true;
                    PhotoViewer photoViewer2 = r61Var3.I.f41231a;
                    if (photoViewer2.f35726q3) {
                        photoViewer2.b3(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
