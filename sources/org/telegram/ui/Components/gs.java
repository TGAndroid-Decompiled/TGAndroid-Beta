package org.telegram.ui.Components;
public final class gs implements Runnable {
    public final int f35657a;
    public final ks f35658b;

    public gs(ks ksVar, int i7) {
        this.f35657a = i7;
        this.f35658b = ksVar;
    }

    @Override
    public final void run() {
        switch (this.f35657a) {
            case 0:
                this.f35658b.X(false);
                return;
            default:
                this.f35658b.O(true);
                return;
        }
    }
}
