package org.telegram.ui.Components;
public final class sm implements Runnable {
    public final int f30401a;
    public final tn f30402b;
    public final int f30403c;

    public sm(tn tnVar, int i10, int i11) {
        this.f30401a = i11;
        this.f30402b = tnVar;
        this.f30403c = i10;
    }

    @Override
    public final void run() {
        switch (this.f30401a) {
            case 0:
                this.f30402b.e0(this.f30403c, null);
                return;
            case 1:
                this.f30402b.b0(this.f30403c);
                return;
            default:
                this.f30402b.e0(this.f30403c, null);
                return;
        }
    }
}
