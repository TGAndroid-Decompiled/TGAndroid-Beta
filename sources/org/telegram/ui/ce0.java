package org.telegram.ui;

import org.telegram.ui.Components.RadialProgressView;
public final class ce0 implements Runnable {
    public final int f46499a;
    public final f f46500b;
    public final rd0 f46501c;

    public ce0(int i7, f fVar, rd0 rd0Var) {
        this.f46499a = i7;
        this.f46500b = fVar;
        this.f46501c = rd0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f46499a;
        rd0 rd0Var = this.f46501c;
        f fVar = this.f46500b;
        switch (i7) {
            case 0:
                int i10 = rd0.G;
                rd0Var.a();
                org.telegram.messenger.g0.h3(new ce0(1, fVar, rd0Var), 150L);
                return;
            default:
                de0 de0Var = (de0) fVar.f47360b;
                de0Var.h(null);
                RadialProgressView radialProgressView = de0Var.f46878h0.O.d;
                RadialProgressView radialProgressView2 = rd0Var.h.d;
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
