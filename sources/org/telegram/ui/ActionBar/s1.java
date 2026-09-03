package org.telegram.ui.ActionBar;
public final class s1 implements Runnable {
    public final int f22280a;
    public final d2 f22281b;

    public s1(d2 d2Var, int i10) {
        this.f22280a = i10;
        this.f22281b = d2Var;
    }

    @Override
    public final void run() {
        switch (this.f22280a) {
            case 0:
                this.f22281b.dismiss();
                return;
            default:
                d2 d2Var = this.f22281b;
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
