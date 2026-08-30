package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class qx implements Runnable {
    public final int f28297a;
    public final float f28298b;
    public final int f28299c;
    public final Object d;

    public qx(Object obj, float f10, int i10, int i11) {
        this.f28297a = i11;
        this.d = obj;
        this.f28298b = f10;
        this.f28299c = i10;
    }

    @Override
    public final void run() {
        switch (this.f28297a) {
            case 0:
                float f10 = this.f28298b;
                int i10 = this.f28299c;
                kz kzVar = ((rx) this.d).C;
                try {
                    wh.o oVar = new wh.o(kzVar.M.getContext(), 0, f10);
                    oVar.f5723a = i10;
                    kzVar.N.w0(oVar);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                org.telegram.ui.q61 q61Var = (org.telegram.ui.q61) this.d;
                float f11 = this.f28298b;
                int i11 = this.f28299c;
                try {
                    wh.o oVar2 = new wh.o(q61Var.f37605e0.getContext(), 0, f11);
                    oVar2.f5723a = i11;
                    q61Var.f37625o0.w0(oVar2);
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
        }
    }
}
