package org.telegram.ui.Components;
public final class sw implements Runnable {
    public final int f28328a;
    public final zy f28329b;

    public sw(zy zyVar, int i10) {
        this.f28328a = i10;
        this.f28329b = zyVar;
    }

    @Override
    public final void run() {
        switch (this.f28328a) {
            case 0:
            default:
                this.f28329b.d();
                return;
        }
    }
}
