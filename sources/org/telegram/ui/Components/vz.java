package org.telegram.ui.Components;
public final class vz implements Runnable {
    public final int f29813a;
    public final boolean f29814b;
    public final boolean f29815c;
    public final boolean d;
    public final Object e;

    public vz(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.f29813a = i10;
        this.e = obj;
        this.f29814b = z10;
        this.f29815c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f29813a) {
            case 0:
                xz xzVar = (xz) this.e;
                if (this.f29814b) {
                    b00 b00Var = xzVar.J;
                    b00Var.f22810a = true;
                    b00Var.f22813b = true;
                }
                if (this.f29815c) {
                    xzVar.f30520x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(xzVar.f30509a0 - currentTimeMillis) > 30) {
                    xzVar.f30509a0 = currentTimeMillis;
                    xzVar.f30514d0.run();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.tg0) this.e).w1(this.f29814b, this.f29815c, this.d);
                return;
        }
    }
}
