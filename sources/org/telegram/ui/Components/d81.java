package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class d81 implements Runnable {
    public final int f25512a;
    public final h81 f25513b;

    public d81(h81 h81Var, int i10) {
        this.f25512a = i10;
        this.f25513b = h81Var;
    }

    @Override
    public final void run() {
        switch (this.f25512a) {
            case 0:
                h81 h81Var = this.f25513b;
                h81Var.h = 0.0f;
                e6 e6Var = h81Var.f26795b;
                if (e6Var != null) {
                    e6Var.u();
                    h81Var.f26795b = null;
                    return;
                }
                return;
            case 1:
                h81 h81Var2 = this.f25513b;
                h81Var2.f26793a = true;
                h81Var2.e = null;
                if (h81Var2.f26795b != null) {
                    h81Var2.f26806s = true;
                    PhotoViewer photoViewer = h81Var2.M.f43794a;
                    if (photoViewer.f33410u3) {
                        photoViewer.b3(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                h81 h81Var3 = this.f25513b;
                h81Var3.f26793a = true;
                h81Var3.e = null;
                if (h81Var3.f26795b != null) {
                    h81Var3.f26806s = true;
                    PhotoViewer photoViewer2 = h81Var3.M.f43794a;
                    if (photoViewer2.f33410u3) {
                        photoViewer2.b3(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
