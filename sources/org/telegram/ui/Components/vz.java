package org.telegram.ui.Components;
public final class vz implements Runnable {
    public final int f29766a;
    public final boolean f29767b;
    public final boolean f29768c;
    public final boolean d;
    public final Object e;

    public vz(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.f29766a = i10;
        this.e = obj;
        this.f29767b = z10;
        this.f29768c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f29766a) {
            case 0:
                xz xzVar = (xz) this.e;
                if (this.f29767b) {
                    b00 b00Var = xzVar.J;
                    b00Var.f22761a = true;
                    b00Var.f22764b = true;
                }
                if (this.f29768c) {
                    xzVar.f30514x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(xzVar.f30503a0 - currentTimeMillis) > 30) {
                    xzVar.f30503a0 = currentTimeMillis;
                    xzVar.f30508d0.run();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.qg0) this.e).w1(this.f29767b, this.f29768c, this.d);
                return;
        }
    }
}
