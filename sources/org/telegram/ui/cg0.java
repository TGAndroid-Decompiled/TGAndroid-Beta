package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public final class cg0 implements Runnable {
    public final int f37201a;
    public final dg0 f37202b;
    public final tf0 f37203c;

    public cg0(int i9, tf0 tf0Var, dg0 dg0Var) {
        this.f37201a = i9;
        this.f37202b = dg0Var;
        this.f37203c = tf0Var;
    }

    @Override
    public final void run() {
        int i9 = this.f37201a;
        tf0 tf0Var = this.f37203c;
        dg0 dg0Var = this.f37202b;
        switch (i9) {
            case 0:
                int i10 = tf0.A;
                tf0Var.a();
                AndroidUtilities.runOnUIThread(new cg0(1, tf0Var, dg0Var), 150L);
                return;
            default:
                eg0 eg0Var = dg0Var.f37537a;
                eg0Var.h(null);
                RadialProgressView radialProgressView = eg0Var.R.J.d;
                RadialProgressView radialProgressView2 = tf0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f26491a = radialProgressView2.f26491a;
                radialProgressView.f26492b = radialProgressView2.f26492b;
                radialProgressView.D = radialProgressView2.D;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.f26493c = radialProgressView2.f26493c;
                radialProgressView.f26496n = radialProgressView2.f26496n;
                radialProgressView.f26494e = radialProgressView2.f26494e;
                radialProgressView.f26501y = radialProgressView2.f26501y;
                radialProgressView.B = radialProgressView2.B;
                radialProgressView.C = radialProgressView2.C;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.A = radialProgressView2.A;
                radialProgressView.b(85L);
                return;
        }
    }
}
