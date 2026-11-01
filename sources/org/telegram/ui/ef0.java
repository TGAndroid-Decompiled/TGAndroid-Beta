package org.telegram.ui;

import org.telegram.ui.Components.RadialProgressView;
public final class ef0 implements Runnable {
    public final int f36818a;
    public final e f36819b;
    public final ve0 f36820c;

    public ef0(int i10, e eVar, ve0 ve0Var) {
        this.f36818a = i10;
        this.f36819b = eVar;
        this.f36820c = ve0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f36818a;
        ve0 ve0Var = this.f36820c;
        e eVar = this.f36819b;
        switch (i10) {
            case 0:
                int i11 = ve0.F;
                ve0Var.a();
                org.telegram.messenger.i0.h3(new ef0(1, eVar, ve0Var), 150L);
                return;
            default:
                ff0 ff0Var = (ff0) eVar.f36703b;
                ff0Var.h(null);
                RadialProgressView radialProgressView = ff0Var.f37124a0.N.d;
                RadialProgressView radialProgressView2 = ve0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f24146a = radialProgressView2.f24146a;
                radialProgressView.f24147b = radialProgressView2.f24147b;
                radialProgressView.H = radialProgressView2.H;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.f24148c = radialProgressView2.f24148c;
                radialProgressView.f24150n = radialProgressView2.f24150n;
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
