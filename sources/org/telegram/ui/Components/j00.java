package org.telegram.ui.Components;
public final class j00 implements Runnable {
    public final int f27538a;
    public final boolean f27539b;
    public final boolean f27540c;
    public final boolean d;
    public final Object f27541e;

    public j00(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.f27538a = i10;
        this.f27541e = obj;
        this.f27539b = z10;
        this.f27540c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f27538a) {
            case 0:
                l00 l00Var = (l00) this.f27541e;
                if (this.f27539b) {
                    p00 p00Var = l00Var.J;
                    p00Var.f29619a = true;
                    p00Var.f29622b = true;
                }
                if (this.f27540c) {
                    l00Var.f28201x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(l00Var.f28189a0 - currentTimeMillis) > 30) {
                    l00Var.f28189a0 = currentTimeMillis;
                    l00Var.f28194d0.run();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.wg0) this.f27541e).w1(this.f27539b, this.f27540c, this.d);
                return;
        }
    }
}
