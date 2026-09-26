package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class w71 implements Runnable {
    public final int f29917a;
    public final b81 f29918b;

    public w71(b81 b81Var, int i10) {
        this.f29917a = i10;
        this.f29918b = b81Var;
    }

    @Override
    public final void run() {
        switch (this.f29917a) {
            case 0:
                b81 b81Var = this.f29918b;
                b81Var.h = 0.0f;
                d6 d6Var = b81Var.f22914b;
                if (d6Var != null) {
                    d6Var.u();
                    b81Var.f22914b = null;
                    return;
                }
                return;
            case 1:
                b81 b81Var2 = this.f29918b;
                b81Var2.f22912a = true;
                b81Var2.e = null;
                if (b81Var2.f22914b != null) {
                    b81Var2.f22925s = true;
                    PhotoViewer photoViewer = b81Var2.M.f34572a;
                    if (photoViewer.f31365u3) {
                        photoViewer.a3(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                b81 b81Var3 = this.f29918b;
                b81Var3.f22912a = true;
                b81Var3.e = null;
                if (b81Var3.f22914b != null) {
                    b81Var3.f22925s = true;
                    PhotoViewer photoViewer2 = b81Var3.M.f34572a;
                    if (photoViewer2.f31365u3) {
                        photoViewer2.a3(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
