package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class j71 implements Runnable {
    public final int f27372a;
    public final n71 f27373b;

    public j71(n71 n71Var, int i10) {
        this.f27372a = i10;
        this.f27373b = n71Var;
    }

    @Override
    public final void run() {
        switch (this.f27372a) {
            case 0:
                n71 n71Var = this.f27373b;
                n71Var.h = 0.0f;
                d6 d6Var = n71Var.f28670b;
                if (d6Var != null) {
                    d6Var.u();
                    n71Var.f28670b = null;
                    return;
                }
                return;
            case 1:
                n71 n71Var2 = this.f27373b;
                n71Var2.f28668a = true;
                n71Var2.f28675e = null;
                if (n71Var2.f28670b != null) {
                    n71Var2.f28682s = true;
                    PhotoViewer photoViewer = n71Var2.M.f39976a;
                    if (photoViewer.f33693u3) {
                        photoViewer.b3(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                n71 n71Var3 = this.f27373b;
                n71Var3.f28668a = true;
                n71Var3.f28675e = null;
                if (n71Var3.f28670b != null) {
                    n71Var3.f28682s = true;
                    PhotoViewer photoViewer2 = n71Var3.M.f39976a;
                    if (photoViewer2.f33693u3) {
                        photoViewer2.b3(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
