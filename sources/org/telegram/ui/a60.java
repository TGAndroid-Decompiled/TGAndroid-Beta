package org.telegram.ui;
public final class a60 implements Runnable {
    public final int f36368a;
    public final k60 f36369b;

    public a60(k60 k60Var, int i9) {
        this.f36368a = i9;
        this.f36369b = k60Var;
    }

    @Override
    public final void run() {
        switch (this.f36368a) {
            case 0:
                this.f36369b.finishFragment();
                return;
            case 1:
                k60 k60Var = this.f36369b;
                k60Var.h0();
                k60Var.d0();
                return;
            case 2:
                k60 k60Var2 = this.f36369b;
                k60Var2.getClass();
                k60Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                k60 k60Var3 = this.f36369b;
                k60Var3.f39742n.postOnAnimation(new a60(k60Var3, 1));
                return;
        }
    }
}
