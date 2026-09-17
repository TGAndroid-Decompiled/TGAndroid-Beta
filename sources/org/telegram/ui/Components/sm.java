package org.telegram.ui.Components;
public final class sm implements Runnable {
    public final int f30402a;
    public final tn f30403b;
    public final int f30404c;

    public sm(tn tnVar, int i10, int i11) {
        this.f30402a = i11;
        this.f30403b = tnVar;
        this.f30404c = i10;
    }

    @Override
    public final void run() {
        switch (this.f30402a) {
            case 0:
                this.f30403b.e0(this.f30404c, null);
                return;
            case 1:
                this.f30403b.b0(this.f30404c);
                return;
            default:
                this.f30403b.e0(this.f30404c, null);
                return;
        }
    }
}
