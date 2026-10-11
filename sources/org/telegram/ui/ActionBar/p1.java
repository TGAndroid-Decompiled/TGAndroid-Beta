package org.telegram.ui.ActionBar;
public final class p1 implements Runnable {
    public final int f21438a;
    public final a2 f21439b;

    public p1(a2 a2Var, int i10) {
        this.f21438a = i10;
        this.f21439b = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f21438a) {
            case 0:
                this.f21439b.dismiss();
                return;
            default:
                a2 a2Var = this.f21439b;
                if (!a2Var.isShowing()) {
                    try {
                        a2Var.show();
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
        }
    }
}
