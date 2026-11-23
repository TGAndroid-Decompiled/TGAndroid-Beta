package org.telegram.ui;
public final class my0 implements Runnable {
    public final int f50040a;
    public final py0 f50041b;

    public my0(py0 py0Var, int i7) {
        this.f50040a = i7;
        this.f50041b = py0Var;
    }

    @Override
    public final void run() {
        switch (this.f50040a) {
            case 0:
                py0 py0Var = this.f50041b;
                qy0 qy0Var = py0Var.f51014w;
                if (py0Var.f51006a == 0) {
                    qy0Var.dismiss();
                    return;
                } else {
                    qy0Var.onBackPressed();
                    return;
                }
            default:
                org.telegram.messenger.g0.I3(this.f50041b.f51011n.d);
                return;
        }
    }
}
