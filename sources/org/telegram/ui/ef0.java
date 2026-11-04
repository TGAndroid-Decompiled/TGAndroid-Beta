package org.telegram.ui;
public final class ef0 implements Runnable {
    public final int f44977a;
    public final vf0 f44978b;

    public ef0(vf0 vf0Var, int i3) {
        this.f44977a = i3;
        this.f44978b = vf0Var;
    }

    @Override
    public final void run() {
        switch (this.f44977a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                vf0 vf0Var = this.f44978b;
                vf0Var.getClass();
                yh.e.f(false);
                yh.e eVar = vf0Var.f50485i0;
                if (eVar != null) {
                    eVar.b(vf0Var.F);
                }
                org.telegram.messenger.g0.h3(new ef0(vf0Var, 0));
                return;
            case 2:
                yh.e.f(false);
                vf0 vf0Var2 = this.f44978b;
                yh.e eVar2 = vf0Var2.f50485i0;
                if (eVar2 != null) {
                    eVar2.b(vf0Var2.F);
                }
                org.telegram.messenger.g0.h3(new ef0(vf0Var2, 3));
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
