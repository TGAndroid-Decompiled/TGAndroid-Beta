package org.telegram.ui.Components;
public final class kw implements Runnable {
    public final int f30156a;
    public final sy f30157b;

    public kw(sy syVar, int i10) {
        this.f30156a = i10;
        this.f30157b = syVar;
    }

    @Override
    public final void run() {
        switch (this.f30156a) {
            case 0:
            default:
                this.f30157b.d();
                return;
        }
    }
}
