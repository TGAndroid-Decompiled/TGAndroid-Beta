package org.telegram.ui;
public final class p81 implements Runnable {
    public final int f50910a;
    public final u81 f50911b;

    public p81(u81 u81Var, int i7) {
        this.f50910a = i7;
        this.f50911b = u81Var;
    }

    @Override
    public final void run() {
        switch (this.f50910a) {
            case 0:
                u81 u81Var = this.f50911b;
                u81Var.getClass();
                new ug.y0((org.telegram.ui.ActionBar.g2) u81Var, 11, false).show();
                return;
            default:
                u81 u81Var2 = this.f50911b;
                u81Var2.f52586e.requestFocus();
                org.telegram.messenger.g0.I3(u81Var2.f52586e);
                return;
        }
    }
}
