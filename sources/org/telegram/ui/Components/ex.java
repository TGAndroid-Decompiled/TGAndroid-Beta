package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class ex implements Runnable {
    public final int f28211a;
    public final float f28212b;
    public final int f28213c;
    public final Object d;

    public ex(Object obj, float f10, int i9, int i10) {
        this.f28211a = i10;
        this.d = obj;
        this.f28212b = f10;
        this.f28213c = i9;
    }

    @Override
    public final void run() {
        switch (this.f28211a) {
            case 0:
                float f10 = this.f28212b;
                int i9 = this.f28213c;
                wy wyVar = ((fx) this.d).B;
                try {
                    rh.n nVar = new rh.n(wyVar.L.getContext(), 0, f10);
                    nVar.f5443a = i9;
                    wyVar.M.w0(nVar);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                org.telegram.ui.b61 b61Var = (org.telegram.ui.b61) this.d;
                float f11 = this.f28212b;
                int i10 = this.f28213c;
                try {
                    rh.n nVar2 = new rh.n(b61Var.f36669d0.getContext(), 0, f11);
                    nVar2.f5443a = i10;
                    b61Var.f36690n0.w0(nVar2);
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
        }
    }
}
