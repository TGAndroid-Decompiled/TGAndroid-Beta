package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class ux implements Runnable {
    public final int f28898a;
    public final float f28899b;
    public final int f28900c;
    public final Object d;

    public ux(Object obj, float f7, int i10, int i11) {
        this.f28898a = i11;
        this.d = obj;
        this.f28899b = f7;
        this.f28900c = i10;
    }

    @Override
    public final void run() {
        switch (this.f28898a) {
            case 0:
                float f7 = this.f28899b;
                int i10 = this.f28900c;
                mz mzVar = ((vx) this.d).F;
                try {
                    ji.o oVar = new ji.o(mzVar.P.getContext(), 0, f7);
                    oVar.f43111a = i10;
                    mzVar.Q.w0(oVar);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                org.telegram.ui.a71 a71Var = (org.telegram.ui.a71) this.d;
                float f10 = this.f28899b;
                int i11 = this.f28900c;
                try {
                    ji.o oVar2 = new ji.o(a71Var.f32028h0.getContext(), 0, f10);
                    oVar2.f43111a = i11;
                    a71Var.f32048r0.w0(oVar2);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }
}
