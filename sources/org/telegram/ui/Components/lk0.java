package org.telegram.ui.Components;
public final class lk0 implements Runnable {
    public final int f35785a;
    public final nk0 f35786b;

    public lk0(nk0 nk0Var, int i3) {
        this.f35785a = i3;
        this.f35786b = nk0Var;
    }

    @Override
    public final void run() {
        switch (this.f35785a) {
            case 0:
                nk0 nk0Var = this.f35786b;
                nk0Var.getClass();
                org.telegram.messenger.g0.h3(new lk0(nk0Var, 2));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new lk0(this.f35786b, 3));
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
