package org.telegram.ui.ActionBar;
public final class s1 implements Runnable {
    public final int f20571a;
    public final d2 f20572b;

    public s1(d2 d2Var, int i10) {
        this.f20571a = i10;
        this.f20572b = d2Var;
    }

    @Override
    public final void run() {
        switch (this.f20571a) {
            case 0:
                this.f20572b.dismiss();
                return;
            default:
                d2 d2Var = this.f20572b;
                if (!d2Var.isShowing()) {
                    try {
                        d2Var.show();
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
        }
    }
}
