package org.telegram.ui;
public final class iy0 implements Runnable {
    public final int f48160a;
    public final ly0 f48161b;

    public iy0(ly0 ly0Var, int i7) {
        this.f48160a = i7;
        this.f48161b = ly0Var;
    }

    @Override
    public final void run() {
        switch (this.f48160a) {
            case 0:
                ly0 ly0Var = this.f48161b;
                my0 my0Var = ly0Var.f49069w;
                if (ly0Var.f49061a == 0) {
                    my0Var.dismiss();
                    return;
                } else {
                    my0Var.onBackPressed();
                    return;
                }
            default:
                org.telegram.messenger.g0.J3(this.f48161b.f49066n.d);
                return;
        }
    }
}
