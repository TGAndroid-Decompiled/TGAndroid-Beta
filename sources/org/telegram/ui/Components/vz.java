package org.telegram.ui.Components;
public final class vz implements Runnable {
    public final int f29769a;
    public final boolean f29770b;
    public final boolean f29771c;
    public final boolean d;
    public final Object e;

    public vz(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.f29769a = i10;
        this.e = obj;
        this.f29770b = z10;
        this.f29771c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f29769a) {
            case 0:
                xz xzVar = (xz) this.e;
                if (this.f29770b) {
                    b00 b00Var = xzVar.J;
                    b00Var.f22773a = true;
                    b00Var.f22776b = true;
                }
                if (this.f29771c) {
                    xzVar.f30515x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(xzVar.f30504a0 - currentTimeMillis) > 30) {
                    xzVar.f30504a0 = currentTimeMillis;
                    xzVar.f30509d0.run();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.qg0) this.e).w1(this.f29770b, this.f29771c, this.d);
                return;
        }
    }
}
