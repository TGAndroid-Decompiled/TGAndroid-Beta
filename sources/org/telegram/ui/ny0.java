package org.telegram.ui;
public final class ny0 implements Runnable {
    public final int f48250a;
    public final qy0 f48251b;

    public ny0(qy0 qy0Var, int i7) {
        this.f48250a = i7;
        this.f48251b = qy0Var;
    }

    @Override
    public final void run() {
        switch (this.f48250a) {
            case 0:
                qy0 qy0Var = this.f48251b;
                ry0 ry0Var = qy0Var.f49224w;
                if (qy0Var.f49216a == 0) {
                    ry0Var.dismiss();
                    return;
                } else {
                    ry0Var.onBackPressed();
                    return;
                }
            default:
                org.telegram.messenger.g0.K3(this.f48251b.f49221n.d);
                return;
        }
    }
}
