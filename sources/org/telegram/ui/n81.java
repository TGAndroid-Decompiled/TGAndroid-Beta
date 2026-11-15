package org.telegram.ui;
public final class n81 implements Runnable {
    public final int f49522a;
    public final s81 f49523b;

    public n81(s81 s81Var, int i7) {
        this.f49522a = i7;
        this.f49523b = s81Var;
    }

    @Override
    public final void run() {
        switch (this.f49522a) {
            case 0:
                s81 s81Var = this.f49523b;
                s81Var.getClass();
                new ug.x0((org.telegram.ui.ActionBar.e2) s81Var, 11, false).show();
                return;
            default:
                s81 s81Var2 = this.f49523b;
                s81Var2.f51149e.requestFocus();
                org.telegram.messenger.g0.J3(s81Var2.f51149e);
                return;
        }
    }
}
