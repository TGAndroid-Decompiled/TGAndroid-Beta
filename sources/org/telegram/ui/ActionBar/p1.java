package org.telegram.ui.ActionBar;
public final class p1 implements Runnable {
    public final int f21662a;
    public final b2 f21663b;

    public p1(b2 b2Var, int i10) {
        this.f21662a = i10;
        this.f21663b = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f21662a) {
            case 0:
                this.f21663b.dismiss();
                return;
            default:
                b2 b2Var = this.f21663b;
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
