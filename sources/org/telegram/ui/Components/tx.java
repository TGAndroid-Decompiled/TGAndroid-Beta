package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class tx implements Runnable {
    public final int f28640a;
    public final float f28641b;
    public final int f28642c;
    public final Object d;

    public tx(Object obj, float f7, int i10, int i11) {
        this.f28640a = i11;
        this.d = obj;
        this.f28641b = f7;
        this.f28642c = i10;
    }

    @Override
    public final void run() {
        switch (this.f28640a) {
            case 0:
                float f7 = this.f28641b;
                int i10 = this.f28642c;
                lz lzVar = ((ux) this.d).F;
                try {
                    ji.o oVar = new ji.o(lzVar.P.getContext(), 0, f7);
                    oVar.f43111a = i10;
                    lzVar.Q.w0(oVar);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                org.telegram.ui.a71 a71Var = (org.telegram.ui.a71) this.d;
                float f10 = this.f28641b;
                int i11 = this.f28642c;
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
