package org.telegram.ui.Components;
public final class zy implements Runnable {
    public final int f43079a;
    public final boolean f43080b;
    public final boolean f43081c;
    public final boolean d;
    public final Object f43082e;

    public zy(Object obj, boolean z10, boolean z11, boolean z12, int i7) {
        this.f43079a = i7;
        this.f43082e = obj;
        this.f43080b = z10;
        this.f43081c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        org.telegram.utils.twidget.d1 d1Var;
        e81 e81Var;
        switch (this.f43079a) {
            case 0:
                bz bzVar = (bz) this.f43082e;
                boolean z10 = this.f43080b;
                boolean z11 = this.f43081c;
                boolean z12 = this.d;
                if (z10) {
                    ez ezVar = bzVar.K;
                    ezVar.f34867a = true;
                    ezVar.f34870b = true;
                }
                if (z11) {
                    bzVar.f33858y = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (z12 || Math.abs(bzVar.f33846b0 - currentTimeMillis) > 30) {
                    bzVar.f33846b0 = currentTimeMillis;
                    bzVar.f33851e0.run();
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.de0) this.f43082e).O1(this.f43080b, this.f43081c, this.d);
                return;
            default:
                org.telegram.utils.twidget.p1 p1Var = (org.telegram.utils.twidget.p1) this.f43082e;
                boolean z13 = this.f43080b;
                boolean z14 = this.f43081c;
                boolean z15 = this.d;
                if (!p1Var.A && (d1Var = p1Var.R) != null && (e81Var = d1Var.h) != null && e81Var.f34664w && !e81Var.f34665x) {
                    e81Var.l(z13, z14, z15);
                    return;
                }
                return;
        }
    }
}
