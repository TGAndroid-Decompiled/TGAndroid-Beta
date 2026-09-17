package org.telegram.ui.Components;
public final class sm implements Runnable {
    public final int f30375a;
    public final tn f30376b;
    public final int f30377c;

    public sm(tn tnVar, int i10, int i11) {
        this.f30375a = i11;
        this.f30376b = tnVar;
        this.f30377c = i10;
    }

    @Override
    public final void run() {
        switch (this.f30375a) {
            case 0:
                this.f30376b.e0(this.f30377c, null);
                return;
            case 1:
                this.f30376b.b0(this.f30377c);
                return;
            default:
                this.f30376b.e0(this.f30377c, null);
                return;
        }
    }
}
