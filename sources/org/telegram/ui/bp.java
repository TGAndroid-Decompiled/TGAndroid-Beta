package org.telegram.ui;
public final class bp implements Runnable {
    public final int f44465a;
    public final kp f44466b;
    public final long f44467c;

    public bp(kp kpVar, long j3, int i7) {
        this.f44465a = i7;
        this.f44466b = kpVar;
        this.f44467c = j3;
    }

    @Override
    public final void run() {
        switch (this.f44465a) {
            case 0:
                long j3 = this.f44467c;
                kp kpVar = this.f44466b;
                kpVar.f47238n = j3;
                kpVar.f47243r = true;
                kpVar.s0();
                return;
            default:
                kp.e0(this.f44466b, this.f44467c);
                return;
        }
    }
}
