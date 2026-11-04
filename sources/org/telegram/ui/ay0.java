package org.telegram.ui;
public final class ay0 implements Runnable {
    public final int f43858a;
    public final dy0 f43859b;

    public ay0(dy0 dy0Var, int i3) {
        this.f43858a = i3;
        this.f43859b = dy0Var;
    }

    @Override
    public final void run() {
        switch (this.f43858a) {
            case 0:
                dy0 dy0Var = this.f43859b;
                ey0 ey0Var = dy0Var.f44836w;
                if (dy0Var.f44828a == 0) {
                    ey0Var.dismiss();
                    return;
                } else {
                    ey0Var.onBackPressed();
                    return;
                }
            default:
                org.telegram.messenger.g0.K3(this.f43859b.f44833n.d);
                return;
        }
    }
}
