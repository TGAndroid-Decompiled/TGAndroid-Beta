package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class x71 implements Runnable {
    public final int f30341a;
    public final c81 f30342b;

    public x71(c81 c81Var, int i10) {
        this.f30341a = i10;
        this.f30342b = c81Var;
    }

    @Override
    public final void run() {
        switch (this.f30341a) {
            case 0:
                c81 c81Var = this.f30342b;
                c81Var.h = 0.0f;
                d6 d6Var = c81Var.f23252b;
                if (d6Var != null) {
                    d6Var.u();
                    c81Var.f23252b = null;
                    return;
                }
                return;
            case 1:
                c81 c81Var2 = this.f30342b;
                c81Var2.f23250a = true;
                c81Var2.e = null;
                if (c81Var2.f23252b != null) {
                    c81Var2.f23263s = true;
                    PhotoViewer photoViewer = c81Var2.M.f35443a;
                    if (photoViewer.f31368u3) {
                        photoViewer.a3(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                c81 c81Var3 = this.f30342b;
                c81Var3.f23250a = true;
                c81Var3.e = null;
                if (c81Var3.f23252b != null) {
                    c81Var3.f23263s = true;
                    PhotoViewer photoViewer2 = c81Var3.M.f35443a;
                    if (photoViewer2.f31368u3) {
                        photoViewer2.a3(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
