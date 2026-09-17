package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class sx implements Runnable {
    public final int f30436a;
    public final float f30437b;
    public final int f30438c;
    public final Object d;

    public sx(Object obj, float f7, int i10, int i11) {
        this.f30436a = i11;
        this.d = obj;
        this.f30437b = f7;
        this.f30438c = i10;
    }

    @Override
    public final void run() {
        switch (this.f30436a) {
            case 0:
                float f7 = this.f30437b;
                int i10 = this.f30438c;
                kz kzVar = ((tx) this.d).F;
                try {
                    ki.p pVar = new ki.p(kzVar.P.getContext(), 0, f7);
                    pVar.f45907a = i10;
                    kzVar.Q.w0(pVar);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                org.telegram.ui.j71 j71Var = (org.telegram.ui.j71) this.d;
                float f10 = this.f30437b;
                int i11 = this.f30438c;
                try {
                    ki.p pVar2 = new ki.p(j71Var.f37647h0.getContext(), 0, f10);
                    pVar2.f45907a = i11;
                    j71Var.f37667r0.w0(pVar2);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
