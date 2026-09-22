package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class y71 implements Runnable {
    public final int f30575a;
    public final d81 f30576b;

    public y71(d81 d81Var, int i10) {
        this.f30575a = i10;
        this.f30576b = d81Var;
    }

    @Override
    public final void run() {
        switch (this.f30575a) {
            case 0:
                d81 d81Var = this.f30576b;
                d81Var.h = 0.0f;
                c6 c6Var = d81Var.f23587b;
                if (c6Var != null) {
                    c6Var.u();
                    d81Var.f23587b = null;
                    return;
                }
                return;
            case 1:
                d81 d81Var2 = this.f30576b;
                d81Var2.f23585a = true;
                d81Var2.e = null;
                if (d81Var2.f23587b != null) {
                    d81Var2.f23598s = true;
                    PhotoViewer photoViewer = d81Var2.M.f37242a;
                    if (photoViewer.f31385u3) {
                        photoViewer.a3(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                d81 d81Var3 = this.f30576b;
                d81Var3.f23585a = true;
                d81Var3.e = null;
                if (d81Var3.f23587b != null) {
                    d81Var3.f23598s = true;
                    PhotoViewer photoViewer2 = d81Var3.M.f37242a;
                    if (photoViewer2.f31385u3) {
                        photoViewer2.a3(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
