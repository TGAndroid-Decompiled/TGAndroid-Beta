package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public final class cg0 implements Runnable {
    public final int f35953a;
    public final dg0 f35954b;
    public final tf0 f35955c;

    public cg0(int i10, tf0 tf0Var, dg0 dg0Var) {
        this.f35953a = i10;
        this.f35954b = dg0Var;
        this.f35955c = tf0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f35953a;
        tf0 tf0Var = this.f35955c;
        dg0 dg0Var = this.f35954b;
        switch (i10) {
            case 0:
                int i11 = tf0.E;
                tf0Var.a();
                AndroidUtilities.runOnUIThread(new cg0(1, tf0Var, dg0Var), 150L);
                return;
            default:
                eg0 eg0Var = dg0Var.f36215a;
                eg0Var.h(null);
                RadialProgressView radialProgressView = eg0Var.V.N.d;
                RadialProgressView radialProgressView2 = tf0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f24329a = radialProgressView2.f24329a;
                radialProgressView.f24330b = radialProgressView2.f24330b;
                radialProgressView.H = radialProgressView2.H;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.f24331c = radialProgressView2.f24331c;
                radialProgressView.f24333n = radialProgressView2.f24333n;
                radialProgressView.e = radialProgressView2.e;
                radialProgressView.f24338y = radialProgressView2.f24338y;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.G = radialProgressView2.G;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.b(85L);
                return;
        }
    }
}
