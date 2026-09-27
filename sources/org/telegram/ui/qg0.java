package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public final class qg0 implements Runnable {
    public final int f36740a;
    public final rg0 f36741b;
    public final hg0 f36742c;

    public qg0(int i10, hg0 hg0Var, rg0 rg0Var) {
        this.f36740a = i10;
        this.f36741b = rg0Var;
        this.f36742c = hg0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f36740a;
        hg0 hg0Var = this.f36742c;
        rg0 rg0Var = this.f36741b;
        switch (i10) {
            case 0:
                int i11 = hg0.E;
                hg0Var.a();
                AndroidUtilities.runOnUIThread(new qg0(1, hg0Var, rg0Var), 150L);
                return;
            default:
                sg0 sg0Var = rg0Var.f37124a;
                sg0Var.h(null);
                RadialProgressView radialProgressView = sg0Var.V.N.d;
                RadialProgressView radialProgressView2 = hg0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f22372a = radialProgressView2.f22372a;
                radialProgressView.f22373b = radialProgressView2.f22373b;
                radialProgressView.H = radialProgressView2.H;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.f22374c = radialProgressView2.f22374c;
                radialProgressView.f22376n = radialProgressView2.f22376n;
                radialProgressView.e = radialProgressView2.e;
                radialProgressView.f22381y = radialProgressView2.f22381y;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.G = radialProgressView2.G;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.b(85L);
                return;
        }
    }
}
