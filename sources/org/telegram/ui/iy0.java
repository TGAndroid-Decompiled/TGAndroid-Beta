package org.telegram.ui;
public final class iy0 implements Runnable {
    public final int f48145a;
    public final ly0 f48146b;

    public iy0(ly0 ly0Var, int i7) {
        this.f48145a = i7;
        this.f48146b = ly0Var;
    }

    @Override
    public final void run() {
        switch (this.f48145a) {
            case 0:
                ly0 ly0Var = this.f48146b;
                my0 my0Var = ly0Var.f49065w;
                if (ly0Var.f49057a == 0) {
                    my0Var.dismiss();
                    return;
                } else {
                    my0Var.onBackPressed();
                    return;
                }
            default:
                org.telegram.messenger.g0.J3(this.f48146b.f49062n.d);
                return;
        }
    }
}
