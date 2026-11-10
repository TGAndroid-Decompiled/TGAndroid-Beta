package org.telegram.ui;
public final class as implements Runnable {
    public final int f43806a;
    public final ns f43807b;

    public as(ns nsVar, int i7) {
        this.f43806a = i7;
        this.f43807b = nsVar;
    }

    @Override
    public final void run() {
        switch (this.f43806a) {
            case 0:
                this.f43807b.f48258c0 = null;
                return;
            case 1:
                ns nsVar = this.f43807b;
                nsVar.A.w0(null);
                org.telegram.ui.Components.sb0 sb0Var = nsVar.C;
                if (sb0Var != null) {
                    sb0Var.a();
                    nsVar.f48280z.removeView(nsVar.C);
                    nsVar.C = null;
                    return;
                }
                return;
            default:
                this.f43807b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.wq.h).start();
                return;
        }
    }
}
