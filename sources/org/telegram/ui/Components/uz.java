package org.telegram.ui.Components;
public final class uz implements Runnable {
    public final int f28945a;
    public final boolean f28946b;
    public final boolean f28947c;
    public final boolean d;
    public final Object e;

    public uz(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.f28945a = i10;
        this.e = obj;
        this.f28946b = z10;
        this.f28947c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f28945a) {
            case 0:
                wz wzVar = (wz) this.e;
                if (this.f28946b) {
                    a00 a00Var = wzVar.J;
                    a00Var.f22457a = true;
                    a00Var.f22460b = true;
                }
                if (this.f28947c) {
                    wzVar.f30205x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(wzVar.f30194a0 - currentTimeMillis) > 30) {
                    wzVar.f30194a0 = currentTimeMillis;
                    wzVar.f30199d0.run();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.qg0) this.e).w1(this.f28946b, this.f28947c, this.d);
                return;
        }
    }
}
