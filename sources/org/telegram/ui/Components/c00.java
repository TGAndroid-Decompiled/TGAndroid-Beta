package org.telegram.ui.Components;
public final class c00 implements Runnable {
    public final int f27016a;
    public final boolean f27017b;
    public final boolean f27018c;
    public final boolean d;
    public final Object e;

    public c00(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.f27016a = i10;
        this.e = obj;
        this.f27017b = z10;
        this.f27018c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        xb1 xb1Var;
        switch (this.f27016a) {
            case 0:
                e00 e00Var = (e00) this.e;
                boolean z10 = this.f27017b;
                boolean z11 = this.f27018c;
                boolean z12 = this.d;
                if (z10) {
                    i00 i00Var = e00Var.J;
                    i00Var.f29082a = true;
                    i00Var.f29085b = true;
                }
                if (z11) {
                    e00Var.f27679x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (z12 || Math.abs(e00Var.f27668a0 - currentTimeMillis) > 30) {
                    e00Var.f27668a0 = currentTimeMillis;
                    e00Var.f27673d0.run();
                    return;
                }
                return;
            case 1:
                yb1 yb1Var = (yb1) this.e;
                boolean z13 = this.f27017b;
                boolean z14 = this.f27018c;
                boolean z15 = this.d;
                if (!yb1Var.f35018s && (xb1Var = yb1Var.H) != null) {
                    xb1Var.b(z13, z14, z15);
                    return;
                }
                return;
            default:
                ((org.telegram.ui.gg0) this.e).B1(this.f27017b, this.f27018c, this.d);
                return;
        }
    }
}
