package org.telegram.ui.ActionBar;
public final class p1 implements Runnable {
    public final int f19715a;
    public final a2 f19716b;

    public p1(a2 a2Var, int i10) {
        this.f19715a = i10;
        this.f19716b = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f19715a) {
            case 0:
                this.f19716b.dismiss();
                return;
            default:
                a2 a2Var = this.f19716b;
                if (!a2Var.isShowing()) {
                    try {
                        a2Var.show();
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
        }
    }
}
