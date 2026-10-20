package org.telegram.ui.Components;
public final class c00 implements Runnable {
    public final int f25077a;
    public final boolean f25078b;
    public final boolean f25079c;
    public final boolean d;
    public final Object e;

    public c00(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.f25077a = i10;
        this.e = obj;
        this.f25078b = z10;
        this.f25079c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f25077a) {
            case 0:
                e00 e00Var = (e00) this.e;
                if (this.f25078b) {
                    i00 i00Var = e00Var.J;
                    i00Var.f27023a = true;
                    i00Var.f27026b = true;
                }
                if (this.f25079c) {
                    e00Var.f25689x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(e00Var.f25678a0 - currentTimeMillis) > 30) {
                    e00Var.f25678a0 = currentTimeMillis;
                    e00Var.f25683d0.run();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.dg0) this.e).w1(this.f25078b, this.f25079c, this.d);
                return;
        }
    }
}
