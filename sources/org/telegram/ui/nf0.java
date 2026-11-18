package org.telegram.ui;
public final class nf0 implements Runnable {
    public final int f50172a;
    public final eg0 f50173b;

    public nf0(eg0 eg0Var, int i7) {
        this.f50172a = i7;
        this.f50173b = eg0Var;
    }

    @Override
    public final void run() {
        switch (this.f50172a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                eg0 eg0Var = this.f50173b;
                eg0Var.getClass();
                xh.e.f(false);
                xh.e eVar = eg0Var.f47236i0;
                if (eVar != null) {
                    eVar.b(eg0Var.F);
                }
                org.telegram.messenger.g0.g3(new nf0(eg0Var, 0));
                return;
            case 2:
                xh.e.f(false);
                eg0 eg0Var2 = this.f50173b;
                xh.e eVar2 = eg0Var2.f47236i0;
                if (eVar2 != null) {
                    eVar2.b(eg0Var2.F);
                }
                org.telegram.messenger.g0.g3(new nf0(eg0Var2, 3));
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
