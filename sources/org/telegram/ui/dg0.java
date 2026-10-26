package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public final class dg0 implements Runnable {
    public final int f38862a;
    public final eg0 f38863b;
    public final tf0 f38864c;

    public dg0(int i10, tf0 tf0Var, eg0 eg0Var) {
        this.f38862a = i10;
        this.f38863b = eg0Var;
        this.f38864c = tf0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f38862a;
        tf0 tf0Var = this.f38864c;
        eg0 eg0Var = this.f38863b;
        switch (i10) {
            case 0:
                int i11 = tf0.F;
                tf0Var.a();
                AndroidUtilities.runOnUIThread(new dg0(1, tf0Var, eg0Var), 150L);
                return;
            default:
                fg0 fg0Var = eg0Var.f39105a;
                fg0Var.h(null);
                RadialProgressView radialProgressView = fg0Var.f39362a0.N.d;
                RadialProgressView radialProgressView2 = tf0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f26265a = radialProgressView2.f26265a;
                radialProgressView.f26266b = radialProgressView2.f26266b;
                radialProgressView.H = radialProgressView2.H;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.f26267c = radialProgressView2.f26267c;
                radialProgressView.f26269n = radialProgressView2.f26269n;
                radialProgressView.e = radialProgressView2.e;
                radialProgressView.f26274y = radialProgressView2.f26274y;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.G = radialProgressView2.G;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.b(85L);
                return;
        }
    }
}
