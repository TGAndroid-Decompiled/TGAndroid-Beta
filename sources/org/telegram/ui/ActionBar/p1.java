package org.telegram.ui.ActionBar;
public final class p1 implements Runnable {
    public final int f21667a;
    public final b2 f21668b;

    public p1(b2 b2Var, int i10) {
        this.f21667a = i10;
        this.f21668b = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f21667a) {
            case 0:
                this.f21668b.dismiss();
                return;
            default:
                b2 b2Var = this.f21668b;
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
