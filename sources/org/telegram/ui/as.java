package org.telegram.ui;
public final class as implements Runnable {
    public final int f45500a;
    public final ns f45501b;

    public as(ns nsVar, int i7) {
        this.f45500a = i7;
        this.f45501b = nsVar;
    }

    @Override
    public final void run() {
        switch (this.f45500a) {
            case 0:
                this.f45501b.f49657c0 = null;
                return;
            case 1:
                ns nsVar = this.f45501b;
                nsVar.A.w0(null);
                org.telegram.ui.Components.tb0 tb0Var = nsVar.C;
                if (tb0Var != null) {
                    tb0Var.a();
                    nsVar.f49679z.removeView(nsVar.C);
                    nsVar.C = null;
                    return;
                }
                return;
            default:
                this.f45501b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.er.h).start();
                return;
        }
    }
}
