package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public final class fg0 implements Runnable {
    public final int f39356a;
    public final gg0 f39357b;
    public final vf0 f39358c;

    public fg0(int i10, vf0 vf0Var, gg0 gg0Var) {
        this.f39356a = i10;
        this.f39357b = gg0Var;
        this.f39358c = vf0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f39356a;
        vf0 vf0Var = this.f39358c;
        gg0 gg0Var = this.f39357b;
        switch (i10) {
            case 0:
                int i11 = vf0.F;
                vf0Var.a();
                AndroidUtilities.runOnUIThread(new fg0(1, vf0Var, gg0Var), 150L);
                return;
            default:
                hg0 hg0Var = gg0Var.f39612a;
                hg0Var.h(null);
                RadialProgressView radialProgressView = hg0Var.f39882a0.N.d;
                RadialProgressView radialProgressView2 = vf0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f26267a = radialProgressView2.f26267a;
                radialProgressView.f26268b = radialProgressView2.f26268b;
                radialProgressView.H = radialProgressView2.H;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.f26269c = radialProgressView2.f26269c;
                radialProgressView.f26271n = radialProgressView2.f26271n;
                radialProgressView.e = radialProgressView2.e;
                radialProgressView.f26276y = radialProgressView2.f26276y;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.G = radialProgressView2.G;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.b(85L);
                return;
        }
    }
}
