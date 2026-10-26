package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class yx implements Runnable {
    public final int f35146a;
    public final float f35147b;
    public final int f35148c;
    public final Object d;

    public yx(Object obj, float f7, int i10, int i11) {
        this.f35146a = i11;
        this.d = obj;
        this.f35147b = f7;
        this.f35148c = i10;
    }

    @Override
    public final void run() {
        switch (this.f35146a) {
            case 0:
                float f7 = this.f35147b;
                int i10 = this.f35148c;
                sz szVar = ((zx) this.d).F;
                try {
                    mi.n nVar = new mi.n(szVar.P.getContext(), 0, f7);
                    nVar.f47680a = i10;
                    szVar.Q.w0(nVar);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                org.telegram.ui.c61 c61Var = (org.telegram.ui.c61) this.d;
                float f10 = this.f35147b;
                int i11 = this.f35148c;
                try {
                    mi.n nVar2 = new mi.n(c61Var.f38299h0.getContext(), 0, f10);
                    nVar2.f47680a = i11;
                    c61Var.f38319r0.w0(nVar2);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
