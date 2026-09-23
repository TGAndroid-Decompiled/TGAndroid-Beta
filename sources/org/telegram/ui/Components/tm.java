package org.telegram.ui.Components;
public final class tm implements Runnable {
    public final int f28267a;
    public final vn f28268b;
    public final int f28269c;

    public tm(vn vnVar, int i10, int i11) {
        this.f28267a = i11;
        this.f28268b = vnVar;
        this.f28269c = i10;
    }

    @Override
    public final void run() {
        switch (this.f28267a) {
            case 0:
                this.f28268b.e0(this.f28269c, null);
                return;
            case 1:
                this.f28268b.b0(this.f28269c);
                return;
            default:
                this.f28268b.e0(this.f28269c, null);
                return;
        }
    }
}
