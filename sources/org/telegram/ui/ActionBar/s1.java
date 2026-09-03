package org.telegram.ui.ActionBar;
public final class s1 implements Runnable {
    public final int f20546a;
    public final d2 f20547b;

    public s1(d2 d2Var, int i10) {
        this.f20546a = i10;
        this.f20547b = d2Var;
    }

    @Override
    public final void run() {
        switch (this.f20546a) {
            case 0:
                this.f20547b.dismiss();
                return;
            default:
                d2 d2Var = this.f20547b;
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
