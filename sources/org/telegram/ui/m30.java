package org.telegram.ui;
public final class m30 implements Runnable {
    public final int f47613a;
    public final n30 f47614b;

    public m30(n30 n30Var, int i7) {
        this.f47613a = i7;
        this.f47614b = n30Var;
    }

    @Override
    public final void run() {
        switch (this.f47613a) {
            case 0:
                n30 n30Var = this.f47614b;
                l00 l00Var = n30Var.f47923b;
                if (l00Var != null) {
                    l00Var.setVisibility(0);
                }
                org.telegram.messenger.g0.i3(new m30(n30Var, 2), 16L);
                return;
            case 1:
                l00 l00Var2 = this.f47614b.f47923b;
                if (l00Var2 != null) {
                    l00Var2.setVisibility(4);
                    return;
                }
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
