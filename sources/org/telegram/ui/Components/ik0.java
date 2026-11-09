package org.telegram.ui.Components;
public final class ik0 implements Runnable {
    public final int f34799a;
    public final kk0 f34800b;

    public ik0(kk0 kk0Var, int i7) {
        this.f34799a = i7;
        this.f34800b = kk0Var;
    }

    @Override
    public final void run() {
        switch (this.f34799a) {
            case 0:
                kk0 kk0Var = this.f34800b;
                kk0Var.getClass();
                org.telegram.messenger.g0.h3(new ik0(kk0Var, 2));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new ik0(this.f34800b, 3));
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
