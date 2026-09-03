package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public final class mg0 implements Runnable {
    public final int f36078a;
    public final ng0 f36079b;
    public final dg0 f36080c;

    public mg0(int i10, dg0 dg0Var, ng0 ng0Var) {
        this.f36078a = i10;
        this.f36079b = ng0Var;
        this.f36080c = dg0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f36078a;
        dg0 dg0Var = this.f36080c;
        ng0 ng0Var = this.f36079b;
        switch (i10) {
            case 0:
                int i11 = dg0.B;
                dg0Var.a();
                AndroidUtilities.runOnUIThread(new mg0(1, dg0Var, ng0Var), 150L);
                return;
            default:
                og0 og0Var = ng0Var.f36511a;
                og0Var.h(null);
                RadialProgressView radialProgressView = og0Var.S.K.d;
                RadialProgressView radialProgressView2 = dg0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f23107a = radialProgressView2.f23107a;
                radialProgressView.f23108b = radialProgressView2.f23108b;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.G = radialProgressView2.G;
                radialProgressView.f23109c = radialProgressView2.f23109c;
                radialProgressView.f23111n = radialProgressView2.f23111n;
                radialProgressView.e = radialProgressView2.e;
                radialProgressView.f23116y = radialProgressView2.f23116y;
                radialProgressView.C = radialProgressView2.C;
                radialProgressView.D = radialProgressView2.D;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.B = radialProgressView2.B;
                radialProgressView.b(85L);
                return;
        }
    }
}
