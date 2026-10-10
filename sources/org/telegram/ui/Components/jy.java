package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class jy implements Runnable {
    public final int f27815a;
    public final float f27816b;
    public final int f27817c;
    public final Object d;

    public jy(Object obj, float f7, int i10, int i11) {
        this.f27815a = i11;
        this.d = obj;
        this.f27816b = f7;
        this.f27817c = i10;
    }

    @Override
    public final void run() {
        switch (this.f27815a) {
            case 0:
                float f7 = this.f27816b;
                int i10 = this.f27817c;
                b00 b00Var = ((ky) this.d).F;
                try {
                    ji.o oVar = new ji.o(b00Var.P.getContext(), 0, f7);
                    oVar.f47871a = i10;
                    b00Var.Q.w0(oVar);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                org.telegram.ui.k71 k71Var = (org.telegram.ui.k71) this.d;
                float f10 = this.f27816b;
                int i11 = this.f27817c;
                try {
                    ji.o oVar2 = new ji.o(k71Var.f39176h0.getContext(), 0, f10);
                    oVar2.f47871a = i11;
                    k71Var.f39196r0.w0(oVar2);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
