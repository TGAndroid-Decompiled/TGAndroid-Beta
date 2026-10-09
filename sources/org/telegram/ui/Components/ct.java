package org.telegram.ui.Components;
public final class ct implements Runnable {
    public final int f25504a;
    public final ht f25505b;

    public ct(ht htVar, int i10) {
        this.f25504a = i10;
        this.f25505b = htVar;
    }

    @Override
    public final void run() {
        switch (this.f25504a) {
            case 0:
                this.f25505b.W(false);
                return;
            default:
                this.f25505b.N(true);
                return;
        }
    }
}
