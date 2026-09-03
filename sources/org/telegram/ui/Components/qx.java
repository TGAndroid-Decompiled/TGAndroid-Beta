package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class qx implements Runnable {
    public final int f28311a;
    public final float f28312b;
    public final int f28313c;
    public final Object d;

    public qx(Object obj, float f10, int i10, int i11) {
        this.f28311a = i11;
        this.d = obj;
        this.f28312b = f10;
        this.f28313c = i10;
    }

    @Override
    public final void run() {
        switch (this.f28311a) {
            case 0:
                float f10 = this.f28312b;
                int i10 = this.f28313c;
                kz kzVar = ((rx) this.d).C;
                try {
                    wh.o oVar = new wh.o(kzVar.M.getContext(), 0, f10);
                    oVar.f5712a = i10;
                    kzVar.N.w0(oVar);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                org.telegram.ui.x61 x61Var = (org.telegram.ui.x61) this.d;
                float f11 = this.f28312b;
                int i11 = this.f28313c;
                try {
                    wh.o oVar2 = new wh.o(x61Var.f39862e0.getContext(), 0, f11);
                    oVar2.f5712a = i11;
                    x61Var.f39882o0.w0(oVar2);
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
        }
    }
}
