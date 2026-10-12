package org.telegram.ui;
public final class l00 implements Runnable {
    public final int f37797a;
    public final l10 f37798b;

    public l00(l10 l10Var, int i10) {
        this.f37797a = i10;
        this.f37798b = l10Var;
    }

    @Override
    public final void run() {
        switch (this.f37797a) {
            case 0:
                l10.V(this.f37798b);
                return;
            default:
                l10.W(this.f37798b);
                return;
        }
    }
}
