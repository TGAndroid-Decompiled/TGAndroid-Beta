package org.telegram.ui;

import org.telegram.ui.Components.RadialProgressView;
public final class ae0 implements Runnable {
    public final int f45035a;
    public final f f45036b;
    public final pd0 f45037c;

    public ae0(int i7, f fVar, pd0 pd0Var) {
        this.f45035a = i7;
        this.f45036b = fVar;
        this.f45037c = pd0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f45035a;
        pd0 pd0Var = this.f45037c;
        f fVar = this.f45036b;
        switch (i7) {
            case 0:
                int i10 = pd0.G;
                pd0Var.a();
                org.telegram.messenger.g0.i3(new ae0(1, fVar, pd0Var), 150L);
                return;
            default:
                be0 be0Var = (be0) fVar.f46946b;
                be0Var.h(null);
                RadialProgressView radialProgressView = be0Var.f45699h0.O.d;
                RadialProgressView radialProgressView2 = pd0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f32678a = radialProgressView2.f32678a;
                radialProgressView.f32679b = radialProgressView2.f32679b;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.K = radialProgressView2.K;
                radialProgressView.f32680c = radialProgressView2.f32680c;
                radialProgressView.f32683n = radialProgressView2.f32683n;
                radialProgressView.f32681e = radialProgressView2.f32681e;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.G = radialProgressView2.G;
                radialProgressView.H = radialProgressView2.H;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.b(85L);
                return;
        }
    }
}
