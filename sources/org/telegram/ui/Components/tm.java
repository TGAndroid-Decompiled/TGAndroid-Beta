package org.telegram.ui.Components;
public final class tm implements Runnable {
    public final int f28558a;
    public final vn f28559b;
    public final int f28560c;

    public tm(vn vnVar, int i10, int i11) {
        this.f28558a = i11;
        this.f28559b = vnVar;
        this.f28560c = i10;
    }

    @Override
    public final void run() {
        switch (this.f28558a) {
            case 0:
                this.f28559b.e0(this.f28560c, null);
                return;
            case 1:
                this.f28559b.b0(this.f28560c);
                return;
            default:
                this.f28559b.e0(this.f28560c, null);
                return;
        }
    }
}
