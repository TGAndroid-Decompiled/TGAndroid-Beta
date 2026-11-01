package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class y61 implements Runnable {
    public final int f32750a;
    public final c71 f32751b;

    public y61(c71 c71Var, int i10) {
        this.f32750a = i10;
        this.f32751b = c71Var;
    }

    @Override
    public final void run() {
        switch (this.f32750a) {
            case 0:
                c71 c71Var = this.f32751b;
                c71Var.h = 0.0f;
                s5 s5Var = c71Var.f25044b;
                if (s5Var != null) {
                    s5Var.u();
                    c71Var.f25044b = null;
                    return;
                }
                return;
            case 1:
                c71 c71Var2 = this.f32751b;
                c71Var2.f25042a = true;
                c71Var2.e = null;
                if (c71Var2.f25044b != null) {
                    c71Var2.f25055s = true;
                    PhotoViewer photoViewer = c71Var2.M.f43143a;
                    if (photoViewer.f33621u3) {
                        photoViewer.e3(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                c71 c71Var3 = this.f32751b;
                c71Var3.f25042a = true;
                c71Var3.e = null;
                if (c71Var3.f25044b != null) {
                    c71Var3.f25055s = true;
                    PhotoViewer photoViewer2 = c71Var3.M.f43143a;
                    if (photoViewer2.f33621u3) {
                        photoViewer2.e3(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
