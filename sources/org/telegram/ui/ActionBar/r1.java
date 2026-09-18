package org.telegram.ui.ActionBar;
public final class r1 implements Runnable {
    public final int f19537a;
    public final c2 f19538b;

    public r1(c2 c2Var, int i10) {
        this.f19537a = i10;
        this.f19538b = c2Var;
    }

    @Override
    public final void run() {
        switch (this.f19537a) {
            case 0:
                this.f19538b.dismiss();
                return;
            default:
                c2 c2Var = this.f19538b;
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
