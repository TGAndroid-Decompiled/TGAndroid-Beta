package org.telegram.ui.ActionBar;
public final class p1 implements Runnable {
    public final int f21659a;
    public final b2 f21660b;

    public p1(b2 b2Var, int i10) {
        this.f21659a = i10;
        this.f21660b = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f21659a) {
            case 0:
                this.f21660b.dismiss();
                return;
            default:
                b2 b2Var = this.f21660b;
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
