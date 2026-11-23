package org.telegram.ui;
public final class as implements Runnable {
    public final int f45641a;
    public final ns f45642b;

    public as(ns nsVar, int i7) {
        this.f45641a = i7;
        this.f45642b = nsVar;
    }

    @Override
    public final void run() {
        switch (this.f45641a) {
            case 0:
                this.f45642b.f50293c0 = null;
                return;
            case 1:
                ns nsVar = this.f45642b;
                nsVar.A.w0(null);
                org.telegram.ui.Components.ec0 ec0Var = nsVar.C;
                if (ec0Var != null) {
                    ec0Var.a();
                    nsVar.f50315z.removeView(nsVar.C);
                    nsVar.C = null;
                    return;
                }
                return;
            default:
                this.f45642b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.nr.h).start();
                return;
        }
    }
}
