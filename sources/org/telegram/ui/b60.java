package org.telegram.ui;
public final class b60 implements Runnable {
    public final int f35515a;
    public final l60 f35516b;

    public b60(l60 l60Var, int i10) {
        this.f35515a = i10;
        this.f35516b = l60Var;
    }

    @Override
    public final void run() {
        switch (this.f35515a) {
            case 0:
                this.f35516b.finishFragment();
                return;
            case 1:
                l60 l60Var = this.f35516b;
                l60Var.i0();
                l60Var.e0();
                return;
            case 2:
                l60 l60Var2 = this.f35516b;
                l60Var2.getClass();
                l60Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                l60 l60Var3 = this.f35516b;
                l60Var3.f38817n.postOnAnimation(new b60(l60Var3, 1));
                return;
        }
    }
}
