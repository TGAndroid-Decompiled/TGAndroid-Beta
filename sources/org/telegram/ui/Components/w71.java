package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class w71 implements Runnable {
    public final int f29976a;
    public final b81 f29977b;

    public w71(b81 b81Var, int i10) {
        this.f29976a = i10;
        this.f29977b = b81Var;
    }

    @Override
    public final void run() {
        switch (this.f29976a) {
            case 0:
                b81 b81Var = this.f29977b;
                b81Var.h = 0.0f;
                c6 c6Var = b81Var.f22913b;
                if (c6Var != null) {
                    c6Var.u();
                    b81Var.f22913b = null;
                    return;
                }
                return;
            case 1:
                b81 b81Var2 = this.f29977b;
                b81Var2.f22911a = true;
                b81Var2.e = null;
                if (b81Var2.f22913b != null) {
                    b81Var2.f22924s = true;
                    PhotoViewer photoViewer = b81Var2.M.f37220a;
                    if (photoViewer.f31364u3) {
                        photoViewer.a3(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                b81 b81Var3 = this.f29977b;
                b81Var3.f22911a = true;
                b81Var3.e = null;
                if (b81Var3.f22913b != null) {
                    b81Var3.f22924s = true;
                    PhotoViewer photoViewer2 = b81Var3.M.f37220a;
                    if (photoViewer2.f31364u3) {
                        photoViewer2.a3(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
