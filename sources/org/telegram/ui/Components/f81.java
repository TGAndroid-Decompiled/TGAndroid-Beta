package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class f81 implements Runnable {
    public final int f26142a;
    public final j81 f26143b;

    public f81(j81 j81Var, int i10) {
        this.f26142a = i10;
        this.f26143b = j81Var;
    }

    @Override
    public final void run() {
        switch (this.f26142a) {
            case 0:
                j81 j81Var = this.f26143b;
                j81Var.h = 0.0f;
                e6 e6Var = j81Var.f27433b;
                if (e6Var != null) {
                    e6Var.u();
                    j81Var.f27433b = null;
                    return;
                }
                return;
            case 1:
                j81 j81Var2 = this.f26143b;
                j81Var2.f27431a = true;
                j81Var2.e = null;
                if (j81Var2.f27433b != null) {
                    j81Var2.f27444s = true;
                    PhotoViewer photoViewer = j81Var2.M.f43539a;
                    if (photoViewer.f33422u3) {
                        photoViewer.d3(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                j81 j81Var3 = this.f26143b;
                j81Var3.f27431a = true;
                j81Var3.e = null;
                if (j81Var3.f27433b != null) {
                    j81Var3.f27444s = true;
                    PhotoViewer photoViewer2 = j81Var3.M.f43539a;
                    if (photoViewer2.f33422u3) {
                        photoViewer2.d3(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
