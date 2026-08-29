package org.telegram.ui;
public final class c60 implements Runnable {
    public final int f37007a;
    public final m60 f37008b;

    public c60(m60 m60Var, int i10) {
        this.f37007a = i10;
        this.f37008b = m60Var;
    }

    @Override
    public final void run() {
        switch (this.f37007a) {
            case 0:
                this.f37008b.finishFragment();
                return;
            case 1:
                m60 m60Var = this.f37008b;
                m60Var.i0();
                m60Var.e0();
                return;
            case 2:
                m60 m60Var2 = this.f37008b;
                m60Var2.getClass();
                m60Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                m60 m60Var3 = this.f37008b;
                m60Var3.f40458n.postOnAnimation(new c60(m60Var3, 1));
                return;
        }
    }
}
