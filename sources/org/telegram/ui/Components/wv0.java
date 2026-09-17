package org.telegram.ui.Components;
public final class wv0 implements Runnable {
    public final int f29756a;
    public final yv0 f29757b;

    public wv0(yv0 yv0Var, int i10) {
        this.f29756a = i10;
        this.f29757b = yv0Var;
    }

    @Override
    public final void run() {
        switch (this.f29756a) {
            case 0:
                yv0 yv0Var = this.f29757b;
                yv0Var.V0 = false;
                if (!yv0Var.Y0 && yv0Var.W0) {
                    yv0Var.C(true);
                    return;
                }
                return;
            case 1:
                this.f29757b.V0 = false;
                return;
            case 2:
                yv0 yv0Var2 = this.f29757b;
                yv0Var2.Y0 = false;
                if (!yv0Var2.V0 && yv0Var2.W0) {
                    yv0Var2.C(true);
                    return;
                }
                return;
            default:
                this.f29757b.Y0 = false;
                return;
        }
    }
}
