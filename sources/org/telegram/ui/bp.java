package org.telegram.ui;
public final class bp implements Runnable {
    public final int f44466a;
    public final kp f44467b;
    public final long f44468c;

    public bp(kp kpVar, long j3, int i7) {
        this.f44466a = i7;
        this.f44467b = kpVar;
        this.f44468c = j3;
    }

    @Override
    public final void run() {
        switch (this.f44466a) {
            case 0:
                long j3 = this.f44468c;
                kp kpVar = this.f44467b;
                kpVar.f47239n = j3;
                kpVar.f47244r = true;
                kpVar.s0();
                return;
            default:
                kp.e0(this.f44467b, this.f44468c);
                return;
        }
    }
}
