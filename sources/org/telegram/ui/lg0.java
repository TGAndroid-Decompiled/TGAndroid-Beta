package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public final class lg0 implements Runnable {
    public final int f38732a;
    public final mg0 f38733b;
    public final cg0 f38734c;

    public lg0(int i10, cg0 cg0Var, mg0 mg0Var) {
        this.f38732a = i10;
        this.f38733b = mg0Var;
        this.f38734c = cg0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f38732a;
        cg0 cg0Var = this.f38734c;
        mg0 mg0Var = this.f38733b;
        switch (i10) {
            case 0:
                int i11 = cg0.B;
                cg0Var.a();
                AndroidUtilities.runOnUIThread(new lg0(1, cg0Var, mg0Var), 150L);
                return;
            default:
                ng0 ng0Var = mg0Var.f39151a;
                ng0Var.h(null);
                RadialProgressView radialProgressView = ng0Var.S.K.d;
                RadialProgressView radialProgressView2 = cg0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f24989a = radialProgressView2.f24989a;
                radialProgressView.f24990b = radialProgressView2.f24990b;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.G = radialProgressView2.G;
                radialProgressView.f24991c = radialProgressView2.f24991c;
                radialProgressView.f24994n = radialProgressView2.f24994n;
                radialProgressView.f24992e = radialProgressView2.f24992e;
                radialProgressView.f24999y = radialProgressView2.f24999y;
                radialProgressView.C = radialProgressView2.C;
                radialProgressView.D = radialProgressView2.D;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.B = radialProgressView2.B;
                radialProgressView.b(85L);
                return;
        }
    }
}
