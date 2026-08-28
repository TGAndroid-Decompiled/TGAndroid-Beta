package org.telegram.ui.Components;
public final class ew implements Runnable {
    public final int f28189a;
    public final ky f28190b;

    public ew(ky kyVar, int i9) {
        this.f28189a = i9;
        this.f28190b = kyVar;
    }

    @Override
    public final void run() {
        switch (this.f28189a) {
            case 0:
            default:
                this.f28190b.d();
                return;
        }
    }
}
