package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class h81 implements Runnable {
    public final int f27139a;
    public final l81 f27140b;

    public h81(l81 l81Var, int i10) {
        this.f27139a = i10;
        this.f27140b = l81Var;
    }

    @Override
    public final void run() {
        switch (this.f27139a) {
            case 0:
                l81 l81Var = this.f27140b;
                l81Var.h = 0.0f;
                d6 d6Var = l81Var.f28401b;
                if (d6Var != null) {
                    d6Var.u();
                    l81Var.f28401b = null;
                    return;
                }
                return;
            case 1:
                l81 l81Var2 = this.f27140b;
                l81Var2.f28399a = true;
                l81Var2.f28406e = null;
                if (l81Var2.f28401b != null) {
                    l81Var2.f28413s = true;
                    PhotoViewer photoViewer = l81Var2.M.f38388a;
                    if (photoViewer.f34057u3) {
                        photoViewer.b3(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                l81 l81Var3 = this.f27140b;
                l81Var3.f28399a = true;
                l81Var3.f28406e = null;
                if (l81Var3.f28401b != null) {
                    l81Var3.f28413s = true;
                    PhotoViewer photoViewer2 = l81Var3.M.f38388a;
                    if (photoViewer2.f34057u3) {
                        photoViewer2.b3(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
