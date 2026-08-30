package org.telegram.ui;
public final class pe implements Runnable {
    public final int f37284a;
    public final org.telegram.ui.Components.im0 f37285b;

    public pe(org.telegram.ui.Components.im0 im0Var, int i10) {
        this.f37284a = i10;
        this.f37285b = im0Var;
    }

    @Override
    public final void run() {
        switch (this.f37284a) {
            case 0:
                org.telegram.ui.Components.im0 im0Var = this.f37285b;
                if (!im0Var.J) {
                    im0Var.J = true;
                    im0Var.c(new org.telegram.ui.Components.gm0(im0Var, 0), false);
                    im0Var.f25752s.invalidate();
                    return;
                }
                return;
            default:
                this.f37285b.dismiss();
                return;
        }
    }
}
