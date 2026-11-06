package org.telegram.ui;
public final class bp implements Runnable {
    public final int f44445a;
    public final kp f44446b;
    public final long f44447c;

    public bp(kp kpVar, long j3, int i7) {
        this.f44445a = i7;
        this.f44446b = kpVar;
        this.f44447c = j3;
    }

    @Override
    public final void run() {
        switch (this.f44445a) {
            case 0:
                long j3 = this.f44447c;
                kp kpVar = this.f44446b;
                kpVar.f47216n = j3;
                kpVar.f47221r = true;
                kpVar.s0();
                return;
            default:
                kp.e0(this.f44446b, this.f44447c);
                return;
        }
    }
}
