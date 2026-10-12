package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class ly implements Runnable {
    public final int f28308a;
    public final float f28309b;
    public final int f28310c;
    public final Object d;

    public ly(Object obj, float f7, int i10, int i11) {
        this.f28308a = i11;
        this.d = obj;
        this.f28309b = f7;
        this.f28310c = i10;
    }

    @Override
    public final void run() {
        switch (this.f28308a) {
            case 0:
                float f7 = this.f28309b;
                int i10 = this.f28310c;
                d00 d00Var = ((my) this.d).F;
                try {
                    ji.o oVar = new ji.o(d00Var.P.getContext(), 0, f7);
                    oVar.f48058a = i10;
                    d00Var.Q.w0(oVar);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                org.telegram.ui.n71 n71Var = (org.telegram.ui.n71) this.d;
                float f10 = this.f28309b;
                int i11 = this.f28310c;
                try {
                    ji.o oVar2 = new ji.o(n71Var.f40272h0.getContext(), 0, f10);
                    oVar2.f48058a = i11;
                    n71Var.f40292r0.w0(oVar2);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
