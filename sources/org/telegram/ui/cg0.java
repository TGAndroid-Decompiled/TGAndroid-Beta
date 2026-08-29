package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public final class cg0 implements Runnable {
    public final int f37101a;
    public final dg0 f37102b;
    public final tf0 f37103c;

    public cg0(int i10, tf0 tf0Var, dg0 dg0Var) {
        this.f37101a = i10;
        this.f37102b = dg0Var;
        this.f37103c = tf0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f37101a;
        tf0 tf0Var = this.f37103c;
        dg0 dg0Var = this.f37102b;
        switch (i10) {
            case 0:
                int i11 = tf0.A;
                tf0Var.a();
                AndroidUtilities.runOnUIThread(new cg0(1, tf0Var, dg0Var), 150L);
                return;
            default:
                eg0 eg0Var = dg0Var.f37540a;
                eg0Var.h(null);
                RadialProgressView radialProgressView = eg0Var.R.J.d;
                RadialProgressView radialProgressView2 = tf0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f26502a = radialProgressView2.f26502a;
                radialProgressView.f26503b = radialProgressView2.f26503b;
                radialProgressView.D = radialProgressView2.D;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.f26504c = radialProgressView2.f26504c;
                radialProgressView.f26507n = radialProgressView2.f26507n;
                radialProgressView.f26505e = radialProgressView2.f26505e;
                radialProgressView.f26512y = radialProgressView2.f26512y;
                radialProgressView.B = radialProgressView2.B;
                radialProgressView.C = radialProgressView2.C;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.A = radialProgressView2.A;
                radialProgressView.b(85L);
                return;
        }
    }
}
