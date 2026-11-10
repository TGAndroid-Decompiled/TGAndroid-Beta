package org.telegram.ui.Components;
public final class py implements Runnable {
    public final int f37095a;
    public final boolean f37096b;
    public final boolean f37097c;
    public final boolean d;
    public final Object f37098e;

    public py(Object obj, boolean z9, boolean z10, boolean z11, int i7) {
        this.f37095a = i7;
        this.f37098e = obj;
        this.f37096b = z9;
        this.f37097c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        org.telegram.utils.twidget.v0 v0Var;
        p71 p71Var;
        switch (this.f37095a) {
            case 0:
                ry ryVar = (ry) this.f37098e;
                boolean z9 = this.f37096b;
                boolean z10 = this.f37097c;
                boolean z11 = this.d;
                if (z9) {
                    vy vyVar = ryVar.J;
                    vyVar.f39762a = true;
                    vyVar.f39765b = true;
                }
                if (z10) {
                    ryVar.f37770y = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (z11 || Math.abs(ryVar.f37757a0 - currentTimeMillis) > 30) {
                    ryVar.f37757a0 = currentTimeMillis;
                    ryVar.f37762d0.run();
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.fe0) this.f37098e).O1(this.f37096b, this.f37097c, this.d);
                return;
            default:
                org.telegram.utils.twidget.i1 i1Var = (org.telegram.utils.twidget.i1) this.f37098e;
                boolean z12 = this.f37096b;
                boolean z13 = this.f37097c;
                boolean z14 = this.d;
                if (!i1Var.f52867w && (v0Var = i1Var.L) != null && (p71Var = v0Var.h) != null && p71Var.f36829w && !p71Var.f36830x) {
                    p71Var.k(z12, z13, z14);
                    return;
                }
                return;
        }
    }
}
