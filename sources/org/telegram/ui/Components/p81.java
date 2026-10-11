package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class p81 implements Runnable {
    public final int f29640a;
    public final u81 f29641b;

    public p81(u81 u81Var, int i10) {
        this.f29640a = i10;
        this.f29641b = u81Var;
    }

    @Override
    public final void run() {
        switch (this.f29640a) {
            case 0:
                u81 u81Var = this.f29641b;
                u81Var.h = 0.0f;
                f6 f6Var = u81Var.f31336b;
                if (f6Var != null) {
                    f6Var.u();
                    u81Var.f31336b = null;
                    return;
                }
                return;
            case 1:
                u81 u81Var2 = this.f29641b;
                u81Var2.f31334a = true;
                u81Var2.f31341e = null;
                if (u81Var2.f31336b != null) {
                    u81Var2.f31348s = true;
                    PhotoViewer photoViewer = u81Var2.M.f40942a;
                    if (photoViewer.f34075u3) {
                        photoViewer.b3(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                u81 u81Var3 = this.f29641b;
                u81Var3.f31334a = true;
                u81Var3.f31341e = null;
                if (u81Var3.f31336b != null) {
                    u81Var3.f31348s = true;
                    PhotoViewer photoViewer2 = u81Var3.M.f40942a;
                    if (photoViewer2.f34075u3) {
                        photoViewer2.b3(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
