package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class sx implements Runnable {
    public final int f30462a;
    public final float f30463b;
    public final int f30464c;
    public final Object d;

    public sx(Object obj, float f7, int i10, int i11) {
        this.f30462a = i11;
        this.d = obj;
        this.f30463b = f7;
        this.f30464c = i10;
    }

    @Override
    public final void run() {
        switch (this.f30462a) {
            case 0:
                float f7 = this.f30463b;
                int i10 = this.f30464c;
                kz kzVar = ((tx) this.d).F;
                try {
                    ki.p pVar = new ki.p(kzVar.P.getContext(), 0, f7);
                    pVar.f45934a = i10;
                    kzVar.Q.w0(pVar);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                org.telegram.ui.j71 j71Var = (org.telegram.ui.j71) this.d;
                float f10 = this.f30463b;
                int i11 = this.f30464c;
                try {
                    ki.p pVar2 = new ki.p(j71Var.f37673h0.getContext(), 0, f10);
                    pVar2.f45934a = i11;
                    j71Var.f37693r0.w0(pVar2);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
