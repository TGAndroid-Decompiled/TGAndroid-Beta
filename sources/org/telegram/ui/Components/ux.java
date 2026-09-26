package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class ux implements Runnable {
    public final int f28927a;
    public final float f28928b;
    public final int f28929c;
    public final Object d;

    public ux(Object obj, float f7, int i10, int i11) {
        this.f28927a = i11;
        this.d = obj;
        this.f28928b = f7;
        this.f28929c = i10;
    }

    @Override
    public final void run() {
        switch (this.f28927a) {
            case 0:
                float f7 = this.f28928b;
                int i10 = this.f28929c;
                mz mzVar = ((vx) this.d).F;
                try {
                    ji.o oVar = new ji.o(mzVar.P.getContext(), 0, f7);
                    oVar.f43109a = i10;
                    mzVar.Q.w0(oVar);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                org.telegram.ui.a71 a71Var = (org.telegram.ui.a71) this.d;
                float f10 = this.f28928b;
                int i11 = this.f28929c;
                try {
                    ji.o oVar2 = new ji.o(a71Var.f32026h0.getContext(), 0, f10);
                    oVar2.f43109a = i11;
                    a71Var.f32046r0.w0(oVar2);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }
}
