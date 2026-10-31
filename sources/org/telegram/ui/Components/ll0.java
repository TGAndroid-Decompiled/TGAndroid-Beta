package org.telegram.ui.Components;
public final class ll0 implements Runnable {
    public final int f28137a;
    public final nl0 f28138b;

    public ll0(nl0 nl0Var, int i10) {
        this.f28137a = i10;
        this.f28138b = nl0Var;
    }

    @Override
    public final void run() {
        switch (this.f28137a) {
            case 0:
                nl0 nl0Var = this.f28138b;
                nl0Var.getClass();
                org.telegram.messenger.i0.g3(new ll0(nl0Var, 2));
                return;
            case 1:
                org.telegram.messenger.i0.g3(new ll0(this.f28138b, 3));
                return;
            case 2:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
