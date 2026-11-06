package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class r51 implements Runnable {
    public final int f37620a;
    public final u51 f37621b;

    public r51(u51 u51Var, int i7) {
        this.f37620a = i7;
        this.f37621b = u51Var;
    }

    @Override
    public final void run() {
        switch (this.f37620a) {
            case 0:
                u51 u51Var = this.f37621b;
                u51Var.h = 0.0f;
                v5 v5Var = u51Var.f38531b;
                if (v5Var != null) {
                    v5Var.u();
                    u51Var.f38531b = null;
                    return;
                }
                return;
            case 1:
                u51 u51Var2 = this.f37621b;
                u51Var2.f38529a = true;
                u51Var2.f38536e = null;
                if (u51Var2.f38531b != null) {
                    u51Var2.f38543s = true;
                    PhotoViewer photoViewer = u51Var2.M.f47537a;
                    if (photoViewer.f41490t3) {
                        photoViewer.Y2(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                u51 u51Var3 = this.f37621b;
                u51Var3.f38529a = true;
                u51Var3.f38536e = null;
                if (u51Var3.f38531b != null) {
                    u51Var3.f38543s = true;
                    PhotoViewer photoViewer2 = u51Var3.M.f47537a;
                    if (photoViewer2.f41490t3) {
                        photoViewer2.Y2(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
