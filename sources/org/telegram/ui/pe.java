package org.telegram.ui;
public final class pe implements Runnable {
    public final int f40023a;
    public final org.telegram.ui.Components.jm0 f40024b;

    public pe(org.telegram.ui.Components.jm0 jm0Var, int i10) {
        this.f40023a = i10;
        this.f40024b = jm0Var;
    }

    @Override
    public final void run() {
        switch (this.f40023a) {
            case 0:
                org.telegram.ui.Components.jm0 jm0Var = this.f40024b;
                if (!jm0Var.J) {
                    jm0Var.J = true;
                    jm0Var.c(new org.telegram.ui.Components.hm0(jm0Var, 0), false);
                    jm0Var.f28163s.invalidate();
                    return;
                }
                return;
            default:
                this.f40024b.dismiss();
                return;
        }
    }
}
