package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class j71 implements Runnable {
    public final int f27371a;
    public final n71 f27372b;

    public j71(n71 n71Var, int i10) {
        this.f27371a = i10;
        this.f27372b = n71Var;
    }

    @Override
    public final void run() {
        switch (this.f27371a) {
            case 0:
                n71 n71Var = this.f27372b;
                n71Var.h = 0.0f;
                d6 d6Var = n71Var.f28669b;
                if (d6Var != null) {
                    d6Var.u();
                    n71Var.f28669b = null;
                    return;
                }
                return;
            case 1:
                n71 n71Var2 = this.f27372b;
                n71Var2.f28667a = true;
                n71Var2.f28674e = null;
                if (n71Var2.f28669b != null) {
                    n71Var2.f28681s = true;
                    PhotoViewer photoViewer = n71Var2.M.f39975a;
                    if (photoViewer.f33692u3) {
                        photoViewer.b3(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                n71 n71Var3 = this.f27372b;
                n71Var3.f28667a = true;
                n71Var3.f28674e = null;
                if (n71Var3.f28669b != null) {
                    n71Var3.f28681s = true;
                    PhotoViewer photoViewer2 = n71Var3.M.f39975a;
                    if (photoViewer2.f33692u3) {
                        photoViewer2.b3(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
