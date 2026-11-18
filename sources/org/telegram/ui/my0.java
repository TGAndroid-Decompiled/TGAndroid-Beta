package org.telegram.ui;
public final class my0 implements Runnable {
    public final int f49995a;
    public final py0 f49996b;

    public my0(py0 py0Var, int i7) {
        this.f49995a = i7;
        this.f49996b = py0Var;
    }

    @Override
    public final void run() {
        switch (this.f49995a) {
            case 0:
                py0 py0Var = this.f49996b;
                qy0 qy0Var = py0Var.f50965w;
                if (py0Var.f50957a == 0) {
                    qy0Var.dismiss();
                    return;
                } else {
                    qy0Var.onBackPressed();
                    return;
                }
            default:
                org.telegram.messenger.g0.I3(this.f49996b.f50962n.d);
                return;
        }
    }
}
