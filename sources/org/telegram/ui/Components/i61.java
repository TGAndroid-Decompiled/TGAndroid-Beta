package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class i61 implements Runnable {
    public final int f36067a;
    public final l61 f36068b;

    public i61(l61 l61Var, int i7) {
        this.f36067a = i7;
        this.f36068b = l61Var;
    }

    @Override
    public final void run() {
        switch (this.f36067a) {
            case 0:
                l61 l61Var = this.f36068b;
                l61Var.h = 0.0f;
                b6 b6Var = l61Var.f37042b;
                if (b6Var != null) {
                    b6Var.u();
                    l61Var.f37042b = null;
                    return;
                }
                return;
            case 1:
                l61 l61Var2 = this.f36068b;
                l61Var2.f37040a = true;
                l61Var2.f37047e = null;
                if (l61Var2.f37042b != null) {
                    l61Var2.f37055s = true;
                    PhotoViewer photoViewer = l61Var2.N.f51296a;
                    if (photoViewer.f43340u3) {
                        photoViewer.Z2(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                l61 l61Var3 = this.f36068b;
                l61Var3.f37040a = true;
                l61Var3.f37047e = null;
                if (l61Var3.f37042b != null) {
                    l61Var3.f37055s = true;
                    PhotoViewer photoViewer2 = l61Var3.N.f51296a;
                    if (photoViewer2.f43340u3) {
                        photoViewer2.Z2(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
