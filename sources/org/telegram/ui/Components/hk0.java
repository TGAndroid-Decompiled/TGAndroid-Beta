package org.telegram.ui.Components;
public final class hk0 implements Runnable {
    public final int f34399a;
    public final jk0 f34400b;

    public hk0(jk0 jk0Var, int i7) {
        this.f34399a = i7;
        this.f34400b = jk0Var;
    }

    @Override
    public final void run() {
        switch (this.f34399a) {
            case 0:
                jk0 jk0Var = this.f34400b;
                jk0Var.getClass();
                org.telegram.messenger.g0.h3(new hk0(jk0Var, 2));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new hk0(this.f34400b, 3));
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
