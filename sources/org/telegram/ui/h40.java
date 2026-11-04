package org.telegram.ui;
public final class h40 implements Runnable {
    public final int f45803a;
    public final r40 f45804b;

    public h40(r40 r40Var, int i3) {
        this.f45803a = i3;
        this.f45804b = r40Var;
    }

    @Override
    public final void run() {
        switch (this.f45803a) {
            case 0:
                this.f45804b.finishFragment();
                return;
            case 1:
                r40 r40Var = this.f45804b;
                r40Var.n0();
                r40Var.j0();
                return;
            case 2:
                r40 r40Var2 = this.f45804b;
                r40Var2.getClass();
                r40Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                r40 r40Var3 = this.f45804b;
                r40Var3.f49048n.postOnAnimation(new h40(r40Var3, 1));
                return;
        }
    }
}
