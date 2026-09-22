package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class sx implements Runnable {
    public final int f28330a;
    public final float f28331b;
    public final int f28332c;
    public final Object d;

    public sx(Object obj, float f7, int i10, int i11) {
        this.f28330a = i11;
        this.d = obj;
        this.f28331b = f7;
        this.f28332c = i10;
    }

    @Override
    public final void run() {
        switch (this.f28330a) {
            case 0:
                float f7 = this.f28331b;
                int i10 = this.f28332c;
                kz kzVar = ((tx) this.d).F;
                try {
                    ji.o oVar = new ji.o(kzVar.P.getContext(), 0, f7);
                    oVar.f43145a = i10;
                    kzVar.Q.w0(oVar);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                org.telegram.ui.j71 j71Var = (org.telegram.ui.j71) this.d;
                float f10 = this.f28331b;
                int i11 = this.f28332c;
                try {
                    ji.o oVar2 = new ji.o(j71Var.f34817h0.getContext(), 0, f10);
                    oVar2.f43145a = i11;
                    j71Var.f34837r0.w0(oVar2);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }
}
