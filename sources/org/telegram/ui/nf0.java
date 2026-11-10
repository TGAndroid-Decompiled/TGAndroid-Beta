package org.telegram.ui;
public final class nf0 implements Runnable {
    public final int f48203a;
    public final eg0 f48204b;

    public nf0(eg0 eg0Var, int i7) {
        this.f48203a = i7;
        this.f48204b = eg0Var;
    }

    @Override
    public final void run() {
        switch (this.f48203a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                eg0 eg0Var = this.f48204b;
                eg0Var.getClass();
                xh.e.f(false);
                xh.e eVar = eg0Var.f45280h0;
                if (eVar != null) {
                    eVar.b(eg0Var.E);
                }
                org.telegram.messenger.g0.h3(new nf0(eg0Var, 0));
                return;
            case 2:
                xh.e.f(false);
                eg0 eg0Var2 = this.f48204b;
                xh.e eVar2 = eg0Var2.f45280h0;
                if (eVar2 != null) {
                    eVar2.b(eg0Var2.E);
                }
                org.telegram.messenger.g0.h3(new nf0(eg0Var2, 3));
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
