package org.telegram.ui;

import org.telegram.ui.Components.RadialProgressView;
public final class de0 implements Runnable {
    public final int f44968a;
    public final f f44969b;
    public final sd0 f44970c;

    public de0(int i7, f fVar, sd0 sd0Var) {
        this.f44968a = i7;
        this.f44969b = fVar;
        this.f44970c = sd0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f44968a;
        sd0 sd0Var = this.f44970c;
        f fVar = this.f44969b;
        switch (i7) {
            case 0:
                int i10 = sd0.F;
                sd0Var.a();
                org.telegram.messenger.g0.i3(new de0(1, fVar, sd0Var), 150L);
                return;
            default:
                ee0 ee0Var = (ee0) fVar.f45464b;
                ee0Var.h(null);
                RadialProgressView radialProgressView = ee0Var.f45255g0.N.d;
                RadialProgressView radialProgressView2 = sd0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f31515a = radialProgressView2.f31515a;
                radialProgressView.f31516b = radialProgressView2.f31516b;
                radialProgressView.H = radialProgressView2.H;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.f31517c = radialProgressView2.f31517c;
                radialProgressView.f31520n = radialProgressView2.f31520n;
                radialProgressView.f31518e = radialProgressView2.f31518e;
                radialProgressView.D = radialProgressView2.D;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.G = radialProgressView2.G;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.b(85L);
                return;
        }
    }
}
