package org.telegram.ui.Components;
public final class wk0 implements Runnable {
    public final int f41837a;
    public final yk0 f41838b;

    public wk0(yk0 yk0Var, int i7) {
        this.f41837a = i7;
        this.f41838b = yk0Var;
    }

    @Override
    public final void run() {
        switch (this.f41837a) {
            case 0:
                yk0 yk0Var = this.f41838b;
                yk0Var.getClass();
                org.telegram.messenger.g0.g3(new wk0(yk0Var, 2));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new wk0(this.f41838b, 3));
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
