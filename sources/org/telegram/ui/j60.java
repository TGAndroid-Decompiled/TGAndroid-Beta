package org.telegram.ui;
public final class j60 implements Runnable {
    public final int f40446a;
    public final t60 f40447b;

    public j60(t60 t60Var, int i10) {
        this.f40446a = i10;
        this.f40447b = t60Var;
    }

    @Override
    public final void run() {
        switch (this.f40446a) {
            case 0:
                this.f40447b.finishFragment();
                return;
            case 1:
                t60 t60Var = this.f40447b;
                t60Var.j0();
                t60Var.f0();
                return;
            case 2:
                t60 t60Var2 = this.f40447b;
                t60Var2.getClass();
                t60Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                t60 t60Var3 = this.f40447b;
                t60Var3.f43513n.postOnAnimation(new j60(t60Var3, 1));
                return;
        }
    }
}
