package org.telegram.ui;
public final class ly0 implements Runnable {
    public final int f49889a;
    public final oy0 f49890b;

    public ly0(oy0 oy0Var, int i7) {
        this.f49889a = i7;
        this.f49890b = oy0Var;
    }

    @Override
    public final void run() {
        switch (this.f49889a) {
            case 0:
                oy0 oy0Var = this.f49890b;
                py0 py0Var = oy0Var.f50793w;
                if (oy0Var.f50785a == 0) {
                    py0Var.dismiss();
                    return;
                } else {
                    py0Var.onBackPressed();
                    return;
                }
            default:
                org.telegram.messenger.g0.I3(this.f49890b.f50790n.d);
                return;
        }
    }
}
