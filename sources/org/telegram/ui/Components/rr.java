package org.telegram.ui.Components;
public final class rr implements Runnable {
    public final int f37821a;
    public final vr f37822b;

    public rr(vr vrVar, int i7) {
        this.f37821a = i7;
        this.f37822b = vrVar;
    }

    @Override
    public final void run() {
        switch (this.f37821a) {
            case 0:
                this.f37822b.X(false);
                return;
            default:
                this.f37822b.O(true);
                return;
        }
    }
}
