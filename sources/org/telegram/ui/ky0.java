package org.telegram.ui;
public final class ky0 implements Runnable {
    public final int f47347a;
    public final ny0 f47348b;

    public ky0(ny0 ny0Var, int i7) {
        this.f47347a = i7;
        this.f47348b = ny0Var;
    }

    @Override
    public final void run() {
        switch (this.f47347a) {
            case 0:
                ny0 ny0Var = this.f47348b;
                oy0 oy0Var = ny0Var.f48177w;
                if (ny0Var.f48169a == 0) {
                    oy0Var.dismiss();
                    return;
                } else {
                    oy0Var.onBackPressed();
                    return;
                }
            default:
                org.telegram.messenger.g0.K3(this.f47348b.f48174n.d);
                return;
        }
    }
}
