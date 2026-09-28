package org.telegram.ui.Components;
public final class vz implements Runnable {
    public final int f29770a;
    public final boolean f29771b;
    public final boolean f29772c;
    public final boolean d;
    public final Object e;

    public vz(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.f29770a = i10;
        this.e = obj;
        this.f29771b = z10;
        this.f29772c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f29770a) {
            case 0:
                xz xzVar = (xz) this.e;
                if (this.f29771b) {
                    b00 b00Var = xzVar.J;
                    b00Var.f22774a = true;
                    b00Var.f22777b = true;
                }
                if (this.f29772c) {
                    xzVar.f30516x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(xzVar.f30505a0 - currentTimeMillis) > 30) {
                    xzVar.f30505a0 = currentTimeMillis;
                    xzVar.f30510d0.run();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.qg0) this.e).w1(this.f29771b, this.f29772c, this.d);
                return;
        }
    }
}
