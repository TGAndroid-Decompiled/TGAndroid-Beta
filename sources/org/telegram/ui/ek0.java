package org.telegram.ui;
public final class ek0 implements Runnable {
    public final int f44997a;
    public final dl0 f44998b;

    public ek0(dl0 dl0Var, int i3) {
        this.f44997a = i3;
        this.f44998b = dl0Var;
    }

    @Override
    public final void run() {
        switch (this.f44997a) {
            case 0:
                this.f44998b.z0();
                return;
            case 1:
                dl0 dl0Var = this.f44998b;
                dl0Var.getMessagesController().f23059l7 = null;
                if (dl0Var.f44754g1 == 3 && !dl0Var.isFinishing()) {
                    dl0Var.f44754g1 = 4;
                    cl0 cl0Var = dl0Var.f44738a1;
                    if (cl0Var != null) {
                        cl0Var.e(4);
                    }
                    dl0Var.finishFragment();
                    return;
                } else if (dl0Var.f44754g1 == 1 && !dl0Var.isFinishing()) {
                    dl0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 2:
                dl0 dl0Var2 = this.f44998b;
                if (dl0Var2.f44748e0 != null) {
                    dl0Var2.C0();
                    dl0Var2.f44748e0 = null;
                    return;
                }
                return;
            default:
                dl0 dl0Var3 = this.f44998b;
                dl0Var3.f44750f[0].requestFocus();
                org.telegram.messenger.g0.K3(dl0Var3.f44750f[0]);
                return;
        }
    }
}
