package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class k71 implements Runnable {
    public final int f25573a;
    public final o71 f25574b;

    public k71(o71 o71Var, int i10) {
        this.f25573a = i10;
        this.f25574b = o71Var;
    }

    @Override
    public final void run() {
        switch (this.f25573a) {
            case 0:
                o71 o71Var = this.f25574b;
                o71Var.h = 0.0f;
                b6 b6Var = o71Var.f26656b;
                if (b6Var != null) {
                    b6Var.u();
                    o71Var.f26656b = null;
                    return;
                }
                return;
            case 1:
                o71 o71Var2 = this.f25574b;
                o71Var2.f26654a = true;
                o71Var2.e = null;
                if (o71Var2.f26656b != null) {
                    o71Var2.f26667s = true;
                    PhotoViewer photoViewer = o71Var2.M.f37546a;
                    if (photoViewer.f31093u3) {
                        photoViewer.b3(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                o71 o71Var3 = this.f25574b;
                o71Var3.f26654a = true;
                o71Var3.e = null;
                if (o71Var3.f26656b != null) {
                    o71Var3.f26667s = true;
                    PhotoViewer photoViewer2 = o71Var3.M.f37546a;
                    if (photoViewer2.f31093u3) {
                        photoViewer2.b3(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
