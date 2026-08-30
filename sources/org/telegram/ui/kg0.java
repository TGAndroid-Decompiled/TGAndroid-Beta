package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public final class kg0 implements Runnable {
    public final int f35716a;
    public final lg0 f35717b;
    public final bg0 f35718c;

    public kg0(int i10, bg0 bg0Var, lg0 lg0Var) {
        this.f35716a = i10;
        this.f35717b = lg0Var;
        this.f35718c = bg0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f35716a;
        bg0 bg0Var = this.f35718c;
        lg0 lg0Var = this.f35717b;
        switch (i10) {
            case 0:
                int i11 = bg0.B;
                bg0Var.a();
                AndroidUtilities.runOnUIThread(new kg0(1, bg0Var, lg0Var), 150L);
                return;
            default:
                mg0 mg0Var = lg0Var.f36081a;
                mg0Var.h(null);
                RadialProgressView radialProgressView = mg0Var.S.K.d;
                RadialProgressView radialProgressView2 = bg0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f23134a = radialProgressView2.f23134a;
                radialProgressView.f23135b = radialProgressView2.f23135b;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.G = radialProgressView2.G;
                radialProgressView.f23136c = radialProgressView2.f23136c;
                radialProgressView.f23138n = radialProgressView2.f23138n;
                radialProgressView.e = radialProgressView2.e;
                radialProgressView.f23143y = radialProgressView2.f23143y;
                radialProgressView.C = radialProgressView2.C;
                radialProgressView.D = radialProgressView2.D;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.B = radialProgressView2.B;
                radialProgressView.b(85L);
                return;
        }
    }
}
