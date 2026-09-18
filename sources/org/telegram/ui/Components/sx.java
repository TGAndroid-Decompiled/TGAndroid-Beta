package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class sx implements Runnable {
    public final int f28243a;
    public final float f28244b;
    public final int f28245c;
    public final Object d;

    public sx(Object obj, float f7, int i10, int i11) {
        this.f28243a = i11;
        this.d = obj;
        this.f28244b = f7;
        this.f28245c = i10;
    }

    @Override
    public final void run() {
        switch (this.f28243a) {
            case 0:
                float f7 = this.f28244b;
                int i10 = this.f28245c;
                kz kzVar = ((tx) this.d).F;
                try {
                    ji.o oVar = new ji.o(kzVar.P.getContext(), 0, f7);
                    oVar.f43079a = i10;
                    kzVar.Q.w0(oVar);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                org.telegram.ui.g71 g71Var = (org.telegram.ui.g71) this.d;
                float f10 = this.f28244b;
                int i11 = this.f28245c;
                try {
                    ji.o oVar2 = new ji.o(g71Var.f33728h0.getContext(), 0, f10);
                    oVar2.f43079a = i11;
                    g71Var.f33748r0.w0(oVar2);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }
}
