package org.telegram.ui.Components;
public final class py implements Runnable {
    public final int f37082a;
    public final boolean f37083b;
    public final boolean f37084c;
    public final boolean d;
    public final Object f37085e;

    public py(Object obj, boolean z9, boolean z10, boolean z11, int i7) {
        this.f37082a = i7;
        this.f37085e = obj;
        this.f37083b = z9;
        this.f37084c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        org.telegram.utils.twidget.u uVar;
        o71 o71Var;
        switch (this.f37082a) {
            case 0:
                ry ryVar = (ry) this.f37085e;
                boolean z9 = this.f37083b;
                boolean z10 = this.f37084c;
                boolean z11 = this.d;
                if (z9) {
                    vy vyVar = ryVar.J;
                    vyVar.f39707a = true;
                    vyVar.f39710b = true;
                }
                if (z10) {
                    ryVar.f37829y = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (z11 || Math.abs(ryVar.f37816a0 - currentTimeMillis) > 30) {
                    ryVar.f37816a0 = currentTimeMillis;
                    ryVar.f37821d0.run();
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.ce0) this.f37085e).O1(this.f37083b, this.f37084c, this.d);
                return;
            default:
                org.telegram.utils.twidget.h0 h0Var = (org.telegram.utils.twidget.h0) this.f37085e;
                boolean z12 = this.f37083b;
                boolean z13 = this.f37084c;
                boolean z14 = this.d;
                if (!h0Var.f52817u && (uVar = h0Var.J) != null && (o71Var = uVar.h) != null && o71Var.f36543w && !o71Var.f36544x) {
                    o71Var.k(z12, z13, z14);
                    return;
                }
                return;
        }
    }
}
