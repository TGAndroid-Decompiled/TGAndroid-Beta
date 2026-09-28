package org.telegram.ui.ActionBar;
public final class p1 implements Runnable {
    public final int f19699a;
    public final a2 f19700b;

    public p1(a2 a2Var, int i10) {
        this.f19699a = i10;
        this.f19700b = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f19699a) {
            case 0:
                this.f19700b.dismiss();
                return;
            default:
                a2 a2Var = this.f19700b;
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
