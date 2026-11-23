package org.telegram.ui;

import org.telegram.ui.Components.RadialProgressView;
public final class be0 implements Runnable {
    public final int f45824a;
    public final f f45825b;
    public final qd0 f45826c;

    public be0(int i7, f fVar, qd0 qd0Var) {
        this.f45824a = i7;
        this.f45825b = fVar;
        this.f45826c = qd0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f45824a;
        qd0 qd0Var = this.f45826c;
        f fVar = this.f45825b;
        switch (i7) {
            case 0:
                int i10 = qd0.G;
                qd0Var.a();
                org.telegram.messenger.g0.h3(new be0(1, fVar, qd0Var), 150L);
                return;
            default:
                ce0 ce0Var = (ce0) fVar.f47394b;
                ce0Var.h(null);
                RadialProgressView radialProgressView = ce0Var.f46528h0.O.d;
                RadialProgressView radialProgressView2 = qd0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f33077a = radialProgressView2.f33077a;
                radialProgressView.f33078b = radialProgressView2.f33078b;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.K = radialProgressView2.K;
                radialProgressView.f33079c = radialProgressView2.f33079c;
                radialProgressView.f33082n = radialProgressView2.f33082n;
                radialProgressView.f33080e = radialProgressView2.f33080e;
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
