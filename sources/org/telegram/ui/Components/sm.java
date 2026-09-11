package org.telegram.ui.Components;
public final class sm implements Runnable {
    public final int f30374a;
    public final tn f30375b;
    public final int f30376c;

    public sm(tn tnVar, int i10, int i11) {
        this.f30374a = i11;
        this.f30375b = tnVar;
        this.f30376c = i10;
    }

    @Override
    public final void run() {
        switch (this.f30374a) {
            case 0:
                this.f30375b.e0(this.f30376c, null);
                return;
            case 1:
                this.f30375b.b0(this.f30376c);
                return;
            default:
                this.f30375b.e0(this.f30376c, null);
                return;
        }
    }
}
