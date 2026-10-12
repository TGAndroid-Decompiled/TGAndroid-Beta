package org.telegram.ui.Components;
public final class rs implements Runnable {
    public final int f30234a;
    public final xs f30235b;

    public rs(xs xsVar, int i10) {
        this.f30234a = i10;
        this.f30235b = xsVar;
    }

    @Override
    public final void run() {
        switch (this.f30234a) {
            case 0:
                this.f30235b.X(false);
                return;
            default:
                xs.R(this.f30235b);
                return;
        }
    }
}
