package org.telegram.ui.Components;
public final class vz implements Runnable {
    public final int f29793a;
    public final boolean f29794b;
    public final boolean f29795c;
    public final boolean d;
    public final Object e;

    public vz(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.f29793a = i10;
        this.e = obj;
        this.f29794b = z10;
        this.f29795c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f29793a) {
            case 0:
                xz xzVar = (xz) this.e;
                if (this.f29794b) {
                    b00 b00Var = xzVar.J;
                    b00Var.f22793a = true;
                    b00Var.f22796b = true;
                }
                if (this.f29795c) {
                    xzVar.f30504x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(xzVar.f30493a0 - currentTimeMillis) > 30) {
                    xzVar.f30493a0 = currentTimeMillis;
                    xzVar.f30498d0.run();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.qg0) this.e).w1(this.f29794b, this.f29795c, this.d);
                return;
        }
    }
}
