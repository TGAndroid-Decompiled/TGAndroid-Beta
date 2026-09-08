package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class j71 implements Runnable {
    public final int f27398a;
    public final n71 f27399b;

    public j71(n71 n71Var, int i10) {
        this.f27398a = i10;
        this.f27399b = n71Var;
    }

    @Override
    public final void run() {
        switch (this.f27398a) {
            case 0:
                n71 n71Var = this.f27399b;
                n71Var.h = 0.0f;
                d6 d6Var = n71Var.f28696b;
                if (d6Var != null) {
                    d6Var.u();
                    n71Var.f28696b = null;
                    return;
                }
                return;
            case 1:
                n71 n71Var2 = this.f27399b;
                n71Var2.f28694a = true;
                n71Var2.f28701e = null;
                if (n71Var2.f28696b != null) {
                    n71Var2.f28708s = true;
                    PhotoViewer photoViewer = n71Var2.M.f40002a;
                    if (photoViewer.f33719u3) {
                        photoViewer.b3(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                n71 n71Var3 = this.f27399b;
                n71Var3.f28694a = true;
                n71Var3.f28701e = null;
                if (n71Var3.f28696b != null) {
                    n71Var3.f28708s = true;
                    PhotoViewer photoViewer2 = n71Var3.M.f40002a;
                    if (photoViewer2.f33719u3) {
                        photoViewer2.b3(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
