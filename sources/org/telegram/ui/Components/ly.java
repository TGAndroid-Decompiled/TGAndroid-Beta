package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class ly implements Runnable {
    public final int f28303a;
    public final float f28304b;
    public final int f28305c;
    public final Object d;

    public ly(Object obj, float f7, int i10, int i11) {
        this.f28303a = i11;
        this.d = obj;
        this.f28304b = f7;
        this.f28305c = i10;
    }

    @Override
    public final void run() {
        switch (this.f28303a) {
            case 0:
                float f7 = this.f28304b;
                int i10 = this.f28305c;
                d00 d00Var = ((my) this.d).F;
                try {
                    ji.o oVar = new ji.o(d00Var.P.getContext(), 0, f7);
                    oVar.f48066a = i10;
                    d00Var.Q.w0(oVar);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                org.telegram.ui.n71 n71Var = (org.telegram.ui.n71) this.d;
                float f10 = this.f28304b;
                int i11 = this.f28305c;
                try {
                    ji.o oVar2 = new ji.o(n71Var.f40275h0.getContext(), 0, f10);
                    oVar2.f48066a = i11;
                    n71Var.f40295r0.w0(oVar2);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
