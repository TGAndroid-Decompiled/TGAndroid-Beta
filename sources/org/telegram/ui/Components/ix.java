package org.telegram.ui.Components;
public final class ix implements Runnable {
    public final int f27473a;
    public final oz f27474b;

    public ix(oz ozVar, int i10) {
        this.f27473a = i10;
        this.f27474b = ozVar;
    }

    @Override
    public final void run() {
        switch (this.f27473a) {
            case 0:
            default:
                this.f27474b.d();
                return;
        }
    }
}
