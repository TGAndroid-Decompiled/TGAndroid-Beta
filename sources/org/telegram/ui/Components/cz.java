package org.telegram.ui.Components;
public final class cz implements Runnable {
    public final int f34339a;
    public final boolean f34340b;
    public final boolean f34341c;
    public final boolean d;
    public final Object f34342e;

    public cz(Object obj, boolean z10, boolean z11, boolean z12, int i7) {
        this.f34339a = i7;
        this.f34342e = obj;
        this.f34340b = z10;
        this.f34341c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        org.telegram.utils.twidget.d1 d1Var;
        d81 d81Var;
        switch (this.f34339a) {
            case 0:
                ez ezVar = (ez) this.f34342e;
                boolean z10 = this.f34340b;
                boolean z11 = this.f34341c;
                boolean z12 = this.d;
                if (z10) {
                    hz hzVar = ezVar.K;
                    hzVar.f36005a = true;
                    hzVar.f36008b = true;
                }
                if (z11) {
                    ezVar.f35035y = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (z12 || Math.abs(ezVar.f35023b0 - currentTimeMillis) > 30) {
                    ezVar.f35023b0 = currentTimeMillis;
                    ezVar.f35028e0.run();
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.de0) this.f34342e).O1(this.f34340b, this.f34341c, this.d);
                return;
            default:
                org.telegram.utils.twidget.p1 p1Var = (org.telegram.utils.twidget.p1) this.f34342e;
                boolean z13 = this.f34340b;
                boolean z14 = this.f34341c;
                boolean z15 = this.d;
                if (!p1Var.A && (d1Var = p1Var.R) != null && (d81Var = d1Var.h) != null && d81Var.f34425w && !d81Var.f34426x) {
                    d81Var.l(z13, z14, z15);
                    return;
                }
                return;
        }
    }
}
