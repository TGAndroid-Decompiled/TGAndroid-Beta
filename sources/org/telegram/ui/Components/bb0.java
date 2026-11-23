package org.telegram.ui.Components;
public final class bb0 implements Runnable {
    public final int f33820a;
    public final cb0 f33821b;

    public bb0(cb0 cb0Var, int i7) {
        this.f33820a = i7;
        this.f33821b = cb0Var;
    }

    @Override
    public final void run() {
        switch (this.f33820a) {
            case 0:
                this.f33821b.y();
                return;
            default:
                this.f33821b.m(true);
                return;
        }
    }
}
