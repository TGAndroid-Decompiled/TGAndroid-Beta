package org.telegram.ui.ActionBar;
public final class q1 implements Runnable {
    public final int f19471a;
    public final b2 f19472b;

    public q1(b2 b2Var, int i10) {
        this.f19471a = i10;
        this.f19472b = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f19471a) {
            case 0:
                this.f19472b.dismiss();
                return;
            default:
                b2 b2Var = this.f19472b;
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
