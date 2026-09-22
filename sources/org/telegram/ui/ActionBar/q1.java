package org.telegram.ui.ActionBar;
public final class q1 implements Runnable {
    public final int f19505a;
    public final b2 f19506b;

    public q1(b2 b2Var, int i10) {
        this.f19505a = i10;
        this.f19506b = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f19505a) {
            case 0:
                this.f19506b.dismiss();
                return;
            default:
                b2 b2Var = this.f19506b;
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
