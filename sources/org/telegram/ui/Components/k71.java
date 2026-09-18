package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class k71 implements Runnable {
    public final int f25576a;
    public final o71 f25577b;

    public k71(o71 o71Var, int i10) {
        this.f25576a = i10;
        this.f25577b = o71Var;
    }

    @Override
    public final void run() {
        switch (this.f25576a) {
            case 0:
                o71 o71Var = this.f25577b;
                o71Var.h = 0.0f;
                b6 b6Var = o71Var.f26659b;
                if (b6Var != null) {
                    b6Var.u();
                    o71Var.f26659b = null;
                    return;
                }
                return;
            case 1:
                o71 o71Var2 = this.f25577b;
                o71Var2.f26657a = true;
                o71Var2.e = null;
                if (o71Var2.f26659b != null) {
                    o71Var2.f26670s = true;
                    PhotoViewer photoViewer = o71Var2.M.f37551a;
                    if (photoViewer.f31097u3) {
                        photoViewer.a3(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                o71 o71Var3 = this.f25577b;
                o71Var3.f26657a = true;
                o71Var3.e = null;
                if (o71Var3.f26659b != null) {
                    o71Var3.f26670s = true;
                    PhotoViewer photoViewer2 = o71Var3.M.f37551a;
                    if (photoViewer2.f31097u3) {
                        photoViewer2.a3(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
