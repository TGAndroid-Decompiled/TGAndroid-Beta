package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class y71 implements Runnable {
    public final int f30658a;
    public final c81 f30659b;

    public y71(c81 c81Var, int i10) {
        this.f30658a = i10;
        this.f30659b = c81Var;
    }

    @Override
    public final void run() {
        switch (this.f30658a) {
            case 0:
                c81 c81Var = this.f30659b;
                c81Var.h = 0.0f;
                d6 d6Var = c81Var.f23194b;
                if (d6Var != null) {
                    d6Var.u();
                    c81Var.f23194b = null;
                    return;
                }
                return;
            case 1:
                c81 c81Var2 = this.f30659b;
                c81Var2.f23192a = true;
                c81Var2.e = null;
                if (c81Var2.f23194b != null) {
                    c81Var2.f23205s = true;
                    PhotoViewer photoViewer = c81Var2.M.f34660a;
                    if (photoViewer.f31440u3) {
                        photoViewer.b3(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                c81 c81Var3 = this.f30659b;
                c81Var3.f23192a = true;
                c81Var3.e = null;
                if (c81Var3.f23194b != null) {
                    c81Var3.f23205s = true;
                    PhotoViewer photoViewer2 = c81Var3.M.f34660a;
                    if (photoViewer2.f31440u3) {
                        photoViewer2.b3(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
