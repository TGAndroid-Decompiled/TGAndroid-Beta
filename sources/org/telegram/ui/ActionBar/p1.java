package org.telegram.ui.ActionBar;
public final class p1 implements Runnable {
    public final int f21666a;
    public final b2 f21667b;

    public p1(b2 b2Var, int i10) {
        this.f21666a = i10;
        this.f21667b = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f21666a) {
            case 0:
                this.f21667b.dismiss();
                return;
            default:
                b2 b2Var = this.f21667b;
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
