package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class sx implements Runnable {
    public final int f31196a;
    public final float f31197b;
    public final int f31198c;
    public final Object d;

    public sx(Object obj, float f10, int i10, int i11) {
        this.f31196a = i11;
        this.d = obj;
        this.f31197b = f10;
        this.f31198c = i10;
    }

    @Override
    public final void run() {
        switch (this.f31196a) {
            case 0:
                float f10 = this.f31197b;
                int i10 = this.f31198c;
                mz mzVar = ((tx) this.d).C;
                try {
                    xh.o oVar = new xh.o(mzVar.M.getContext(), 0, f10);
                    oVar.f5805a = i10;
                    mzVar.N.w0(oVar);
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            default:
                org.telegram.ui.w61 w61Var = (org.telegram.ui.w61) this.d;
                float f11 = this.f31197b;
                int i11 = this.f31198c;
                try {
                    xh.o oVar2 = new xh.o(w61Var.f42314e0.getContext(), 0, f11);
                    oVar2.f5805a = i11;
                    w61Var.f42334o0.w0(oVar2);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
