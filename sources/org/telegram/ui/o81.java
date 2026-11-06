package org.telegram.ui;
public final class o81 implements Runnable {
    public final int f48301a;
    public final u81 f48302b;

    public o81(u81 u81Var, int i7) {
        this.f48301a = i7;
        this.f48302b = u81Var;
    }

    @Override
    public final void run() {
        switch (this.f48301a) {
            case 0:
                u81 u81Var = this.f48302b;
                u81Var.getClass();
                new ug.w0((org.telegram.ui.ActionBar.f2) u81Var, 11, false).show();
                return;
            default:
                u81 u81Var2 = this.f48302b;
                u81Var2.f50319e.requestFocus();
                org.telegram.messenger.g0.K3(u81Var2.f50319e);
                return;
        }
    }
}
