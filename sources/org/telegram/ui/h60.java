package org.telegram.ui;
public final class h60 implements Runnable {
    public final int f39913a;
    public final r60 f39914b;

    public h60(r60 r60Var, int i10) {
        this.f39913a = i10;
        this.f39914b = r60Var;
    }

    @Override
    public final void run() {
        switch (this.f39913a) {
            case 0:
                this.f39914b.finishFragment();
                return;
            case 1:
                r60 r60Var = this.f39914b;
                r60Var.j0();
                r60Var.f0();
                return;
            case 2:
                r60 r60Var2 = this.f39914b;
                r60Var2.getClass();
                r60Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                r60 r60Var3 = this.f39914b;
                r60Var3.f43028n.postOnAnimation(new h60(r60Var3, 1));
                return;
        }
    }
}
