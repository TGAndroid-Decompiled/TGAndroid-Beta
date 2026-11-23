package org.telegram.ui;
public final class as implements Runnable {
    public final int f45675a;
    public final ns f45676b;

    public as(ns nsVar, int i7) {
        this.f45675a = i7;
        this.f45676b = nsVar;
    }

    @Override
    public final void run() {
        switch (this.f45675a) {
            case 0:
                this.f45676b.f50289c0 = null;
                return;
            case 1:
                ns nsVar = this.f45676b;
                nsVar.A.w0(null);
                org.telegram.ui.Components.ec0 ec0Var = nsVar.C;
                if (ec0Var != null) {
                    ec0Var.a();
                    nsVar.f50311z.removeView(nsVar.C);
                    nsVar.C = null;
                    return;
                }
                return;
            default:
                this.f45676b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.nr.h).start();
                return;
        }
    }
}
