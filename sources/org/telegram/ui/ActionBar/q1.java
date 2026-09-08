package org.telegram.ui.ActionBar;
public final class q1 implements Runnable {
    public final int f21332a;
    public final b2 f21333b;

    public q1(b2 b2Var, int i10) {
        this.f21332a = i10;
        this.f21333b = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f21332a) {
            case 0:
                this.f21333b.dismiss();
                return;
            default:
                b2 b2Var = this.f21333b;
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
