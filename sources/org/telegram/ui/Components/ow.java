package org.telegram.ui.Components;
public final class ow implements Runnable {
    public final int f27676a;
    public final xy f27677b;

    public ow(xy xyVar, int i10) {
        this.f27676a = i10;
        this.f27677b = xyVar;
    }

    @Override
    public final void run() {
        switch (this.f27676a) {
            case 0:
            default:
                this.f27677b.d();
                return;
        }
    }
}
