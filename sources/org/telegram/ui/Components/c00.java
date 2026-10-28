package org.telegram.ui.Components;
public final class c00 implements Runnable {
    public final int f27012a;
    public final boolean f27013b;
    public final boolean f27014c;
    public final boolean d;
    public final Object e;

    public c00(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.f27012a = i10;
        this.e = obj;
        this.f27013b = z10;
        this.f27014c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        cc1 cc1Var;
        switch (this.f27012a) {
            case 0:
                e00 e00Var = (e00) this.e;
                boolean z10 = this.f27013b;
                boolean z11 = this.f27014c;
                boolean z12 = this.d;
                if (z10) {
                    i00 i00Var = e00Var.J;
                    i00Var.f29112a = true;
                    i00Var.f29115b = true;
                }
                if (z11) {
                    e00Var.f27647x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (z12 || Math.abs(e00Var.f27636a0 - currentTimeMillis) > 30) {
                    e00Var.f27636a0 = currentTimeMillis;
                    e00Var.f27641d0.run();
                    return;
                }
                return;
            case 1:
                dc1 dc1Var = (dc1) this.e;
                boolean z13 = this.f27013b;
                boolean z14 = this.f27014c;
                boolean z15 = this.d;
                if (!dc1Var.f27412t && (cc1Var = dc1Var.I) != null) {
                    cc1Var.d(z13, z14, z15);
                    return;
                }
                return;
            default:
                ((org.telegram.ui.ig0) this.e).B1(this.f27013b, this.f27014c, this.d);
                return;
        }
    }
}
