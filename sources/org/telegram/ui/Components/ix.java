package org.telegram.ui.Components;
public final class ix implements Runnable {
    public final int f27465a;
    public final oz f27466b;

    public ix(oz ozVar, int i10) {
        this.f27465a = i10;
        this.f27466b = ozVar;
    }

    @Override
    public final void run() {
        switch (this.f27465a) {
            case 0:
            default:
                this.f27466b.d();
                return;
        }
    }
}
