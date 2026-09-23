package org.telegram.ui.Components;
public final class ns implements Runnable {
    public final int f26504a;
    public final ss f26505b;

    public ns(ss ssVar, int i10) {
        this.f26504a = i10;
        this.f26505b = ssVar;
    }

    @Override
    public final void run() {
        switch (this.f26504a) {
            case 0:
                this.f26505b.W(false);
                return;
            default:
                this.f26505b.N(true);
                return;
        }
    }
}
