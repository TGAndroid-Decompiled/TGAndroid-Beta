package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class l61 implements Runnable {
    public final int f37140a;
    public final o61 f37141b;

    public l61(o61 o61Var, int i7) {
        this.f37140a = i7;
        this.f37141b = o61Var;
    }

    @Override
    public final void run() {
        switch (this.f37140a) {
            case 0:
                o61 o61Var = this.f37141b;
                o61Var.h = 0.0f;
                c6 c6Var = o61Var.f38125b;
                if (c6Var != null) {
                    c6Var.u();
                    o61Var.f38125b = null;
                    return;
                }
                return;
            case 1:
                o61 o61Var2 = this.f37141b;
                o61Var2.f38123a = true;
                o61Var2.f38130e = null;
                if (o61Var2.f38125b != null) {
                    o61Var2.f38138s = true;
                    PhotoViewer photoViewer = o61Var2.N.f51314a;
                    if (photoViewer.f43385u3) {
                        photoViewer.Z2(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                o61 o61Var3 = this.f37141b;
                o61Var3.f38123a = true;
                o61Var3.f38130e = null;
                if (o61Var3.f38125b != null) {
                    o61Var3.f38138s = true;
                    PhotoViewer photoViewer2 = o61Var3.N.f51314a;
                    if (photoViewer2.f43385u3) {
                        photoViewer2.Z2(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
