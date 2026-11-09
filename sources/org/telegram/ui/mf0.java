package org.telegram.ui;
public final class mf0 implements Runnable {
    public final int f47868a;
    public final dg0 f47869b;

    public mf0(dg0 dg0Var, int i7) {
        this.f47868a = i7;
        this.f47869b = dg0Var;
    }

    @Override
    public final void run() {
        switch (this.f47868a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                dg0 dg0Var = this.f47869b;
                dg0Var.getClass();
                xh.e.f(false);
                xh.e eVar = dg0Var.f44959h0;
                if (eVar != null) {
                    eVar.b(dg0Var.E);
                }
                org.telegram.messenger.g0.h3(new mf0(dg0Var, 0));
                return;
            case 2:
                xh.e.f(false);
                dg0 dg0Var2 = this.f47869b;
                xh.e eVar2 = dg0Var2.f44959h0;
                if (eVar2 != null) {
                    eVar2.b(dg0Var2.E);
                }
                org.telegram.messenger.g0.h3(new mf0(dg0Var2, 3));
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
