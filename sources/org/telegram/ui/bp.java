package org.telegram.ui;
public final class bp implements Runnable {
    public final int f44468a;
    public final kp f44469b;
    public final long f44470c;

    public bp(kp kpVar, long j3, int i7) {
        this.f44468a = i7;
        this.f44469b = kpVar;
        this.f44470c = j3;
    }

    @Override
    public final void run() {
        switch (this.f44468a) {
            case 0:
                long j3 = this.f44470c;
                kp kpVar = this.f44469b;
                kpVar.f47243n = j3;
                kpVar.f47248r = true;
                kpVar.s0();
                return;
            default:
                kp.e0(this.f44469b, this.f44470c);
                return;
        }
    }
}
