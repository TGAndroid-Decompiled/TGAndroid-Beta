package org.telegram.ui.Components;
public final class ab0 implements Runnable {
    public final int f33325a;
    public final bb0 f33326b;

    public ab0(bb0 bb0Var, int i7) {
        this.f33325a = i7;
        this.f33326b = bb0Var;
    }

    @Override
    public final void run() {
        switch (this.f33325a) {
            case 0:
                this.f33326b.y();
                return;
            default:
                this.f33326b.m(true);
                return;
        }
    }
}
