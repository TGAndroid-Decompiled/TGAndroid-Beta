package org.telegram.ui;
public final class mf0 implements Runnable {
    public final int f50050a;
    public final dg0 f50051b;

    public mf0(dg0 dg0Var, int i7) {
        this.f50050a = i7;
        this.f50051b = dg0Var;
    }

    @Override
    public final void run() {
        switch (this.f50050a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                dg0 dg0Var = this.f50051b;
                dg0Var.getClass();
                xh.e.f(false);
                xh.e eVar = dg0Var.f47104i0;
                if (eVar != null) {
                    eVar.b(dg0Var.F);
                }
                org.telegram.messenger.g0.g3(new mf0(dg0Var, 0));
                return;
            case 2:
                xh.e.f(false);
                dg0 dg0Var2 = this.f50051b;
                xh.e eVar2 = dg0Var2.f47104i0;
                if (eVar2 != null) {
                    eVar2.b(dg0Var2.F);
                }
                org.telegram.messenger.g0.g3(new mf0(dg0Var2, 3));
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
