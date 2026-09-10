package org.telegram.ui.ActionBar;
public final class s1 implements Runnable {
    public final int f18617a;
    public final d2 f18618b;

    public s1(d2 d2Var, int i10) {
        this.f18617a = i10;
        this.f18618b = d2Var;
    }

    @Override
    public final void run() {
        switch (this.f18617a) {
            case 0:
                this.f18618b.dismiss();
                return;
            default:
                d2 d2Var = this.f18618b;
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
