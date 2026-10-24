package org.telegram.ui.Components;
public final class us implements Runnable {
    public final int f31217a;
    public final ys f31218b;

    public us(ys ysVar, int i10) {
        this.f31217a = i10;
        this.f31218b = ysVar;
    }

    @Override
    public final void run() {
        switch (this.f31217a) {
            case 0:
                this.f31218b.W(false);
                return;
            default:
                this.f31218b.N(true);
                return;
        }
    }
}
