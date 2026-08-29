package org.telegram.ui;
public final class mh implements Runnable {
    public final int f40561a = 1;
    public final int f40562b;
    public final tn f40563c;
    public final boolean d;

    public mh(int i10, tn tnVar, boolean z10) {
        this.f40562b = i10;
        this.f40563c = tnVar;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f40561a) {
            case 0:
                boolean z10 = this.d;
                this.f40563c.yc(this.f40562b, z10);
                return;
            default:
                int i10 = this.f40562b;
                tn tnVar = this.f40563c;
                if (i10 != 2) {
                    tnVar.U9();
                    tnVar.Yb();
                }
                qh.p0.f(org.telegram.ui.Components.tc.a0(tnVar), i10, this.d);
                return;
        }
    }

    public mh(tn tnVar, boolean z10, int i10) {
        this.f40563c = tnVar;
        this.d = z10;
        this.f40562b = i10;
    }
}
