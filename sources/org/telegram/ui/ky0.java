package org.telegram.ui;
public final class ky0 implements Runnable {
    public final int f47320a;
    public final ny0 f47321b;

    public ky0(ny0 ny0Var, int i7) {
        this.f47320a = i7;
        this.f47321b = ny0Var;
    }

    @Override
    public final void run() {
        switch (this.f47320a) {
            case 0:
                ny0 ny0Var = this.f47321b;
                oy0 oy0Var = ny0Var.f48148w;
                if (ny0Var.f48140a == 0) {
                    oy0Var.dismiss();
                    return;
                } else {
                    oy0Var.onBackPressed();
                    return;
                }
            default:
                org.telegram.messenger.g0.K3(this.f47321b.f48145n.d);
                return;
        }
    }
}
