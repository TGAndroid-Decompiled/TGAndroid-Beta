package org.telegram.ui;

public final class e60 implements Runnable {

    public final int f37639a;

    public final o60 f37640b;

    public e60(o60 o60Var, int i10) {
        this.f37639a = i10;
        this.f37640b = o60Var;
    }

    @Override
    public final void run() {
        switch (this.f37639a) {
            case 0:
                this.f37640b.finishFragment();
                break;
            case 1:
                o60 o60Var = this.f37640b;
                o60Var.i0();
                o60Var.e0();
                break;
            case 2:
                o60 o60Var2 = this.f37640b;
                o60Var2.getClass();
                o60Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                break;
            default:
                o60 o60Var3 = this.f37640b;
                o60Var3.f41010n.postOnAnimation(new e60(o60Var3, 1));
                break;
        }
    }
}
