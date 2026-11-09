package org.telegram.ui;
public final class o30 implements Runnable {
    public final int f48330a;
    public final p30 f48331b;

    public o30(p30 p30Var, int i7) {
        this.f48330a = i7;
        this.f48331b = p30Var;
    }

    @Override
    public final void run() {
        switch (this.f48330a) {
            case 0:
                p30 p30Var = this.f48331b;
                n00 n00Var = p30Var.f48603b;
                if (n00Var != null) {
                    n00Var.setVisibility(0);
                }
                org.telegram.messenger.g0.i3(new o30(p30Var, 2), 16L);
                return;
            case 1:
                n00 n00Var2 = this.f48331b.f48603b;
                if (n00Var2 != null) {
                    n00Var2.setVisibility(4);
                    return;
                }
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
