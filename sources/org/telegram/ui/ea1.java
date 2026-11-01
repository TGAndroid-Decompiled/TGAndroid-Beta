package org.telegram.ui;
public final class ea1 implements Runnable {
    public final int f36786a;
    public final ja1 f36787b;

    public ea1(ja1 ja1Var, int i10) {
        this.f36786a = i10;
        this.f36787b = ja1Var;
    }

    @Override
    public final void run() {
        switch (this.f36786a) {
            case 0:
                ja1 ja1Var = this.f36787b;
                ja1Var.getClass();
                new kg.i1((org.telegram.ui.ActionBar.k2) ja1Var, 11, false).show();
                return;
            default:
                ja1 ja1Var2 = this.f36787b;
                ja1Var2.e.requestFocus();
                org.telegram.messenger.i0.J3(ja1Var2.e);
                return;
        }
    }
}
