package org.telegram.ui.ActionBar;
public final class p1 implements Runnable {
    public final int f20284a;
    public final a2 f20285b;

    public p1(a2 a2Var, int i10) {
        this.f20284a = i10;
        this.f20285b = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f20284a) {
            case 0:
                this.f20285b.dismiss();
                return;
            default:
                a2 a2Var = this.f20285b;
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
