package org.telegram.ui.Components;
public final class uz implements Runnable {
    public final int f28952a;
    public final boolean f28953b;
    public final boolean f28954c;
    public final boolean d;
    public final Object e;

    public uz(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.f28952a = i10;
        this.e = obj;
        this.f28953b = z10;
        this.f28954c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f28952a) {
            case 0:
                wz wzVar = (wz) this.e;
                if (this.f28953b) {
                    a00 a00Var = wzVar.J;
                    a00Var.f22472a = true;
                    a00Var.f22475b = true;
                }
                if (this.f28954c) {
                    wzVar.f30220x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(wzVar.f30209a0 - currentTimeMillis) > 30) {
                    wzVar.f30209a0 = currentTimeMillis;
                    wzVar.f30214d0.run();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.qg0) this.e).w1(this.f28953b, this.f28954c, this.d);
                return;
        }
    }
}
