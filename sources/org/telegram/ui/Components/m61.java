package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class m61 implements Runnable {
    public final int f37421a;
    public final p61 f37422b;

    public m61(p61 p61Var, int i7) {
        this.f37421a = i7;
        this.f37422b = p61Var;
    }

    @Override
    public final void run() {
        switch (this.f37421a) {
            case 0:
                p61 p61Var = this.f37422b;
                p61Var.h = 0.0f;
                b6 b6Var = p61Var.f38394b;
                if (b6Var != null) {
                    b6Var.u();
                    p61Var.f38394b = null;
                    return;
                }
                return;
            case 1:
                p61 p61Var2 = this.f37422b;
                p61Var2.f38392a = true;
                p61Var2.f38399e = null;
                if (p61Var2.f38394b != null) {
                    p61Var2.f38407s = true;
                    PhotoViewer photoViewer = p61Var2.N.f51496a;
                    if (photoViewer.f43466u3) {
                        photoViewer.a3(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                p61 p61Var3 = this.f37422b;
                p61Var3.f38392a = true;
                p61Var3.f38399e = null;
                if (p61Var3.f38394b != null) {
                    p61Var3.f38407s = true;
                    PhotoViewer photoViewer2 = p61Var3.N.f51496a;
                    if (photoViewer2.f43466u3) {
                        photoViewer2.a3(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
