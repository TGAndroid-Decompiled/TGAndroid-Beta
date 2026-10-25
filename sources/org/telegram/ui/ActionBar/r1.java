package org.telegram.ui.ActionBar;
public final class r1 implements Runnable {
    public final int f23000a;
    public final e2 f23001b;

    public r1(e2 e2Var, int i10) {
        this.f23000a = i10;
        this.f23001b = e2Var;
    }

    @Override
    public final void run() {
        switch (this.f23000a) {
            case 0:
                this.f23001b.dismiss();
                return;
            default:
                e2 e2Var = this.f23001b;
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
