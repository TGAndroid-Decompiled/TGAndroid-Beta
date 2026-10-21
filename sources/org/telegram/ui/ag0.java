package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public final class ag0 implements Runnable {
    public final int f35371a;
    public final bg0 f35372b;
    public final rf0 f35373c;

    public ag0(int i10, rf0 rf0Var, bg0 bg0Var) {
        this.f35371a = i10;
        this.f35372b = bg0Var;
        this.f35373c = rf0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f35371a;
        rf0 rf0Var = this.f35373c;
        bg0 bg0Var = this.f35372b;
        switch (i10) {
            case 0:
                int i11 = rf0.E;
                rf0Var.a();
                AndroidUtilities.runOnUIThread(new ag0(1, rf0Var, bg0Var), 150L);
                return;
            default:
                cg0 cg0Var = bg0Var.f35631a;
                cg0Var.h(null);
                RadialProgressView radialProgressView = cg0Var.V.N.d;
                RadialProgressView radialProgressView2 = rf0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f24326a = radialProgressView2.f24326a;
                radialProgressView.f24327b = radialProgressView2.f24327b;
                radialProgressView.H = radialProgressView2.H;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.f24328c = radialProgressView2.f24328c;
                radialProgressView.f24330n = radialProgressView2.f24330n;
                radialProgressView.e = radialProgressView2.e;
                radialProgressView.f24335y = radialProgressView2.f24335y;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.G = radialProgressView2.G;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.b(85L);
                return;
        }
    }
}
