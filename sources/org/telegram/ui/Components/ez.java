package org.telegram.ui.Components;
public final class ez implements Runnable {
    public final int f25973a;
    public final boolean f25974b;
    public final boolean f25975c;
    public final boolean d;
    public final Object e;

    public ez(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.f25973a = i10;
        this.e = obj;
        this.f25974b = z10;
        this.f25975c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        org.telegram.utils.twidget.w wVar;
        r81 r81Var;
        switch (this.f25973a) {
            case 0:
                gz gzVar = (gz) this.e;
                boolean z10 = this.f25974b;
                boolean z11 = this.f25975c;
                boolean z12 = this.d;
                if (z10) {
                    jz jzVar = gzVar.J;
                    jzVar.f27607a = true;
                    jzVar.f27610b = true;
                }
                if (z11) {
                    gzVar.f26601y = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (z12 || Math.abs(gzVar.f26589a0 - currentTimeMillis) > 30) {
                    gzVar.f26589a0 = currentTimeMillis;
                    gzVar.f26594d0.run();
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.gf0) this.e).F1(this.f25974b, this.f25975c, this.d);
                return;
            default:
                org.telegram.utils.twidget.k0 k0Var = (org.telegram.utils.twidget.k0) this.e;
                boolean z13 = this.f25974b;
                boolean z14 = this.f25975c;
                boolean z15 = this.d;
                if (!k0Var.f44396u && (wVar = k0Var.J) != null && (r81Var = wVar.h) != null && r81Var.f29958w && !r81Var.f29959x) {
                    r81Var.l(z13, z14, z15);
                    return;
                }
                return;
        }
    }
}
