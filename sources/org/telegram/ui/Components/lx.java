package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class lx implements Runnable {
    public final int f30454a;
    public final float f30455b;
    public final int f30456c;
    public final Object d;

    public lx(Object obj, float f9, int i10, int i11) {
        this.f30454a = i11;
        this.d = obj;
        this.f30455b = f9;
        this.f30456c = i10;
    }

    @Override
    public final void run() {
        switch (this.f30454a) {
            case 0:
                float f9 = this.f30455b;
                int i10 = this.f30456c;
                fz fzVar = ((nx) this.d).B;
                try {
                    uh.n nVar = new uh.n(fzVar.L.getContext(), 0, f9);
                    nVar.f6373a = i10;
                    fzVar.M.w0(nVar);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                org.telegram.ui.d61 d61Var = (org.telegram.ui.d61) this.d;
                float f10 = this.f30455b;
                int i11 = this.f30456c;
                try {
                    uh.n nVar2 = new uh.n(d61Var.f37326d0.getContext(), 0, f10);
                    nVar2.f6373a = i11;
                    d61Var.f37347n0.w0(nVar2);
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
        }
    }
}
