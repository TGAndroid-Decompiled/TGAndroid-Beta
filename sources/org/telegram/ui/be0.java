package org.telegram.ui;

import org.telegram.ui.Components.RadialProgressView;
public final class be0 implements Runnable {
    public final int f45852a;
    public final f f45853b;
    public final qd0 f45854c;

    public be0(int i7, f fVar, qd0 qd0Var) {
        this.f45852a = i7;
        this.f45853b = fVar;
        this.f45854c = qd0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f45852a;
        qd0 qd0Var = this.f45854c;
        f fVar = this.f45853b;
        switch (i7) {
            case 0:
                int i10 = qd0.G;
                qd0Var.a();
                org.telegram.messenger.g0.h3(new be0(1, fVar, qd0Var), 150L);
                return;
            default:
                ce0 ce0Var = (ce0) fVar.f47404b;
                ce0Var.h(null);
                RadialProgressView radialProgressView = ce0Var.f46512h0.O.d;
                RadialProgressView radialProgressView2 = qd0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f33075a = radialProgressView2.f33075a;
                radialProgressView.f33076b = radialProgressView2.f33076b;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.K = radialProgressView2.K;
                radialProgressView.f33077c = radialProgressView2.f33077c;
                radialProgressView.f33080n = radialProgressView2.f33080n;
                radialProgressView.f33078e = radialProgressView2.f33078e;
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
