package org.telegram.ui;
public final class h60 implements Runnable {
    public final int f39910a;
    public final r60 f39911b;

    public h60(r60 r60Var, int i10) {
        this.f39910a = i10;
        this.f39911b = r60Var;
    }

    @Override
    public final void run() {
        switch (this.f39910a) {
            case 0:
                this.f39911b.finishFragment();
                return;
            case 1:
                r60 r60Var = this.f39911b;
                r60Var.j0();
                r60Var.f0();
                return;
            case 2:
                r60 r60Var2 = this.f39911b;
                r60Var2.getClass();
                r60Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                r60 r60Var3 = this.f39911b;
                r60Var3.f43025n.postOnAnimation(new h60(r60Var3, 1));
                return;
        }
    }
}
