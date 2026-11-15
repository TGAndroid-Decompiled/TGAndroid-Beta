package org.telegram.ui;
public final class kf0 implements Runnable {
    public final int f48696a;
    public final bg0 f48697b;

    public kf0(bg0 bg0Var, int i7) {
        this.f48696a = i7;
        this.f48697b = bg0Var;
    }

    @Override
    public final void run() {
        switch (this.f48696a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                bg0 bg0Var = this.f48697b;
                bg0Var.getClass();
                xh.e.f(false);
                xh.e eVar = bg0Var.f45725i0;
                if (eVar != null) {
                    eVar.b(bg0Var.F);
                }
                org.telegram.messenger.g0.h3(new kf0(bg0Var, 0));
                return;
            case 2:
                xh.e.f(false);
                bg0 bg0Var2 = this.f48697b;
                xh.e eVar2 = bg0Var2.f45725i0;
                if (eVar2 != null) {
                    eVar2.b(bg0Var2.F);
                }
                org.telegram.messenger.g0.h3(new kf0(bg0Var2, 3));
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
