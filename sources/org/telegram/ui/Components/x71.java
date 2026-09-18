package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class x71 implements Runnable {
    public final int f30276a;
    public final b81 f30277b;

    public x71(b81 b81Var, int i10) {
        this.f30276a = i10;
        this.f30277b = b81Var;
    }

    @Override
    public final void run() {
        switch (this.f30276a) {
            case 0:
                b81 b81Var = this.f30277b;
                b81Var.h = 0.0f;
                d6 d6Var = b81Var.f22880b;
                if (d6Var != null) {
                    d6Var.u();
                    b81Var.f22880b = null;
                    return;
                }
                return;
            case 1:
                b81 b81Var2 = this.f30277b;
                b81Var2.f22878a = true;
                b81Var2.e = null;
                if (b81Var2.f22880b != null) {
                    b81Var2.f22891s = true;
                    PhotoViewer photoViewer = b81Var2.M.f37125a;
                    if (photoViewer.f31324u3) {
                        photoViewer.a3(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                b81 b81Var3 = this.f30277b;
                b81Var3.f22878a = true;
                b81Var3.e = null;
                if (b81Var3.f22880b != null) {
                    b81Var3.f22891s = true;
                    PhotoViewer photoViewer2 = b81Var3.M.f37125a;
                    if (photoViewer2.f31324u3) {
                        photoViewer2.a3(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
