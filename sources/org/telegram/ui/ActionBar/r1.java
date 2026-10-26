package org.telegram.ui.ActionBar;
public final class r1 implements Runnable {
    public final int f23002a;
    public final e2 f23003b;

    public r1(e2 e2Var, int i10) {
        this.f23002a = i10;
        this.f23003b = e2Var;
    }

    @Override
    public final void run() {
        switch (this.f23002a) {
            case 0:
                this.f23003b.dismiss();
                return;
            default:
                e2 e2Var = this.f23003b;
                if (!e2Var.isShowing()) {
                    try {
                        e2Var.show();
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
        }
    }
}
