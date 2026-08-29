package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class a71 implements Runnable {
    public final int f26682a;
    public final d71 f26683b;

    public a71(d71 d71Var, int i10) {
        this.f26682a = i10;
        this.f26683b = d71Var;
    }

    @Override
    public final void run() {
        switch (this.f26682a) {
            case 0:
                d71 d71Var = this.f26683b;
                d71Var.h = 0.0f;
                c6 c6Var = d71Var.f27688b;
                if (c6Var != null) {
                    c6Var.u();
                    d71Var.f27688b = null;
                    return;
                }
                return;
            case 1:
                d71 d71Var2 = this.f26683b;
                d71Var2.f27686a = true;
                d71Var2.f27692e = null;
                if (d71Var2.f27688b != null) {
                    d71Var2.f27696s = true;
                    PhotoViewer photoViewer = d71Var2.I.f41212a;
                    if (photoViewer.f35794q3) {
                        photoViewer.b3(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                d71 d71Var3 = this.f26683b;
                d71Var3.f27686a = true;
                d71Var3.f27692e = null;
                if (d71Var3.f27688b != null) {
                    d71Var3.f27696s = true;
                    PhotoViewer photoViewer2 = d71Var3.I.f41212a;
                    if (photoViewer2.f35794q3) {
                        photoViewer2.b3(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
