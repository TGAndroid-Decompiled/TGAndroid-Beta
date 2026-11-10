package org.telegram.ui;
public final class oy0 implements Runnable {
    public final int f48594a;
    public final ry0 f48595b;

    public oy0(ry0 ry0Var, int i7) {
        this.f48594a = i7;
        this.f48595b = ry0Var;
    }

    @Override
    public final void run() {
        switch (this.f48594a) {
            case 0:
                ry0 ry0Var = this.f48595b;
                sy0 sy0Var = ry0Var.f49603w;
                if (ry0Var.f49595a == 0) {
                    sy0Var.dismiss();
                    return;
                } else {
                    sy0Var.onBackPressed();
                    return;
                }
            default:
                org.telegram.messenger.g0.K3(this.f48595b.f49600n.d);
                return;
        }
    }
}
