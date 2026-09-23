package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public final class og0 implements Runnable {
    public final int f35866a;
    public final pg0 f35867b;
    public final fg0 f35868c;

    public og0(int i10, fg0 fg0Var, pg0 pg0Var) {
        this.f35866a = i10;
        this.f35867b = pg0Var;
        this.f35868c = fg0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f35866a;
        fg0 fg0Var = this.f35868c;
        pg0 pg0Var = this.f35867b;
        switch (i10) {
            case 0:
                int i11 = fg0.E;
                fg0Var.a();
                AndroidUtilities.runOnUIThread(new og0(1, fg0Var, pg0Var), 150L);
                return;
            default:
                qg0 qg0Var = pg0Var.f36108a;
                qg0Var.h(null);
                RadialProgressView radialProgressView = qg0Var.V.N.d;
                RadialProgressView radialProgressView2 = fg0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f22118a = radialProgressView2.f22118a;
                radialProgressView.f22119b = radialProgressView2.f22119b;
                radialProgressView.H = radialProgressView2.H;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.f22120c = radialProgressView2.f22120c;
                radialProgressView.f22122n = radialProgressView2.f22122n;
                radialProgressView.e = radialProgressView2.e;
                radialProgressView.f22127y = radialProgressView2.f22127y;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.G = radialProgressView2.G;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.b(85L);
                return;
        }
    }
}
