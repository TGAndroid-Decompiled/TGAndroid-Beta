package org.telegram.ui;

import org.telegram.ui.Components.RadialProgressView;
public final class ce0 implements Runnable {
    public final int f44294a;
    public final f f44295b;
    public final rd0 f44296c;

    public ce0(int i7, f fVar, rd0 rd0Var) {
        this.f44294a = i7;
        this.f44295b = fVar;
        this.f44296c = rd0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f44294a;
        rd0 rd0Var = this.f44296c;
        f fVar = this.f44295b;
        switch (i7) {
            case 0:
                int i10 = rd0.F;
                rd0Var.a();
                org.telegram.messenger.g0.i3(new ce0(1, fVar, rd0Var), 150L);
                return;
            default:
                de0 de0Var = (de0) fVar.f45545b;
                de0Var.h(null);
                RadialProgressView radialProgressView = de0Var.f44935g0.N.d;
                RadialProgressView radialProgressView2 = rd0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f31504a = radialProgressView2.f31504a;
                radialProgressView.f31505b = radialProgressView2.f31505b;
                radialProgressView.H = radialProgressView2.H;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.f31506c = radialProgressView2.f31506c;
                radialProgressView.f31509n = radialProgressView2.f31509n;
                radialProgressView.f31507e = radialProgressView2.f31507e;
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
