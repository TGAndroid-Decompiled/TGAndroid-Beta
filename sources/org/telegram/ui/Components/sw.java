package org.telegram.ui.Components;
public final class sw implements Runnable {
    public final int f28329a;
    public final zy f28330b;

    public sw(zy zyVar, int i10) {
        this.f28329a = i10;
        this.f28330b = zyVar;
    }

    @Override
    public final void run() {
        switch (this.f28329a) {
            case 0:
            default:
                this.f28330b.d();
                return;
        }
    }
}
