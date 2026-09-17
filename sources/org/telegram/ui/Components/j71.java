package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class j71 implements Runnable {
    public final int f27399a;
    public final n71 f27400b;

    public j71(n71 n71Var, int i10) {
        this.f27399a = i10;
        this.f27400b = n71Var;
    }

    @Override
    public final void run() {
        switch (this.f27399a) {
            case 0:
                n71 n71Var = this.f27400b;
                n71Var.h = 0.0f;
                d6 d6Var = n71Var.f28697b;
                if (d6Var != null) {
                    d6Var.u();
                    n71Var.f28697b = null;
                    return;
                }
                return;
            case 1:
                n71 n71Var2 = this.f27400b;
                n71Var2.f28695a = true;
                n71Var2.f28702e = null;
                if (n71Var2.f28697b != null) {
                    n71Var2.f28709s = true;
                    PhotoViewer photoViewer = n71Var2.M.f40003a;
                    if (photoViewer.f33720u3) {
                        photoViewer.b3(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                n71 n71Var3 = this.f27400b;
                n71Var3.f28695a = true;
                n71Var3.f28702e = null;
                if (n71Var3.f28697b != null) {
                    n71Var3.f28709s = true;
                    PhotoViewer photoViewer2 = n71Var3.M.f40003a;
                    if (photoViewer2.f33720u3) {
                        photoViewer2.b3(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
