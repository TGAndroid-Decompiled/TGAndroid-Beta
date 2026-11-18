package org.telegram.ui;
public final class p40 implements Runnable {
    public final int f50725a;
    public final z40 f50726b;

    public p40(z40 z40Var, int i7) {
        this.f50725a = i7;
        this.f50726b = z40Var;
    }

    @Override
    public final void run() {
        switch (this.f50725a) {
            case 0:
                this.f50726b.finishFragment();
                return;
            case 1:
                z40 z40Var = this.f50726b;
                z40Var.n0();
                z40Var.j0();
                return;
            case 2:
                z40 z40Var2 = this.f50726b;
                z40Var2.getClass();
                z40Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                z40 z40Var3 = this.f50726b;
                z40Var3.f54414n.postOnAnimation(new p40(z40Var3, 1));
                return;
        }
    }
}
