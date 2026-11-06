package org.telegram.ui.Components;
public final class rr implements Runnable {
    public final int f37764a;
    public final vr f37765b;

    public rr(vr vrVar, int i7) {
        this.f37764a = i7;
        this.f37765b = vrVar;
    }

    @Override
    public final void run() {
        switch (this.f37764a) {
            case 0:
                this.f37765b.X(false);
                return;
            default:
                this.f37765b.O(true);
                return;
        }
    }
}
