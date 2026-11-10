package org.telegram.ui.Components;
public final class qr implements Runnable {
    public final int f37376a;
    public final ur f37377b;

    public qr(ur urVar, int i7) {
        this.f37376a = i7;
        this.f37377b = urVar;
    }

    @Override
    public final void run() {
        switch (this.f37376a) {
            case 0:
                this.f37377b.X(false);
                return;
            default:
                this.f37377b.O(true);
                return;
        }
    }
}
