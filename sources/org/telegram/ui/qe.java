package org.telegram.ui;
public final class qe implements Runnable {
    public final int f40557a;
    public final org.telegram.ui.Components.zm0 f40558b;

    public qe(org.telegram.ui.Components.zm0 zm0Var, int i10) {
        this.f40557a = i10;
        this.f40558b = zm0Var;
    }

    @Override
    public final void run() {
        switch (this.f40557a) {
            case 0:
                org.telegram.ui.Components.zm0 zm0Var = this.f40558b;
                if (!zm0Var.M) {
                    zm0Var.M = true;
                    zm0Var.c(new org.telegram.ui.Components.xm0(zm0Var, 0), false);
                    zm0Var.f32979s.invalidate();
                    return;
                }
                return;
            default:
                this.f40558b.dismiss();
                return;
        }
    }
}
