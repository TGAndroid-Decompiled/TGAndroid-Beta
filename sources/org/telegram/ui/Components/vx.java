package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class vx implements Runnable {
    public final int f32433a;
    public final float f32434b;
    public final int f32435c;
    public final Object d;

    public vx(Object obj, float f7, int i10, int i11) {
        this.f32433a = i11;
        this.d = obj;
        this.f32434b = f7;
        this.f32435c = i10;
    }

    @Override
    public final void run() {
        switch (this.f32433a) {
            case 0:
                float f7 = this.f32434b;
                int i10 = this.f32435c;
                nz nzVar = ((wx) this.d).F;
                try {
                    ji.o oVar = new ji.o(nzVar.P.getContext(), 0, f7);
                    oVar.f46706a = i10;
                    nzVar.Q.w0(oVar);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                org.telegram.ui.a71 a71Var = (org.telegram.ui.a71) this.d;
                float f10 = this.f32434b;
                int i11 = this.f32435c;
                try {
                    ji.o oVar2 = new ji.o(a71Var.f34739h0.getContext(), 0, f10);
                    oVar2.f46706a = i11;
                    a71Var.f34759r0.w0(oVar2);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
