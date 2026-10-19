package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class e81 implements Runnable {
    public final int f25849a;
    public final i81 f25850b;

    public e81(i81 i81Var, int i10) {
        this.f25849a = i10;
        this.f25850b = i81Var;
    }

    @Override
    public final void run() {
        switch (this.f25849a) {
            case 0:
                i81 i81Var = this.f25850b;
                i81Var.h = 0.0f;
                e6 e6Var = i81Var.f27143b;
                if (e6Var != null) {
                    e6Var.u();
                    i81Var.f27143b = null;
                    return;
                }
                return;
            case 1:
                i81 i81Var2 = this.f25850b;
                i81Var2.f27141a = true;
                i81Var2.e = null;
                if (i81Var2.f27143b != null) {
                    i81Var2.f27154s = true;
                    PhotoViewer photoViewer = i81Var2.M.f43533a;
                    if (photoViewer.f33416u3) {
                        photoViewer.b3(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                i81 i81Var3 = this.f25850b;
                i81Var3.f27141a = true;
                i81Var3.e = null;
                if (i81Var3.f27143b != null) {
                    i81Var3.f27154s = true;
                    PhotoViewer photoViewer2 = i81Var3.M.f43533a;
                    if (photoViewer2.f33416u3) {
                        photoViewer2.b3(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
