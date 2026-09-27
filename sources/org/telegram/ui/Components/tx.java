package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class tx implements Runnable {
    public final int f28696a;
    public final float f28697b;
    public final int f28698c;
    public final Object d;

    public tx(Object obj, float f7, int i10, int i11) {
        this.f28696a = i11;
        this.d = obj;
        this.f28697b = f7;
        this.f28698c = i10;
    }

    @Override
    public final void run() {
        switch (this.f28696a) {
            case 0:
                float f7 = this.f28697b;
                int i10 = this.f28698c;
                mz mzVar = ((ux) this.d).F;
                try {
                    ji.o oVar = new ji.o(mzVar.P.getContext(), 0, f7);
                    oVar.f43155a = i10;
                    mzVar.Q.w0(oVar);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                org.telegram.ui.c71 c71Var = (org.telegram.ui.c71) this.d;
                float f10 = this.f28697b;
                int i11 = this.f28698c;
                try {
                    ji.o oVar2 = new ji.o(c71Var.f32585h0.getContext(), 0, f10);
                    oVar2.f43155a = i11;
                    c71Var.f32605r0.w0(oVar2);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }
}
