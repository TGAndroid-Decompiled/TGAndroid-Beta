package org.telegram.ui.Components;
public final class tm implements Runnable {
    public final int f28565a;
    public final vn f28566b;
    public final int f28567c;

    public tm(vn vnVar, int i10, int i11) {
        this.f28565a = i11;
        this.f28566b = vnVar;
        this.f28567c = i10;
    }

    @Override
    public final void run() {
        switch (this.f28565a) {
            case 0:
                this.f28566b.e0(this.f28567c, null);
                return;
            case 1:
                this.f28566b.b0(this.f28567c);
                return;
            default:
                this.f28566b.e0(this.f28567c, null);
                return;
        }
    }
}
