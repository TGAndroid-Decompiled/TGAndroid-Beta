package org.telegram.ui.ActionBar;
public final class r1 implements Runnable {
    public final int f23746a;
    public final c2 f23747b;

    public r1(c2 c2Var, int i9) {
        this.f23746a = i9;
        this.f23747b = c2Var;
    }

    @Override
    public final void run() {
        switch (this.f23746a) {
            case 0:
                this.f23747b.dismiss();
                return;
            default:
                c2 c2Var = this.f23747b;
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
