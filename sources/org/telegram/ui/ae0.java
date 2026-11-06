package org.telegram.ui;

import org.telegram.ui.Components.RadialProgressView;
public final class ae0 implements Runnable {
    public final int f43631a;
    public final f f43632b;
    public final pd0 f43633c;

    public ae0(int i7, f fVar, pd0 pd0Var) {
        this.f43631a = i7;
        this.f43632b = fVar;
        this.f43633c = pd0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f43631a;
        pd0 pd0Var = this.f43633c;
        f fVar = this.f43632b;
        switch (i7) {
            case 0:
                int i10 = pd0.F;
                pd0Var.a();
                org.telegram.messenger.g0.i3(new ae0(1, fVar, pd0Var), 150L);
                return;
            default:
                be0 be0Var = (be0) fVar.f45450b;
                be0Var.h(null);
                RadialProgressView radialProgressView = be0Var.f44301g0.N.d;
                RadialProgressView radialProgressView2 = pd0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f31495a = radialProgressView2.f31495a;
                radialProgressView.f31496b = radialProgressView2.f31496b;
                radialProgressView.H = radialProgressView2.H;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.f31497c = radialProgressView2.f31497c;
                radialProgressView.f31500n = radialProgressView2.f31500n;
                radialProgressView.f31498e = radialProgressView2.f31498e;
                radialProgressView.D = radialProgressView2.D;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.G = radialProgressView2.G;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.b(85L);
                return;
        }
    }
}
