package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class yx implements Runnable {
    public final int f35179a;
    public final float f35180b;
    public final int f35181c;
    public final Object d;

    public yx(Object obj, float f7, int i10, int i11) {
        this.f35179a = i11;
        this.d = obj;
        this.f35180b = f7;
        this.f35181c = i10;
    }

    @Override
    public final void run() {
        switch (this.f35179a) {
            case 0:
                float f7 = this.f35180b;
                int i10 = this.f35181c;
                sz szVar = ((zx) this.d).F;
                try {
                    mi.n nVar = new mi.n(szVar.P.getContext(), 0, f7);
                    nVar.f47715a = i10;
                    szVar.Q.w0(nVar);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                org.telegram.ui.f61 f61Var = (org.telegram.ui.f61) this.d;
                float f10 = this.f35180b;
                int i11 = this.f35181c;
                try {
                    mi.n nVar2 = new mi.n(f61Var.f39202h0.getContext(), 0, f10);
                    nVar2.f47715a = i11;
                    f61Var.f39222r0.w0(nVar2);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
