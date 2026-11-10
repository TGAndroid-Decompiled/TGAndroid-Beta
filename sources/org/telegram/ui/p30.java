package org.telegram.ui;
public final class p30 implements Runnable {
    public final int f48639a;
    public final q30 f48640b;

    public p30(q30 q30Var, int i7) {
        this.f48639a = i7;
        this.f48640b = q30Var;
    }

    @Override
    public final void run() {
        switch (this.f48639a) {
            case 0:
                q30 q30Var = this.f48640b;
                o00 o00Var = q30Var.f48927b;
                if (o00Var != null) {
                    o00Var.setVisibility(0);
                }
                org.telegram.messenger.g0.i3(new p30(q30Var, 2), 16L);
                return;
            case 1:
                o00 o00Var2 = this.f48640b.f48927b;
                if (o00Var2 != null) {
                    o00Var2.setVisibility(4);
                    return;
                }
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
