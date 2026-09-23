package org.telegram.ui.Components;
public final class sw implements Runnable {
    public final int f27995a;
    public final zy f27996b;

    public sw(zy zyVar, int i10) {
        this.f27995a = i10;
        this.f27996b = zyVar;
    }

    @Override
    public final void run() {
        switch (this.f27995a) {
            case 0:
            default:
                this.f27996b.d();
                return;
        }
    }
}
