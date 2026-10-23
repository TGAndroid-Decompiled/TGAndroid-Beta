package org.telegram.ui.ActionBar;
public final class p1 implements Runnable {
    public final int f21750a;
    public final c2 f21751b;

    public p1(c2 c2Var, int i10) {
        this.f21750a = i10;
        this.f21751b = c2Var;
    }

    @Override
    public final void run() {
        switch (this.f21750a) {
            case 0:
                this.f21751b.dismiss();
                return;
            default:
                c2 c2Var = this.f21751b;
                if (!c2Var.isShowing()) {
                    try {
                        c2Var.show();
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
        }
    }
}
