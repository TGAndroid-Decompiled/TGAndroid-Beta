package org.telegram.ui;
public final class qg0 implements Runnable {
    public final int f40773a;
    public final ih0 f40774b;

    public qg0(ih0 ih0Var, int i10) {
        this.f40773a = i10;
        this.f40774b = ih0Var;
    }

    @Override
    public final void run() {
        switch (this.f40773a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                ih0 ih0Var = this.f40774b;
                ih0Var.getClass();
                nh.h.f(false);
                nh.h hVar = ih0Var.f38069h0;
                if (hVar != null) {
                    hVar.b(ih0Var.E);
                }
                org.telegram.messenger.i0.g3(new qg0(ih0Var, 0));
                return;
            case 2:
                nh.h.f(false);
                ih0 ih0Var2 = this.f40774b;
                nh.h hVar2 = ih0Var2.f38069h0;
                if (hVar2 != null) {
                    hVar2.b(ih0Var2.E);
                }
                org.telegram.messenger.i0.g3(new qg0(ih0Var2, 3));
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
