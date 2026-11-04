package org.telegram.ui;
public final class f81 implements Runnable {
    public final int f45217a;
    public final l81 f45218b;

    public f81(l81 l81Var, int i3) {
        this.f45217a = i3;
        this.f45218b = l81Var;
    }

    @Override
    public final void run() {
        switch (this.f45217a) {
            case 0:
                l81 l81Var = this.f45218b;
                l81Var.getClass();
                new vg.v0((org.telegram.ui.ActionBar.d2) l81Var, 11, false).show();
                return;
            default:
                l81 l81Var2 = this.f45218b;
                l81Var2.f47221e.requestFocus();
                org.telegram.messenger.g0.K3(l81Var2.f47221e);
                return;
        }
    }
}
