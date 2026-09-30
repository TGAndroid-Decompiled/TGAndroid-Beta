package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public final class ng0 implements Runnable {
    public final int f35987a;
    public final og0 f35988b;
    public final eg0 f35989c;

    public ng0(int i10, eg0 eg0Var, og0 og0Var) {
        this.f35987a = i10;
        this.f35988b = og0Var;
        this.f35989c = eg0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f35987a;
        eg0 eg0Var = this.f35989c;
        og0 og0Var = this.f35988b;
        switch (i10) {
            case 0:
                int i11 = eg0.E;
                eg0Var.a();
                AndroidUtilities.runOnUIThread(new ng0(1, eg0Var, og0Var), 150L);
                return;
            default:
                pg0 pg0Var = og0Var.f36374a;
                pg0Var.h(null);
                RadialProgressView radialProgressView = pg0Var.V.N.d;
                RadialProgressView radialProgressView2 = eg0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f22391a = radialProgressView2.f22391a;
                radialProgressView.f22392b = radialProgressView2.f22392b;
                radialProgressView.H = radialProgressView2.H;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.f22393c = radialProgressView2.f22393c;
                radialProgressView.f22395n = radialProgressView2.f22395n;
                radialProgressView.e = radialProgressView2.e;
                radialProgressView.f22400y = radialProgressView2.f22400y;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.G = radialProgressView2.G;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.b(85L);
                return;
        }
    }
}
