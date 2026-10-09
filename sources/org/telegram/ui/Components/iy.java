package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class iy implements Runnable {
    public final int f27512a;
    public final float f27513b;
    public final int f27514c;
    public final Object d;

    public iy(Object obj, float f7, int i10, int i11) {
        this.f27512a = i11;
        this.d = obj;
        this.f27513b = f7;
        this.f27514c = i10;
    }

    @Override
    public final void run() {
        switch (this.f27512a) {
            case 0:
                float f7 = this.f27513b;
                int i10 = this.f27514c;
                a00 a00Var = ((jy) this.d).F;
                try {
                    ji.o oVar = new ji.o(a00Var.P.getContext(), 0, f7);
                    oVar.f47827a = i10;
                    a00Var.Q.w0(oVar);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                org.telegram.ui.k71 k71Var = (org.telegram.ui.k71) this.d;
                float f10 = this.f27513b;
                int i11 = this.f27514c;
                try {
                    ji.o oVar2 = new ji.o(k71Var.f39132h0.getContext(), 0, f10);
                    oVar2.f47827a = i11;
                    k71Var.f39152r0.w0(oVar2);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
