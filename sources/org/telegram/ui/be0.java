package org.telegram.ui;

import org.telegram.ui.Components.RadialProgressView;
public final class be0 implements Runnable {
    public final int f45872a;
    public final f f45873b;
    public final qd0 f45874c;

    public be0(int i7, f fVar, qd0 qd0Var) {
        this.f45872a = i7;
        this.f45873b = fVar;
        this.f45874c = qd0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f45872a;
        qd0 qd0Var = this.f45874c;
        f fVar = this.f45873b;
        switch (i7) {
            case 0:
                int i10 = qd0.G;
                qd0Var.a();
                org.telegram.messenger.g0.h3(new be0(1, fVar, qd0Var), 150L);
                return;
            default:
                ce0 ce0Var = (ce0) fVar.f47429b;
                ce0Var.h(null);
                RadialProgressView radialProgressView = ce0Var.f46539h0.O.d;
                RadialProgressView radialProgressView2 = qd0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f33108a = radialProgressView2.f33108a;
                radialProgressView.f33109b = radialProgressView2.f33109b;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.K = radialProgressView2.K;
                radialProgressView.f33110c = radialProgressView2.f33110c;
                radialProgressView.f33113n = radialProgressView2.f33113n;
                radialProgressView.f33111e = radialProgressView2.f33111e;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.G = radialProgressView2.G;
                radialProgressView.H = radialProgressView2.H;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.b(85L);
                return;
        }
    }
}
