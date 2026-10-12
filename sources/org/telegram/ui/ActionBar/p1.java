package org.telegram.ui.ActionBar;
public final class p1 implements Runnable {
    public final int f20584a;
    public final a2 f20585b;

    public p1(a2 a2Var, int i10) {
        this.f20584a = i10;
        this.f20585b = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f20584a) {
            case 0:
                this.f20585b.dismiss();
                return;
            default:
                a2 a2Var = this.f20585b;
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
