package org.telegram.ui.Components;
public final class ez implements Runnable {
    public final int f25895a;
    public final boolean f25896b;
    public final boolean f25897c;
    public final boolean d;
    public final Object e;

    public ez(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.f25895a = i10;
        this.e = obj;
        this.f25896b = z10;
        this.f25897c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        org.telegram.utils.twidget.w wVar;
        q81 q81Var;
        switch (this.f25895a) {
            case 0:
                gz gzVar = (gz) this.e;
                boolean z10 = this.f25896b;
                boolean z11 = this.f25897c;
                boolean z12 = this.d;
                if (z10) {
                    jz jzVar = gzVar.J;
                    jzVar.f27522a = true;
                    jzVar.f27525b = true;
                }
                if (z11) {
                    gzVar.f26554y = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (z12 || Math.abs(gzVar.f26542a0 - currentTimeMillis) > 30) {
                    gzVar.f26542a0 = currentTimeMillis;
                    gzVar.f26547d0.run();
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.hf0) this.e).E1(this.f25896b, this.f25897c, this.d);
                return;
            default:
                org.telegram.utils.twidget.k0 k0Var = (org.telegram.utils.twidget.k0) this.e;
                boolean z13 = this.f25896b;
                boolean z14 = this.f25897c;
                boolean z15 = this.d;
                if (!k0Var.f44385u && (wVar = k0Var.J) != null && (q81Var = wVar.h) != null && q81Var.f29596w && !q81Var.f29597x) {
                    q81Var.l(z13, z14, z15);
                    return;
                }
                return;
        }
    }
}
