package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public final class ag0 implements Runnable {
    public final int f35375a;
    public final bg0 f35376b;
    public final rf0 f35377c;

    public ag0(int i10, rf0 rf0Var, bg0 bg0Var) {
        this.f35375a = i10;
        this.f35376b = bg0Var;
        this.f35377c = rf0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f35375a;
        rf0 rf0Var = this.f35377c;
        bg0 bg0Var = this.f35376b;
        switch (i10) {
            case 0:
                int i11 = rf0.E;
                rf0Var.a();
                AndroidUtilities.runOnUIThread(new ag0(1, rf0Var, bg0Var), 150L);
                return;
            default:
                cg0 cg0Var = bg0Var.f35635a;
                cg0Var.h(null);
                RadialProgressView radialProgressView = cg0Var.V.N.d;
                RadialProgressView radialProgressView2 = rf0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f24330a = radialProgressView2.f24330a;
                radialProgressView.f24331b = radialProgressView2.f24331b;
                radialProgressView.H = radialProgressView2.H;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.f24332c = radialProgressView2.f24332c;
                radialProgressView.f24334n = radialProgressView2.f24334n;
                radialProgressView.e = radialProgressView2.e;
                radialProgressView.f24339y = radialProgressView2.f24339y;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.G = radialProgressView2.G;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.b(85L);
                return;
        }
    }
}
