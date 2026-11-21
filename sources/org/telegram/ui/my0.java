package org.telegram.ui;
public final class my0 implements Runnable {
    public final int f50036a;
    public final py0 f50037b;

    public my0(py0 py0Var, int i7) {
        this.f50036a = i7;
        this.f50037b = py0Var;
    }

    @Override
    public final void run() {
        switch (this.f50036a) {
            case 0:
                py0 py0Var = this.f50037b;
                qy0 qy0Var = py0Var.f51010w;
                if (py0Var.f51002a == 0) {
                    qy0Var.dismiss();
                    return;
                } else {
                    qy0Var.onBackPressed();
                    return;
                }
            default:
                org.telegram.messenger.g0.I3(this.f50037b.f51007n.d);
                return;
        }
    }
}
