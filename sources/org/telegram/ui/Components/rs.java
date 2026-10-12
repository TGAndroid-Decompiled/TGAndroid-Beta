package org.telegram.ui.Components;
public final class rs implements Runnable {
    public final int f30230a;
    public final xs f30231b;

    public rs(xs xsVar, int i10) {
        this.f30230a = i10;
        this.f30231b = xsVar;
    }

    @Override
    public final void run() {
        switch (this.f30230a) {
            case 0:
                this.f30231b.X(false);
                return;
            default:
                xs.R(this.f30231b);
                return;
        }
    }
}
