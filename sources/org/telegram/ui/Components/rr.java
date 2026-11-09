package org.telegram.ui.Components;
public final class rr implements Runnable {
    public final int f37786a;
    public final vr f37787b;

    public rr(vr vrVar, int i7) {
        this.f37786a = i7;
        this.f37787b = vrVar;
    }

    @Override
    public final void run() {
        switch (this.f37786a) {
            case 0:
                this.f37787b.X(false);
                return;
            default:
                this.f37787b.O(true);
                return;
        }
    }
}
