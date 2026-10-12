package org.telegram.ui.ActionBar;
public final class p1 implements Runnable {
    public final int f21213a;
    public final a2 f21214b;

    public p1(a2 a2Var, int i10) {
        this.f21213a = i10;
        this.f21214b = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f21213a) {
            case 0:
                this.f21214b.dismiss();
                return;
            default:
                a2 a2Var = this.f21214b;
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
