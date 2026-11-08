package org.telegram.ui.Components;
public final class rr implements Runnable {
    public final int f37745a;
    public final vr f37746b;

    public rr(vr vrVar, int i7) {
        this.f37745a = i7;
        this.f37746b = vrVar;
    }

    @Override
    public final void run() {
        switch (this.f37745a) {
            case 0:
                this.f37746b.X(false);
                return;
            default:
                this.f37746b.O(true);
                return;
        }
    }
}
