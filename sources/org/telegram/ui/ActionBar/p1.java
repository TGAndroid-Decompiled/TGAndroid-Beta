package org.telegram.ui.ActionBar;
public final class p1 implements Runnable {
    public final int f19700a;
    public final a2 f19701b;

    public p1(a2 a2Var, int i10) {
        this.f19700a = i10;
        this.f19701b = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f19700a) {
            case 0:
                this.f19701b.dismiss();
                return;
            default:
                a2 a2Var = this.f19701b;
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
