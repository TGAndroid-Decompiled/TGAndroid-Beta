package org.telegram.ui.Components;
public final class uy implements Runnable {
    public final int f40188a;
    public final boolean f40189b;
    public final boolean f40190c;
    public final boolean d;
    public final Object f40191e;

    public uy(Object obj, boolean z10, boolean z11, boolean z12, int i7) {
        this.f40188a = i7;
        this.f40191e = obj;
        this.f40189b = z10;
        this.f40190c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        org.telegram.utils.twidget.y0 y0Var;
        q71 q71Var;
        switch (this.f40188a) {
            case 0:
                wy wyVar = (wy) this.f40191e;
                boolean z10 = this.f40189b;
                boolean z11 = this.f40190c;
                boolean z12 = this.d;
                if (z10) {
                    zy zyVar = wyVar.K;
                    zyVar.f42438a = true;
                    zyVar.f42441b = true;
                }
                if (z11) {
                    wyVar.f41483y = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (z12 || Math.abs(wyVar.f41471b0 - currentTimeMillis) > 30) {
                    wyVar.f41471b0 = currentTimeMillis;
                    wyVar.f41476e0.run();
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.ce0) this.f40191e).O1(this.f40189b, this.f40190c, this.d);
                return;
            default:
                org.telegram.utils.twidget.l1 l1Var = (org.telegram.utils.twidget.l1) this.f40191e;
                boolean z13 = this.f40189b;
                boolean z14 = this.f40190c;
                boolean z15 = this.d;
                if (!l1Var.f54318w && (y0Var = l1Var.L) != null && (q71Var = y0Var.h) != null && q71Var.f38556w && !q71Var.f38557x) {
                    q71Var.k(z13, z14, z15);
                    return;
                }
                return;
        }
    }
}
