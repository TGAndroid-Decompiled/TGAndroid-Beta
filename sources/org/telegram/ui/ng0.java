package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public final class ng0 implements Runnable {
    public final int f35877a;
    public final og0 f35878b;
    public final eg0 f35879c;

    public ng0(int i10, eg0 eg0Var, og0 og0Var) {
        this.f35877a = i10;
        this.f35878b = og0Var;
        this.f35879c = eg0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f35877a;
        eg0 eg0Var = this.f35879c;
        og0 og0Var = this.f35878b;
        switch (i10) {
            case 0:
                int i11 = eg0.E;
                eg0Var.a();
                AndroidUtilities.runOnUIThread(new ng0(1, eg0Var, og0Var), 150L);
                return;
            default:
                pg0 pg0Var = og0Var.f36238a;
                pg0Var.h(null);
                RadialProgressView radialProgressView = pg0Var.V.N.d;
                RadialProgressView radialProgressView2 = eg0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f22370a = radialProgressView2.f22370a;
                radialProgressView.f22371b = radialProgressView2.f22371b;
                radialProgressView.H = radialProgressView2.H;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.f22372c = radialProgressView2.f22372c;
                radialProgressView.f22374n = radialProgressView2.f22374n;
                radialProgressView.e = radialProgressView2.e;
                radialProgressView.f22379y = radialProgressView2.f22379y;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.G = radialProgressView2.G;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.b(85L);
                return;
        }
    }
}
