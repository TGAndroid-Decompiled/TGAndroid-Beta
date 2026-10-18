package org.telegram.ui.Components;
public final class c00 implements Runnable {
    public final int f25065a;
    public final boolean f25066b;
    public final boolean f25067c;
    public final boolean d;
    public final Object e;

    public c00(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.f25065a = i10;
        this.e = obj;
        this.f25066b = z10;
        this.f25067c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f25065a) {
            case 0:
                e00 e00Var = (e00) this.e;
                if (this.f25066b) {
                    i00 i00Var = e00Var.J;
                    i00Var.f26975a = true;
                    i00Var.f26978b = true;
                }
                if (this.f25067c) {
                    e00Var.f25770x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(e00Var.f25759a0 - currentTimeMillis) > 30) {
                    e00Var.f25759a0 = currentTimeMillis;
                    e00Var.f25764d0.run();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.eg0) this.e).w1(this.f25066b, this.f25067c, this.d);
                return;
        }
    }
}
