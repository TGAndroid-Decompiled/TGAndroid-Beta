package org.telegram.ui.ActionBar;
public final class q1 implements Runnable {
    public final int f19743a;
    public final b2 f19744b;

    public q1(b2 b2Var, int i10) {
        this.f19743a = i10;
        this.f19744b = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f19743a) {
            case 0:
                this.f19744b.dismiss();
                return;
            default:
                b2 b2Var = this.f19744b;
                if (!b2Var.isShowing()) {
                    try {
                        b2Var.show();
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
        }
    }
}
