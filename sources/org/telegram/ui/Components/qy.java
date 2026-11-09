package org.telegram.ui.Components;
public final class qy implements Runnable {
    public final int f37497a;
    public final boolean f37498b;
    public final boolean f37499c;
    public final boolean d;
    public final Object f37500e;

    public qy(Object obj, boolean z9, boolean z10, boolean z11, int i7) {
        this.f37497a = i7;
        this.f37500e = obj;
        this.f37498b = z9;
        this.f37499c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        org.telegram.utils.twidget.v0 v0Var;
        q71 q71Var;
        switch (this.f37497a) {
            case 0:
                sy syVar = (sy) this.f37500e;
                boolean z9 = this.f37498b;
                boolean z10 = this.f37499c;
                boolean z11 = this.d;
                if (z9) {
                    wy wyVar = syVar.J;
                    wyVar.f40180a = true;
                    wyVar.f40183b = true;
                }
                if (z10) {
                    syVar.f38186y = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (z11 || Math.abs(syVar.f38173a0 - currentTimeMillis) > 30) {
                    syVar.f38173a0 = currentTimeMillis;
                    syVar.f38178d0.run();
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.ee0) this.f37500e).O1(this.f37498b, this.f37499c, this.d);
                return;
            default:
                org.telegram.utils.twidget.i1 i1Var = (org.telegram.utils.twidget.i1) this.f37500e;
                boolean z12 = this.f37498b;
                boolean z13 = this.f37499c;
                boolean z14 = this.d;
                if (!i1Var.f52868w && (v0Var = i1Var.L) != null && (q71Var = v0Var.h) != null && q71Var.f37230w && !q71Var.f37231x) {
                    q71Var.k(z12, z13, z14);
                    return;
                }
                return;
        }
    }
}
