package org.telegram.ui;
public final class as implements Runnable {
    public final int f45645a;
    public final ns f45646b;

    public as(ns nsVar, int i7) {
        this.f45645a = i7;
        this.f45646b = nsVar;
    }

    @Override
    public final void run() {
        switch (this.f45645a) {
            case 0:
                this.f45646b.f50294c0 = null;
                return;
            case 1:
                ns nsVar = this.f45646b;
                nsVar.A.w0(null);
                org.telegram.ui.Components.dc0 dc0Var = nsVar.C;
                if (dc0Var != null) {
                    dc0Var.a();
                    nsVar.f50316z.removeView(nsVar.C);
                    nsVar.C = null;
                    return;
                }
                return;
            default:
                this.f45646b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.lr.h).start();
                return;
        }
    }
}
