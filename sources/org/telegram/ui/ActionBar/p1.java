package org.telegram.ui.ActionBar;
public final class p1 implements Runnable {
    public final int f21663a;
    public final b2 f21664b;

    public p1(b2 b2Var, int i10) {
        this.f21663a = i10;
        this.f21664b = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f21663a) {
            case 0:
                this.f21664b.dismiss();
                return;
            default:
                b2 b2Var = this.f21664b;
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
