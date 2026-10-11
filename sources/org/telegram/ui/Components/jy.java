package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class jy implements Runnable {
    public final int f27771a;
    public final float f27772b;
    public final int f27773c;
    public final Object d;

    public jy(Object obj, float f7, int i10, int i11) {
        this.f27771a = i11;
        this.d = obj;
        this.f27772b = f7;
        this.f27773c = i10;
    }

    @Override
    public final void run() {
        switch (this.f27771a) {
            case 0:
                float f7 = this.f27772b;
                int i10 = this.f27773c;
                b00 b00Var = ((ky) this.d).F;
                try {
                    ji.o oVar = new ji.o(b00Var.P.getContext(), 0, f7);
                    oVar.f47917a = i10;
                    b00Var.Q.w0(oVar);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                org.telegram.ui.j71 j71Var = (org.telegram.ui.j71) this.d;
                float f10 = this.f27772b;
                int i11 = this.f27773c;
                try {
                    ji.o oVar2 = new ji.o(j71Var.f38894h0.getContext(), 0, f10);
                    oVar2.f47917a = i11;
                    j71Var.f38914r0.w0(oVar2);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
