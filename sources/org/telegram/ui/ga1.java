package org.telegram.ui;
public final class ga1 implements Runnable {
    public final int f37498a;
    public final la1 f37499b;

    public ga1(la1 la1Var, int i10) {
        this.f37498a = i10;
        this.f37499b = la1Var;
    }

    @Override
    public final void run() {
        switch (this.f37498a) {
            case 0:
                la1 la1Var = this.f37499b;
                la1Var.getClass();
                new kg.i1((org.telegram.ui.ActionBar.k2) la1Var, 11, false).show();
                return;
            default:
                la1 la1Var2 = this.f37499b;
                la1Var2.e.requestFocus();
                org.telegram.messenger.i0.J3(la1Var2.e);
                return;
        }
    }
}
