package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public final class lg0 implements Runnable {
    public final int f38635a;
    public final mg0 f38636b;
    public final cg0 f38637c;

    public lg0(int i10, cg0 cg0Var, mg0 mg0Var) {
        this.f38635a = i10;
        this.f38636b = mg0Var;
        this.f38637c = cg0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f38635a;
        cg0 cg0Var = this.f38637c;
        mg0 mg0Var = this.f38636b;
        switch (i10) {
            case 0:
                int i11 = cg0.B;
                cg0Var.a();
                AndroidUtilities.runOnUIThread(new lg0(1, cg0Var, mg0Var), 150L);
                return;
            default:
                ng0 ng0Var = mg0Var.f38974a;
                ng0Var.h(null);
                RadialProgressView radialProgressView = ng0Var.S.K.d;
                RadialProgressView radialProgressView2 = cg0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f24991a = radialProgressView2.f24991a;
                radialProgressView.f24992b = radialProgressView2.f24992b;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.G = radialProgressView2.G;
                radialProgressView.f24993c = radialProgressView2.f24993c;
                radialProgressView.f24996n = radialProgressView2.f24996n;
                radialProgressView.f24994e = radialProgressView2.f24994e;
                radialProgressView.f25001y = radialProgressView2.f25001y;
                radialProgressView.C = radialProgressView2.C;
                radialProgressView.D = radialProgressView2.D;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.B = radialProgressView2.B;
                radialProgressView.b(85L);
                return;
        }
    }
}
