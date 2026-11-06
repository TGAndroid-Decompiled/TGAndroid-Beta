package org.telegram.ui.Components;
public final class rr implements Runnable {
    public final int f37724a;
    public final vr f37725b;

    public rr(vr vrVar, int i7) {
        this.f37724a = i7;
        this.f37725b = vrVar;
    }

    @Override
    public final void run() {
        switch (this.f37724a) {
            case 0:
                this.f37725b.X(false);
                return;
            default:
                this.f37725b.O(true);
                return;
        }
    }
}
