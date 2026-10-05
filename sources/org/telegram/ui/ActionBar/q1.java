package org.telegram.ui.ActionBar;
public final class q1 implements Runnable {
    public final int f21483a;
    public final b2 f21484b;

    public q1(b2 b2Var, int i10) {
        this.f21483a = i10;
        this.f21484b = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f21483a) {
            case 0:
                this.f21484b.dismiss();
                return;
            default:
                b2 b2Var = this.f21484b;
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
