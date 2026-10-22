package org.telegram.ui.Components;
public final class c00 implements Runnable {
    public final int f25080a;
    public final boolean f25081b;
    public final boolean f25082c;
    public final boolean d;
    public final Object e;

    public c00(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.f25080a = i10;
        this.e = obj;
        this.f25081b = z10;
        this.f25082c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f25080a) {
            case 0:
                e00 e00Var = (e00) this.e;
                if (this.f25081b) {
                    i00 i00Var = e00Var.J;
                    i00Var.f27026a = true;
                    i00Var.f27029b = true;
                }
                if (this.f25082c) {
                    e00Var.f25692x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(e00Var.f25681a0 - currentTimeMillis) > 30) {
                    e00Var.f25681a0 = currentTimeMillis;
                    e00Var.f25686d0.run();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.dg0) this.e).w1(this.f25081b, this.f25082c, this.d);
                return;
        }
    }
}
