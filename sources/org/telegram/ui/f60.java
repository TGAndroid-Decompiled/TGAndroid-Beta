package org.telegram.ui;
public final class f60 implements Runnable {
    public final int f37209a;
    public final p60 f37210b;

    public f60(p60 p60Var, int i10) {
        this.f37209a = i10;
        this.f37210b = p60Var;
    }

    @Override
    public final void run() {
        switch (this.f37209a) {
            case 0:
                this.f37210b.finishFragment();
                return;
            case 1:
                p60 p60Var = this.f37210b;
                p60Var.i0();
                p60Var.e0();
                return;
            case 2:
                p60 p60Var2 = this.f37210b;
                p60Var2.getClass();
                p60Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                p60 p60Var3 = this.f37210b;
                p60Var3.f40364n.postOnAnimation(new f60(p60Var3, 1));
                return;
        }
    }
}
