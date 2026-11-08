package org.telegram.ui;
public final class ky0 implements Runnable {
    public final int f47351a;
    public final ny0 f47352b;

    public ky0(ny0 ny0Var, int i7) {
        this.f47351a = i7;
        this.f47352b = ny0Var;
    }

    @Override
    public final void run() {
        switch (this.f47351a) {
            case 0:
                ny0 ny0Var = this.f47352b;
                oy0 oy0Var = ny0Var.f48176w;
                if (ny0Var.f48168a == 0) {
                    oy0Var.dismiss();
                    return;
                } else {
                    oy0Var.onBackPressed();
                    return;
                }
            default:
                org.telegram.messenger.g0.K3(this.f47352b.f48173n.d);
                return;
        }
    }
}
