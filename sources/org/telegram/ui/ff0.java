package org.telegram.ui;

import org.telegram.ui.Components.RadialProgressView;
public final class ff0 implements Runnable {
    public final int f37259a;
    public final e f37260b;
    public final we0 f37261c;

    public ff0(int i10, e eVar, we0 we0Var) {
        this.f37259a = i10;
        this.f37260b = eVar;
        this.f37261c = we0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f37259a;
        we0 we0Var = this.f37261c;
        e eVar = this.f37260b;
        switch (i10) {
            case 0:
                int i11 = we0.F;
                we0Var.a();
                org.telegram.messenger.i0.h3(new ff0(1, eVar, we0Var), 150L);
                return;
            default:
                gf0 gf0Var = (gf0) eVar.f36877b;
                gf0Var.h(null);
                RadialProgressView radialProgressView = gf0Var.f37534a0.N.d;
                RadialProgressView radialProgressView2 = we0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f24145a = radialProgressView2.f24145a;
                radialProgressView.f24146b = radialProgressView2.f24146b;
                radialProgressView.H = radialProgressView2.H;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.f24147c = radialProgressView2.f24147c;
                radialProgressView.f24149n = radialProgressView2.f24149n;
                radialProgressView.e = radialProgressView2.e;
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
