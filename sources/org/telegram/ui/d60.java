package org.telegram.ui;
public final class d60 implements Runnable {
    public final int f36073a;
    public final n60 f36074b;

    public d60(n60 n60Var, int i10) {
        this.f36073a = i10;
        this.f36074b = n60Var;
    }

    @Override
    public final void run() {
        switch (this.f36073a) {
            case 0:
                this.f36074b.finishFragment();
                return;
            case 1:
                n60 n60Var = this.f36074b;
                n60Var.i0();
                n60Var.e0();
                return;
            case 2:
                n60 n60Var2 = this.f36074b;
                n60Var2.getClass();
                n60Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                n60 n60Var3 = this.f36074b;
                n60Var3.f39329n.postOnAnimation(new d60(n60Var3, 1));
                return;
        }
    }
}
