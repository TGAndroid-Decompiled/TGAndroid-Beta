package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class k81 implements Runnable {
    public final int f26613a;
    public final p81 f26614b;

    public k81(p81 p81Var, int i10) {
        this.f26613a = i10;
        this.f26614b = p81Var;
    }

    @Override
    public final void run() {
        switch (this.f26613a) {
            case 0:
                p81 p81Var = this.f26614b;
                p81Var.h = 0.0f;
                f6 f6Var = p81Var.f28233b;
                if (f6Var != null) {
                    f6Var.u();
                    p81Var.f28233b = null;
                    return;
                }
                return;
            case 1:
                p81 p81Var2 = this.f26614b;
                p81Var2.f28231a = true;
                p81Var2.e = null;
                if (p81Var2.f28233b != null) {
                    p81Var2.f28244s = true;
                    PhotoViewer photoViewer = p81Var2.M.f41639a;
                    if (photoViewer.f32370u3) {
                        photoViewer.b3(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                p81 p81Var3 = this.f26614b;
                p81Var3.f28231a = true;
                p81Var3.e = null;
                if (p81Var3.f28233b != null) {
                    p81Var3.f28244s = true;
                    PhotoViewer photoViewer2 = p81Var3.M.f41639a;
                    if (photoViewer2.f32370u3) {
                        photoViewer2.b3(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
