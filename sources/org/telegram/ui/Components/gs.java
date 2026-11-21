package org.telegram.ui.Components;
public final class gs implements Runnable {
    public final int f35638a;
    public final ks f35639b;

    public gs(ks ksVar, int i7) {
        this.f35638a = i7;
        this.f35639b = ksVar;
    }

    @Override
    public final void run() {
        switch (this.f35638a) {
            case 0:
                this.f35639b.X(false);
                return;
            default:
                this.f35639b.O(true);
                return;
        }
    }
}
