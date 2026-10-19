package org.telegram.ui.Components;
public final class c00 implements Runnable {
    public final int f25054a;
    public final boolean f25055b;
    public final boolean f25056c;
    public final boolean d;
    public final Object e;

    public c00(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.f25054a = i10;
        this.e = obj;
        this.f25055b = z10;
        this.f25056c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f25054a) {
            case 0:
                e00 e00Var = (e00) this.e;
                if (this.f25055b) {
                    i00 i00Var = e00Var.J;
                    i00Var.f26970a = true;
                    i00Var.f26973b = true;
                }
                if (this.f25056c) {
                    e00Var.f25713x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(e00Var.f25702a0 - currentTimeMillis) > 30) {
                    e00Var.f25702a0 = currentTimeMillis;
                    e00Var.f25707d0.run();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.cg0) this.e).w1(this.f25055b, this.f25056c, this.d);
                return;
        }
    }
}
