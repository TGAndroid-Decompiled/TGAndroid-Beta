package org.telegram.ui;
public final class my0 implements Runnable {
    public final int f50014a;
    public final py0 f50015b;

    public my0(py0 py0Var, int i7) {
        this.f50014a = i7;
        this.f50015b = py0Var;
    }

    @Override
    public final void run() {
        switch (this.f50014a) {
            case 0:
                py0 py0Var = this.f50015b;
                qy0 qy0Var = py0Var.f50946w;
                if (py0Var.f50938a == 0) {
                    qy0Var.dismiss();
                    return;
                } else {
                    qy0Var.onBackPressed();
                    return;
                }
            default:
                org.telegram.messenger.g0.I3(this.f50015b.f50943n.d);
                return;
        }
    }
}
