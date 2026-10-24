package org.telegram.ui.Components;
public final class a00 implements Runnable {
    public final int f24580a;
    public final boolean f24581b;
    public final boolean f24582c;
    public final boolean d;
    public final Object e;

    public a00(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.f24580a = i10;
        this.e = obj;
        this.f24581b = z10;
        this.f24582c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f24580a) {
            case 0:
                c00 c00Var = (c00) this.e;
                if (this.f24581b) {
                    g00 g00Var = c00Var.J;
                    g00Var.f26458a = true;
                    g00Var.f26461b = true;
                }
                if (this.f24582c) {
                    c00Var.f25146x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(c00Var.f25135a0 - currentTimeMillis) > 30) {
                    c00Var.f25135a0 = currentTimeMillis;
                    c00Var.f25140d0.run();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.hg0) this.e).A1(this.f24581b, this.f24582c, this.d);
                return;
        }
    }
}
