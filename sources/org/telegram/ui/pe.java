package org.telegram.ui;
public final class pe implements Runnable {
    public final int f39984a;
    public final org.telegram.ui.Components.im0 f39985b;

    public pe(org.telegram.ui.Components.im0 im0Var, int i10) {
        this.f39984a = i10;
        this.f39985b = im0Var;
    }

    @Override
    public final void run() {
        switch (this.f39984a) {
            case 0:
                org.telegram.ui.Components.im0 im0Var = this.f39985b;
                if (!im0Var.J) {
                    im0Var.J = true;
                    im0Var.c(new org.telegram.ui.Components.gm0(im0Var, 0), false);
                    im0Var.f27864s.invalidate();
                    return;
                }
                return;
            default:
                this.f39985b.dismiss();
                return;
        }
    }
}
