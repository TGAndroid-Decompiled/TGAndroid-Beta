package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public final class bg0 implements Runnable {
    public final int f35657a;
    public final cg0 f35658b;
    public final sf0 f35659c;

    public bg0(int i10, sf0 sf0Var, cg0 cg0Var) {
        this.f35657a = i10;
        this.f35658b = cg0Var;
        this.f35659c = sf0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f35657a;
        sf0 sf0Var = this.f35659c;
        cg0 cg0Var = this.f35658b;
        switch (i10) {
            case 0:
                int i11 = sf0.E;
                sf0Var.a();
                AndroidUtilities.runOnUIThread(new bg0(1, sf0Var, cg0Var), 150L);
                return;
            default:
                dg0 dg0Var = cg0Var.f35907a;
                dg0Var.h(null);
                RadialProgressView radialProgressView = dg0Var.V.N.d;
                RadialProgressView radialProgressView2 = sf0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f24322a = radialProgressView2.f24322a;
                radialProgressView.f24323b = radialProgressView2.f24323b;
                radialProgressView.H = radialProgressView2.H;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.f24324c = radialProgressView2.f24324c;
                radialProgressView.f24326n = radialProgressView2.f24326n;
                radialProgressView.e = radialProgressView2.e;
                radialProgressView.f24331y = radialProgressView2.f24331y;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.G = radialProgressView2.G;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.b(85L);
                return;
        }
    }
}
