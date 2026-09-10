package org.telegram.ui.Components;
public final class zm implements Runnable {
    public final int f29725a;
    public final zn f29726b;
    public final int f29727c;

    public zm(zn znVar, int i10, int i11) {
        this.f29725a = i11;
        this.f29726b = znVar;
        this.f29727c = i10;
    }

    @Override
    public final void run() {
        switch (this.f29725a) {
            case 0:
                this.f29726b.e0(this.f29727c, null);
                return;
            case 1:
                this.f29726b.b0(this.f29727c);
                return;
            default:
                this.f29726b.e0(this.f29727c, null);
                return;
        }
    }
}
