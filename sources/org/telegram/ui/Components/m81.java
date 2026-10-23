package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class m81 implements Runnable {
    public final int f28602a;
    public final q81 f28603b;

    public m81(q81 q81Var, int i10) {
        this.f28602a = i10;
        this.f28603b = q81Var;
    }

    @Override
    public final void run() {
        switch (this.f28602a) {
            case 0:
                q81 q81Var = this.f28603b;
                q81Var.h = 0.0f;
                e6 e6Var = q81Var.f29790b;
                if (e6Var != null) {
                    e6Var.u();
                    q81Var.f29790b = null;
                    return;
                }
                return;
            case 1:
                q81 q81Var2 = this.f28603b;
                q81Var2.f29788a = true;
                q81Var2.e = null;
                if (q81Var2.f29790b != null) {
                    q81Var2.f29801s = true;
                    PhotoViewer photoViewer = q81Var2.M.f36158a;
                    if (photoViewer.f33724u3) {
                        photoViewer.d3(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                q81 q81Var3 = this.f28603b;
                q81Var3.f29788a = true;
                q81Var3.e = null;
                if (q81Var3.f29790b != null) {
                    q81Var3.f29801s = true;
                    PhotoViewer photoViewer2 = q81Var3.M.f36158a;
                    if (photoViewer2.f33724u3) {
                        photoViewer2.d3(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
