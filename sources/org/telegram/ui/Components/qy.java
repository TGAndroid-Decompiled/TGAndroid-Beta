package org.telegram.ui.Components;
public final class qy implements Runnable {
    public final int f37452a;
    public final boolean f37453b;
    public final boolean f37454c;
    public final boolean d;
    public final Object f37455e;

    public qy(Object obj, boolean z9, boolean z10, boolean z11, int i7) {
        this.f37452a = i7;
        this.f37455e = obj;
        this.f37453b = z9;
        this.f37454c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        org.telegram.utils.twidget.v0 v0Var;
        p71 p71Var;
        switch (this.f37452a) {
            case 0:
                sy syVar = (sy) this.f37455e;
                boolean z9 = this.f37453b;
                boolean z10 = this.f37454c;
                boolean z11 = this.d;
                if (z9) {
                    wy wyVar = syVar.J;
                    wyVar.f40069a = true;
                    wyVar.f40072b = true;
                }
                if (z10) {
                    syVar.f38173y = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (z11 || Math.abs(syVar.f38160a0 - currentTimeMillis) > 30) {
                    syVar.f38160a0 = currentTimeMillis;
                    syVar.f38165d0.run();
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.ce0) this.f37455e).O1(this.f37453b, this.f37454c, this.d);
                return;
            default:
                org.telegram.utils.twidget.h1 h1Var = (org.telegram.utils.twidget.h1) this.f37455e;
                boolean z12 = this.f37453b;
                boolean z13 = this.f37454c;
                boolean z14 = this.d;
                if (!h1Var.f52844w && (v0Var = h1Var.L) != null && (p71Var = v0Var.h) != null && p71Var.f36833w && !p71Var.f36834x) {
                    p71Var.k(z12, z13, z14);
                    return;
                }
                return;
        }
    }
}
