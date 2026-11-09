package org.telegram.ui;
public final class q81 implements Runnable {
    public final int f48979a;
    public final w81 f48980b;

    public q81(w81 w81Var, int i7) {
        this.f48979a = i7;
        this.f48980b = w81Var;
    }

    @Override
    public final void run() {
        switch (this.f48979a) {
            case 0:
                w81 w81Var = this.f48980b;
                w81Var.getClass();
                new ug.w0((org.telegram.ui.ActionBar.f2) w81Var, 11, false).show();
                return;
            default:
                w81 w81Var2 = this.f48980b;
                w81Var2.f50978e.requestFocus();
                org.telegram.messenger.g0.K3(w81Var2.f50978e);
                return;
        }
    }
}
