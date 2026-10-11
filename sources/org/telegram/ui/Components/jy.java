package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class jy implements Runnable {
    public final int f27874a;
    public final float f27875b;
    public final int f27876c;
    public final Object d;

    public jy(Object obj, float f7, int i10, int i11) {
        this.f27874a = i11;
        this.d = obj;
        this.f27875b = f7;
        this.f27876c = i10;
    }

    @Override
    public final void run() {
        switch (this.f27874a) {
            case 0:
                float f7 = this.f27875b;
                int i10 = this.f27876c;
                b00 b00Var = ((ky) this.d).F;
                try {
                    ji.o oVar = new ji.o(b00Var.P.getContext(), 0, f7);
                    oVar.f47951a = i10;
                    b00Var.Q.w0(oVar);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                org.telegram.ui.j71 j71Var = (org.telegram.ui.j71) this.d;
                float f10 = this.f27875b;
                int i11 = this.f27876c;
                try {
                    ji.o oVar2 = new ji.o(j71Var.f38928h0.getContext(), 0, f10);
                    oVar2.f47951a = i11;
                    j71Var.f38948r0.w0(oVar2);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
