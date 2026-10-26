package org.telegram.ui.Components;
public final class th0 implements Runnable {
    public final int f33002a;
    public final wh0 f33003b;

    public th0(wh0 wh0Var, int i10) {
        this.f33002a = i10;
        this.f33003b = wh0Var;
    }

    @Override
    public final void run() {
        switch (this.f33002a) {
            case 0:
                this.f33003b.a(true);
                return;
            default:
                this.f33003b.d();
                return;
        }
    }
}
