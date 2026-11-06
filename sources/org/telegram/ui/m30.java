package org.telegram.ui;
public final class m30 implements Runnable {
    public final int f47640a;
    public final n30 f47641b;

    public m30(n30 n30Var, int i7) {
        this.f47640a = i7;
        this.f47641b = n30Var;
    }

    @Override
    public final void run() {
        switch (this.f47640a) {
            case 0:
                n30 n30Var = this.f47641b;
                l00 l00Var = n30Var.f47949b;
                if (l00Var != null) {
                    l00Var.setVisibility(0);
                }
                org.telegram.messenger.g0.i3(new m30(n30Var, 2), 16L);
                return;
            case 1:
                l00 l00Var2 = this.f47641b.f47949b;
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
