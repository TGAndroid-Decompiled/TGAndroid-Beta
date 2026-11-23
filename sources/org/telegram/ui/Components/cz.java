package org.telegram.ui.Components;
public final class cz implements Runnable {
    public final int f34296a;
    public final boolean f34297b;
    public final boolean f34298c;
    public final boolean d;
    public final Object f34299e;

    public cz(Object obj, boolean z10, boolean z11, boolean z12, int i7) {
        this.f34296a = i7;
        this.f34299e = obj;
        this.f34297b = z10;
        this.f34298c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        org.telegram.utils.twidget.d1 d1Var;
        d81 d81Var;
        switch (this.f34296a) {
            case 0:
                ez ezVar = (ez) this.f34299e;
                boolean z10 = this.f34297b;
                boolean z11 = this.f34298c;
                boolean z12 = this.d;
                if (z10) {
                    hz hzVar = ezVar.K;
                    hzVar.f35953a = true;
                    hzVar.f35956b = true;
                }
                if (z11) {
                    ezVar.f35008y = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (z12 || Math.abs(ezVar.f34996b0 - currentTimeMillis) > 30) {
                    ezVar.f34996b0 = currentTimeMillis;
                    ezVar.f35001e0.run();
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.de0) this.f34299e).O1(this.f34297b, this.f34298c, this.d);
                return;
            default:
                org.telegram.utils.twidget.p1 p1Var = (org.telegram.utils.twidget.p1) this.f34299e;
                boolean z13 = this.f34297b;
                boolean z14 = this.f34298c;
                boolean z15 = this.d;
                if (!p1Var.A && (d1Var = p1Var.R) != null && (d81Var = d1Var.h) != null && d81Var.f34383w && !d81Var.f34384x) {
                    d81Var.l(z13, z14, z15);
                    return;
                }
                return;
        }
    }
}
