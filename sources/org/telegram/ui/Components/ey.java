package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class ey implements Runnable {
    public final int f24817a;
    public final float f24818b;
    public final int f24819c;
    public final Object d;

    public ey(Object obj, float f7, int i10, int i11) {
        this.f24817a = i11;
        this.d = obj;
        this.f24818b = f7;
        this.f24819c = i10;
    }

    @Override
    public final void run() {
        switch (this.f24817a) {
            case 0:
                float f7 = this.f24818b;
                int i10 = this.f24819c;
                wz wzVar = ((fy) this.d).F;
                try {
                    ki.o oVar = new ki.o(wzVar.P.getContext(), 0, f7);
                    oVar.f44979a = i10;
                    wzVar.Q.w0(oVar);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                org.telegram.ui.r71 r71Var = (org.telegram.ui.r71) this.d;
                float f10 = this.f24818b;
                int i11 = this.f24819c;
                try {
                    ki.o oVar2 = new ki.o(r71Var.f39637h0.getContext(), 0, f10);
                    oVar2.f44979a = i11;
                    r71Var.f39657r0.w0(oVar2);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }
}
