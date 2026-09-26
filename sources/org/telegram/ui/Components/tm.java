package org.telegram.ui.Components;
public final class tm implements Runnable {
    public final int f28564a;
    public final vn f28565b;
    public final int f28566c;

    public tm(vn vnVar, int i10, int i11) {
        this.f28564a = i11;
        this.f28565b = vnVar;
        this.f28566c = i10;
    }

    @Override
    public final void run() {
        switch (this.f28564a) {
            case 0:
                this.f28565b.e0(this.f28566c, null);
                return;
            case 1:
                this.f28565b.b0(this.f28566c);
                return;
            default:
                this.f28565b.e0(this.f28566c, null);
                return;
        }
    }
}
