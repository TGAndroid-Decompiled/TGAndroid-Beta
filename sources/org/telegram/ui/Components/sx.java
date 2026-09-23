package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class sx implements Runnable {
    public final int f27999a;
    public final float f28000b;
    public final int f28001c;
    public final Object d;

    public sx(Object obj, float f7, int i10, int i11) {
        this.f27999a = i11;
        this.d = obj;
        this.f28000b = f7;
        this.f28001c = i10;
    }

    @Override
    public final void run() {
        switch (this.f27999a) {
            case 0:
                float f7 = this.f28000b;
                int i10 = this.f28001c;
                lz lzVar = ((tx) this.d).F;
                try {
                    ji.o oVar = new ji.o(lzVar.P.getContext(), 0, f7);
                    oVar.f42777a = i10;
                    lzVar.Q.w0(oVar);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                org.telegram.ui.z61 z61Var = (org.telegram.ui.z61) this.d;
                float f10 = this.f28000b;
                int i11 = this.f28001c;
                try {
                    ji.o oVar2 = new ji.o(z61Var.f40021h0.getContext(), 0, f10);
                    oVar2.f42777a = i11;
                    z61Var.f40041r0.w0(oVar2);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }
}
