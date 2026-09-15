package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class rx implements Runnable {
    public final int f27701a;
    public final float f27702b;
    public final int f27703c;
    public final Object d;

    public rx(Object obj, float f7, int i10, int i11) {
        this.f27701a = i11;
        this.d = obj;
        this.f27702b = f7;
        this.f27703c = i10;
    }

    @Override
    public final void run() {
        switch (this.f27701a) {
            case 0:
                float f7 = this.f27702b;
                int i10 = this.f27703c;
                kz kzVar = ((sx) this.d).F;
                try {
                    ji.o oVar = new ji.o(kzVar.P.getContext(), 0, f7);
                    oVar.f42825a = i10;
                    kzVar.Q.w0(oVar);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                org.telegram.ui.g71 g71Var = (org.telegram.ui.g71) this.d;
                float f10 = this.f27702b;
                int i11 = this.f27703c;
                try {
                    ji.o oVar2 = new ji.o(g71Var.f33796h0.getContext(), 0, f10);
                    oVar2.f42825a = i11;
                    g71Var.f33816r0.w0(oVar2);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }
}
