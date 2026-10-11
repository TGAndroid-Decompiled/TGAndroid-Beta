package org.telegram.ui.Components;
public final class ix implements Runnable {
    public final int f27522a;
    public final oz f27523b;

    public ix(oz ozVar, int i10) {
        this.f27522a = i10;
        this.f27523b = ozVar;
    }

    @Override
    public final void run() {
        switch (this.f27522a) {
            case 0:
            default:
                this.f27523b.d();
                return;
        }
    }
}
