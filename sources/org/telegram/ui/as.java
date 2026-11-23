package org.telegram.ui;
public final class as implements Runnable {
    public final int f45801a;
    public final ns f45802b;

    public as(ns nsVar, int i7) {
        this.f45801a = i7;
        this.f45802b = nsVar;
    }

    @Override
    public final void run() {
        switch (this.f45801a) {
            case 0:
                this.f45802b.f50405c0 = null;
                return;
            case 1:
                ns nsVar = this.f45802b;
                nsVar.A.x0(null);
                org.telegram.ui.Components.cc0 cc0Var = nsVar.C;
                if (cc0Var != null) {
                    cc0Var.a();
                    nsVar.f50427z.removeView(nsVar.C);
                    nsVar.C = null;
                    return;
                }
                return;
            default:
                this.f45802b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.kr.h).start();
                return;
        }
    }
}
