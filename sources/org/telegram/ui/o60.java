package org.telegram.ui;
public final class o60 implements Runnable {
    public final int f36799a;
    public final y60 f36800b;

    public o60(y60 y60Var, int i10) {
        this.f36799a = i10;
        this.f36800b = y60Var;
    }

    @Override
    public final void run() {
        switch (this.f36799a) {
            case 0:
                this.f36800b.finishFragment();
                return;
            case 1:
                y60 y60Var = this.f36800b;
                y60Var.i0();
                y60Var.e0();
                return;
            case 2:
                y60 y60Var2 = this.f36800b;
                y60Var2.getClass();
                y60Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                y60 y60Var3 = this.f36800b;
                y60Var3.f40427n.postOnAnimation(new o60(y60Var3, 1));
                return;
        }
    }
}
