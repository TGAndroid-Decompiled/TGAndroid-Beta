package org.telegram.ui.Components;
public final class gs implements Runnable {
    public final int f35617a;
    public final ks f35618b;

    public gs(ks ksVar, int i7) {
        this.f35617a = i7;
        this.f35618b = ksVar;
    }

    @Override
    public final void run() {
        switch (this.f35617a) {
            case 0:
                this.f35618b.X(false);
                return;
            default:
                this.f35618b.O(true);
                return;
        }
    }
}
