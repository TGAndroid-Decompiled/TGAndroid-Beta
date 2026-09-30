package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class vx implements Runnable {
    public final int f29736a;
    public final float f29737b;
    public final int f29738c;
    public final Object d;

    public vx(Object obj, float f7, int i10, int i11) {
        this.f29736a = i11;
        this.d = obj;
        this.f29737b = f7;
        this.f29738c = i10;
    }

    @Override
    public final void run() {
        switch (this.f29736a) {
            case 0:
                float f7 = this.f29737b;
                int i10 = this.f29738c;
                nz nzVar = ((wx) this.d).F;
                try {
                    ji.o oVar = new ji.o(nzVar.P.getContext(), 0, f7);
                    oVar.f43218a = i10;
                    nzVar.Q.w0(oVar);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                org.telegram.ui.a71 a71Var = (org.telegram.ui.a71) this.d;
                float f10 = this.f29737b;
                int i11 = this.f29738c;
                try {
                    ji.o oVar2 = new ji.o(a71Var.f32101h0.getContext(), 0, f10);
                    oVar2.f43218a = i11;
                    a71Var.f32121r0.w0(oVar2);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }
}
