package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;

public final class fg0 implements Runnable {

    public final int f38125a;

    public final gg0 f38126b;

    public final wf0 f38127c;

    public fg0(int i10, wf0 wf0Var, gg0 gg0Var) {
        this.f38125a = i10;
        this.f38126b = gg0Var;
        this.f38127c = wf0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f38125a;
        wf0 wf0Var = this.f38127c;
        gg0 gg0Var = this.f38126b;
        switch (i10) {
            case 0:
                int i11 = wf0.A;
                wf0Var.a();
                AndroidUtilities.runOnUIThread(new fg0(1, wf0Var, gg0Var), 150L);
                break;
            default:
                hg0 hg0Var = gg0Var.f38410a;
                hg0Var.h(null);
                RadialProgressView radialProgressView = hg0Var.R.J.d;
                RadialProgressView radialProgressView2 = wf0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f26487a = radialProgressView2.f26487a;
                radialProgressView.f26488b = radialProgressView2.f26488b;
                radialProgressView.D = radialProgressView2.D;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.f26489c = radialProgressView2.f26489c;
                radialProgressView.f26492n = radialProgressView2.f26492n;
                radialProgressView.f26490e = radialProgressView2.f26490e;
                radialProgressView.f26497y = radialProgressView2.f26497y;
                radialProgressView.B = radialProgressView2.B;
                radialProgressView.C = radialProgressView2.C;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.A = radialProgressView2.A;
                radialProgressView.b(85L);
                break;
        }
    }
}
