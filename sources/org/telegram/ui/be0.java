package org.telegram.ui;

import org.telegram.ui.Components.RadialProgressView;
public final class be0 implements Runnable {
    public final int f45876a;
    public final f f45877b;
    public final qd0 f45878c;

    public be0(int i7, f fVar, qd0 qd0Var) {
        this.f45876a = i7;
        this.f45877b = fVar;
        this.f45878c = qd0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f45876a;
        qd0 qd0Var = this.f45878c;
        f fVar = this.f45877b;
        switch (i7) {
            case 0:
                int i10 = qd0.G;
                qd0Var.a();
                org.telegram.messenger.g0.h3(new be0(1, fVar, qd0Var), 150L);
                return;
            default:
                ce0 ce0Var = (ce0) fVar.f47433b;
                ce0Var.h(null);
                RadialProgressView radialProgressView = ce0Var.f46542h0.O.d;
                RadialProgressView radialProgressView2 = qd0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f33111a = radialProgressView2.f33111a;
                radialProgressView.f33112b = radialProgressView2.f33112b;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.K = radialProgressView2.K;
                radialProgressView.f33113c = radialProgressView2.f33113c;
                radialProgressView.f33116n = radialProgressView2.f33116n;
                radialProgressView.f33114e = radialProgressView2.f33114e;
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
