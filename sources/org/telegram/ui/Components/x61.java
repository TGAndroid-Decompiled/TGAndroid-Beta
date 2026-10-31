package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class x61 implements Runnable {
    public final int f32393a;
    public final b71 f32394b;

    public x61(b71 b71Var, int i10) {
        this.f32393a = i10;
        this.f32394b = b71Var;
    }

    @Override
    public final void run() {
        switch (this.f32393a) {
            case 0:
                b71 b71Var = this.f32394b;
                b71Var.h = 0.0f;
                s5 s5Var = b71Var.f24565b;
                if (s5Var != null) {
                    s5Var.u();
                    b71Var.f24565b = null;
                    return;
                }
                return;
            case 1:
                b71 b71Var2 = this.f32394b;
                b71Var2.f24563a = true;
                b71Var2.e = null;
                if (b71Var2.f24565b != null) {
                    b71Var2.f24576s = true;
                    PhotoViewer photoViewer = b71Var2.M.f43876a;
                    if (photoViewer.f33614u3) {
                        photoViewer.e3(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                b71 b71Var3 = this.f32394b;
                b71Var3.f24563a = true;
                b71Var3.e = null;
                if (b71Var3.f24565b != null) {
                    b71Var3.f24576s = true;
                    PhotoViewer photoViewer2 = b71Var3.M.f43876a;
                    if (photoViewer2.f33614u3) {
                        photoViewer2.e3(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
