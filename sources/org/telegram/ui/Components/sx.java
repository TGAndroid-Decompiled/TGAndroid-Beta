package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class sx implements Runnable {
    public final int f31190a;
    public final float f31191b;
    public final int f31192c;
    public final Object d;

    public sx(Object obj, float f10, int i10, int i11) {
        this.f31190a = i11;
        this.d = obj;
        this.f31191b = f10;
        this.f31192c = i10;
    }

    @Override
    public final void run() {
        switch (this.f31190a) {
            case 0:
                float f10 = this.f31191b;
                int i10 = this.f31192c;
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
                org.telegram.ui.r61 r61Var = (org.telegram.ui.r61) this.d;
                float f11 = this.f31191b;
                int i11 = this.f31192c;
                try {
                    xh.o oVar2 = new xh.o(r61Var.f40791e0.getContext(), 0, f11);
                    oVar2.f5805a = i11;
                    r61Var.f40811o0.w0(oVar2);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
