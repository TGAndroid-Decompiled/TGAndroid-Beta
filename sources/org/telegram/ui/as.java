package org.telegram.ui;
public final class as implements Runnable {
    public final int f45494a;
    public final ns f45495b;

    public as(ns nsVar, int i7) {
        this.f45494a = i7;
        this.f45495b = nsVar;
    }

    @Override
    public final void run() {
        switch (this.f45494a) {
            case 0:
                this.f45495b.f49647c0 = null;
                return;
            case 1:
                ns nsVar = this.f45495b;
                nsVar.A.w0(null);
                org.telegram.ui.Components.tb0 tb0Var = nsVar.C;
                if (tb0Var != null) {
                    tb0Var.a();
                    nsVar.f49669z.removeView(nsVar.C);
                    nsVar.C = null;
                    return;
                }
                return;
            default:
                this.f45495b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.er.h).start();
                return;
        }
    }
}
