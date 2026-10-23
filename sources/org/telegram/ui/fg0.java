package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public final class fg0 implements Runnable {
    public final int f37330a;
    public final gg0 f37331b;
    public final wf0 f37332c;

    public fg0(int i10, wf0 wf0Var, gg0 gg0Var) {
        this.f37330a = i10;
        this.f37331b = gg0Var;
        this.f37332c = wf0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f37330a;
        wf0 wf0Var = this.f37332c;
        gg0 gg0Var = this.f37331b;
        switch (i10) {
            case 0:
                int i11 = wf0.F;
                wf0Var.a();
                AndroidUtilities.runOnUIThread(new fg0(1, wf0Var, gg0Var), 150L);
                return;
            default:
                hg0 hg0Var = gg0Var.f37598a;
                hg0Var.h(null);
                RadialProgressView radialProgressView = hg0Var.f37846a0.N.d;
                RadialProgressView radialProgressView2 = wf0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f24472a = radialProgressView2.f24472a;
                radialProgressView.f24473b = radialProgressView2.f24473b;
                radialProgressView.H = radialProgressView2.H;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.f24474c = radialProgressView2.f24474c;
                radialProgressView.f24476n = radialProgressView2.f24476n;
                radialProgressView.e = radialProgressView2.e;
                radialProgressView.f24481y = radialProgressView2.f24481y;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.G = radialProgressView2.G;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.b(85L);
                return;
        }
    }
}
