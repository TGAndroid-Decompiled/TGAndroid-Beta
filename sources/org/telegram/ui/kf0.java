package org.telegram.ui;
public final class kf0 implements Runnable {
    public final int f47184a;
    public final bg0 f47185b;

    public kf0(bg0 bg0Var, int i7) {
        this.f47184a = i7;
        this.f47185b = bg0Var;
    }

    @Override
    public final void run() {
        switch (this.f47184a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                bg0 bg0Var = this.f47185b;
                bg0Var.getClass();
                xh.e.f(false);
                xh.e eVar = bg0Var.f44330h0;
                if (eVar != null) {
                    eVar.b(bg0Var.E);
                }
                org.telegram.messenger.g0.h3(new kf0(bg0Var, 0));
                return;
            case 2:
                xh.e.f(false);
                bg0 bg0Var2 = this.f47185b;
                xh.e eVar2 = bg0Var2.f44330h0;
                if (eVar2 != null) {
                    eVar2.b(bg0Var2.E);
                }
                org.telegram.messenger.g0.h3(new kf0(bg0Var2, 3));
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
