package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class vx implements Runnable {
    public final int f32375a;
    public final float f32376b;
    public final int f32377c;
    public final Object d;

    public vx(Object obj, float f7, int i10, int i11) {
        this.f32375a = i11;
        this.d = obj;
        this.f32376b = f7;
        this.f32377c = i10;
    }

    @Override
    public final void run() {
        switch (this.f32375a) {
            case 0:
                float f7 = this.f32376b;
                int i10 = this.f32377c;
                nz nzVar = ((wx) this.d).F;
                try {
                    ji.o oVar = new ji.o(nzVar.P.getContext(), 0, f7);
                    oVar.f46699a = i10;
                    nzVar.Q.w0(oVar);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                org.telegram.ui.c71 c71Var = (org.telegram.ui.c71) this.d;
                float f10 = this.f32376b;
                int i11 = this.f32377c;
                try {
                    ji.o oVar2 = new ji.o(c71Var.f35320h0.getContext(), 0, f10);
                    oVar2.f46699a = i11;
                    c71Var.f35340r0.w0(oVar2);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
