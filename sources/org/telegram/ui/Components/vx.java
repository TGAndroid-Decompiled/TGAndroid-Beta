package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class vx implements Runnable {
    public final int f32369a;
    public final float f32370b;
    public final int f32371c;
    public final Object d;

    public vx(Object obj, float f7, int i10, int i11) {
        this.f32369a = i11;
        this.d = obj;
        this.f32370b = f7;
        this.f32371c = i10;
    }

    @Override
    public final void run() {
        switch (this.f32369a) {
            case 0:
                float f7 = this.f32370b;
                int i10 = this.f32371c;
                nz nzVar = ((wx) this.d).F;
                try {
                    ji.o oVar = new ji.o(nzVar.P.getContext(), 0, f7);
                    oVar.f46692a = i10;
                    nzVar.Q.w0(oVar);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                org.telegram.ui.c71 c71Var = (org.telegram.ui.c71) this.d;
                float f10 = this.f32370b;
                int i11 = this.f32371c;
                try {
                    ji.o oVar2 = new ji.o(c71Var.f35315h0.getContext(), 0, f10);
                    oVar2.f46692a = i11;
                    c71Var.f35335r0.w0(oVar2);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
