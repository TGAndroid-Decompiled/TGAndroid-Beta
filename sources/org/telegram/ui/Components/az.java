package org.telegram.ui.Components;
public final class az implements Runnable {
    public final int f33492a;
    public final boolean f33493b;
    public final boolean f33494c;
    public final boolean d;
    public final Object f33495e;

    public az(Object obj, boolean z10, boolean z11, boolean z12, int i7) {
        this.f33492a = i7;
        this.f33495e = obj;
        this.f33493b = z10;
        this.f33494c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        org.telegram.utils.twidget.d1 d1Var;
        a81 a81Var;
        switch (this.f33492a) {
            case 0:
                cz czVar = (cz) this.f33495e;
                boolean z10 = this.f33493b;
                boolean z11 = this.f33494c;
                boolean z12 = this.d;
                if (z10) {
                    fz fzVar = czVar.K;
                    fzVar.f35189a = true;
                    fzVar.f35192b = true;
                }
                if (z11) {
                    czVar.f34218y = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (z12 || Math.abs(czVar.f34206b0 - currentTimeMillis) > 30) {
                    czVar.f34206b0 = currentTimeMillis;
                    czVar.f34211e0.run();
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.ee0) this.f33495e).O1(this.f33493b, this.f33494c, this.d);
                return;
            default:
                org.telegram.utils.twidget.p1 p1Var = (org.telegram.utils.twidget.p1) this.f33495e;
                boolean z13 = this.f33493b;
                boolean z14 = this.f33494c;
                boolean z15 = this.d;
                if (!p1Var.A && (d1Var = p1Var.R) != null && (a81Var = d1Var.h) != null && a81Var.f33285w && !a81Var.f33286x) {
                    a81Var.l(z13, z14, z15);
                    return;
                }
                return;
        }
    }
}
