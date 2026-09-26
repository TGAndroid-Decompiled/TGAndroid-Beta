package org.telegram.ui.ActionBar;
public final class p1 implements Runnable {
    public final int f19698a;
    public final a2 f19699b;

    public p1(a2 a2Var, int i10) {
        this.f19698a = i10;
        this.f19699b = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f19698a) {
            case 0:
                this.f19699b.dismiss();
                return;
            default:
                a2 a2Var = this.f19699b;
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
