package org.telegram.ui;

import org.telegram.ui.Components.RadialProgressView;
public final class be0 implements Runnable {
    public final int f46024a;
    public final f f46025b;
    public final pd0 f46026c;

    public be0(int i7, f fVar, pd0 pd0Var) {
        this.f46024a = i7;
        this.f46025b = fVar;
        this.f46026c = pd0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f46024a;
        pd0 pd0Var = this.f46026c;
        f fVar = this.f46025b;
        switch (i7) {
            case 0:
                int i10 = pd0.G;
                pd0Var.a();
                org.telegram.messenger.g0.h3(new be0(1, fVar, pd0Var), 150L);
                return;
            default:
                ce0 ce0Var = (ce0) fVar.f47651b;
                ce0Var.h(null);
                RadialProgressView radialProgressView = ce0Var.f46781h0.O.d;
                RadialProgressView radialProgressView2 = pd0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f33175a = radialProgressView2.f33175a;
                radialProgressView.f33176b = radialProgressView2.f33176b;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.K = radialProgressView2.K;
                radialProgressView.f33177c = radialProgressView2.f33177c;
                radialProgressView.f33180n = radialProgressView2.f33180n;
                radialProgressView.f33178e = radialProgressView2.f33178e;
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
