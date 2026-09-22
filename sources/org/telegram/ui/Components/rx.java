package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class rx implements Runnable {
    public final int f27698a;
    public final float f27699b;
    public final int f27700c;
    public final Object d;

    public rx(Object obj, float f7, int i10, int i11) {
        this.f27698a = i11;
        this.d = obj;
        this.f27699b = f7;
        this.f27700c = i10;
    }

    @Override
    public final void run() {
        switch (this.f27698a) {
            case 0:
                float f7 = this.f27699b;
                int i10 = this.f27700c;
                kz kzVar = ((sx) this.d).F;
                try {
                    ji.o oVar = new ji.o(kzVar.P.getContext(), 0, f7);
                    oVar.f42821a = i10;
                    kzVar.Q.w0(oVar);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                org.telegram.ui.h71 h71Var = (org.telegram.ui.h71) this.d;
                float f10 = this.f27699b;
                int i11 = this.f27700c;
                try {
                    ji.o oVar2 = new ji.o(h71Var.f34132h0.getContext(), 0, f10);
                    oVar2.f42821a = i11;
                    h71Var.f34152r0.w0(oVar2);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }
}
