package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class l81 implements Runnable {
    public final int f26675a;
    public final q81 f26676b;

    public l81(q81 q81Var, int i10) {
        this.f26675a = i10;
        this.f26676b = q81Var;
    }

    @Override
    public final void run() {
        switch (this.f26675a) {
            case 0:
                q81 q81Var = this.f26676b;
                q81Var.h = 0.0f;
                f6 f6Var = q81Var.f28227b;
                if (f6Var != null) {
                    f6Var.u();
                    q81Var.f28227b = null;
                    return;
                }
                return;
            case 1:
                q81 q81Var2 = this.f26676b;
                q81Var2.f28225a = true;
                q81Var2.e = null;
                if (q81Var2.f28227b != null) {
                    q81Var2.f28238s = true;
                    PhotoViewer photoViewer = q81Var2.M.f40755a;
                    if (photoViewer.f32072u3) {
                        photoViewer.b3(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                q81 q81Var3 = this.f26676b;
                q81Var3.f28225a = true;
                q81Var3.e = null;
                if (q81Var3.f28227b != null) {
                    q81Var3.f28238s = true;
                    PhotoViewer photoViewer2 = q81Var3.M.f40755a;
                    if (photoViewer2.f32072u3) {
                        photoViewer2.b3(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
