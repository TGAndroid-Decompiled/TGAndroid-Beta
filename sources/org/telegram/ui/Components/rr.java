package org.telegram.ui.Components;
public final class rr implements Runnable {
    public final int f37780a;
    public final vr f37781b;

    public rr(vr vrVar, int i3) {
        this.f37780a = i3;
        this.f37781b = vrVar;
    }

    @Override
    public final void run() {
        switch (this.f37780a) {
            case 0:
                this.f37781b.X(false);
                return;
            default:
                this.f37781b.O(true);
                return;
        }
    }
}
