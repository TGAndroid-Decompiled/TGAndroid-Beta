package org.telegram.ui;

import org.telegram.ui.Components.RadialProgressView;
public final class ae0 implements Runnable {
    public final int f43632a;
    public final f f43633b;
    public final pd0 f43634c;

    public ae0(int i7, f fVar, pd0 pd0Var) {
        this.f43632a = i7;
        this.f43633b = fVar;
        this.f43634c = pd0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f43632a;
        pd0 pd0Var = this.f43634c;
        f fVar = this.f43633b;
        switch (i7) {
            case 0:
                int i10 = pd0.F;
                pd0Var.a();
                org.telegram.messenger.g0.i3(new ae0(1, fVar, pd0Var), 150L);
                return;
            default:
                be0 be0Var = (be0) fVar.f45451b;
                be0Var.h(null);
                RadialProgressView radialProgressView = be0Var.f44302g0.N.d;
                RadialProgressView radialProgressView2 = pd0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f31494a = radialProgressView2.f31494a;
                radialProgressView.f31495b = radialProgressView2.f31495b;
                radialProgressView.H = radialProgressView2.H;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.f31496c = radialProgressView2.f31496c;
                radialProgressView.f31499n = radialProgressView2.f31499n;
                radialProgressView.f31497e = radialProgressView2.f31497e;
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
