package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class l71 implements Runnable {
    public final int f26585a;
    public final p71 f26586b;

    public l71(p71 p71Var, int i10) {
        this.f26585a = i10;
        this.f26586b = p71Var;
    }

    @Override
    public final void run() {
        switch (this.f26585a) {
            case 0:
                p71 p71Var = this.f26586b;
                p71Var.h = 0.0f;
                y5 y5Var = p71Var.f27770b;
                if (y5Var != null) {
                    y5Var.u();
                    p71Var.f27770b = null;
                    return;
                }
                return;
            case 1:
                p71 p71Var2 = this.f26586b;
                p71Var2.f27768a = true;
                p71Var2.e = null;
                if (p71Var2.f27770b != null) {
                    p71Var2.f27778s = true;
                    PhotoViewer photoViewer = p71Var2.J.f38990a;
                    if (photoViewer.f31852r3) {
                        photoViewer.b3(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                p71 p71Var3 = this.f26586b;
                p71Var3.f27768a = true;
                p71Var3.e = null;
                if (p71Var3.f27770b != null) {
                    p71Var3.f27778s = true;
                    PhotoViewer photoViewer2 = p71Var3.J.f38990a;
                    if (photoViewer2.f31852r3) {
                        photoViewer2.b3(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
