package org.telegram.ui.Components;
public final class mk0 implements Runnable {
    public final int f37313a;
    public final ok0 f37314b;

    public mk0(ok0 ok0Var, int i7) {
        this.f37313a = i7;
        this.f37314b = ok0Var;
    }

    @Override
    public final void run() {
        switch (this.f37313a) {
            case 0:
                ok0 ok0Var = this.f37314b;
                ok0Var.getClass();
                org.telegram.messenger.g0.h3(new mk0(ok0Var, 2));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new mk0(this.f37314b, 3));
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
