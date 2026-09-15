package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class j71 implements Runnable {
    public final int f25249a;
    public final n71 f25250b;

    public j71(n71 n71Var, int i10) {
        this.f25249a = i10;
        this.f25250b = n71Var;
    }

    @Override
    public final void run() {
        switch (this.f25249a) {
            case 0:
                n71 n71Var = this.f25250b;
                n71Var.h = 0.0f;
                b6 b6Var = n71Var.f26377b;
                if (b6Var != null) {
                    b6Var.u();
                    n71Var.f26377b = null;
                    return;
                }
                return;
            case 1:
                n71 n71Var2 = this.f25250b;
                n71Var2.f26375a = true;
                n71Var2.e = null;
                if (n71Var2.f26377b != null) {
                    n71Var2.f26388s = true;
                    PhotoViewer photoViewer = n71Var2.M.f36934a;
                    if (photoViewer.f31079u3) {
                        photoViewer.b3(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                n71 n71Var3 = this.f25250b;
                n71Var3.f26375a = true;
                n71Var3.e = null;
                if (n71Var3.f26377b != null) {
                    n71Var3.f26388s = true;
                    PhotoViewer photoViewer2 = n71Var3.M.f36934a;
                    if (photoViewer2.f31079u3) {
                        photoViewer2.b3(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
