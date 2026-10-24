package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public final class eg0 implements Runnable {
    public final int f36905a;
    public final fg0 f36906b;
    public final vf0 f36907c;

    public eg0(int i10, vf0 vf0Var, fg0 fg0Var) {
        this.f36905a = i10;
        this.f36906b = fg0Var;
        this.f36907c = vf0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f36905a;
        vf0 vf0Var = this.f36907c;
        fg0 fg0Var = this.f36906b;
        switch (i10) {
            case 0:
                int i11 = vf0.F;
                vf0Var.a();
                AndroidUtilities.runOnUIThread(new eg0(1, vf0Var, fg0Var), 150L);
                return;
            default:
                gg0 gg0Var = fg0Var.f37332a;
                gg0Var.h(null);
                RadialProgressView radialProgressView = gg0Var.f37562a0.N.d;
                RadialProgressView radialProgressView2 = vf0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f24473a = radialProgressView2.f24473a;
                radialProgressView.f24474b = radialProgressView2.f24474b;
                radialProgressView.H = radialProgressView2.H;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.f24475c = radialProgressView2.f24475c;
                radialProgressView.f24477n = radialProgressView2.f24477n;
                radialProgressView.e = radialProgressView2.e;
                radialProgressView.f24482y = radialProgressView2.f24482y;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.G = radialProgressView2.G;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.b(85L);
                return;
        }
    }
}
