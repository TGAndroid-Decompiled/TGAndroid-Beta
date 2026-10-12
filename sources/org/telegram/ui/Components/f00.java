package org.telegram.ui.Components;
public final class f00 implements Runnable {
    public final int f24842a;
    public final boolean f24843b;
    public final boolean f24844c;
    public final boolean d;
    public final Object e;

    public f00(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.f24842a = i10;
        this.e = obj;
        this.f24843b = z10;
        this.f24844c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f24842a) {
            case 0:
                h00 h00Var = (h00) this.e;
                if (this.f24843b) {
                    l00 l00Var = h00Var.J;
                    l00Var.f26845a = true;
                    l00Var.f26848b = true;
                }
                if (this.f24844c) {
                    h00Var.f25454x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(h00Var.f25443a0 - currentTimeMillis) > 30) {
                    h00Var.f25443a0 = currentTimeMillis;
                    h00Var.f25448d0.run();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.bh0) this.e).w1(this.f24843b, this.f24844c, this.d);
                return;
        }
    }
}
