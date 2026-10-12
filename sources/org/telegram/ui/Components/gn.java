package org.telegram.ui.Components;
public final class gn implements Runnable {
    public final int f25365a;
    public final io f25366b;
    public final int f25367c;

    public gn(io ioVar, int i10, int i11) {
        this.f25365a = i11;
        this.f25366b = ioVar;
        this.f25367c = i10;
    }

    @Override
    public final void run() {
        switch (this.f25365a) {
            case 0:
                this.f25366b.h0(this.f25367c, null);
                return;
            case 1:
                this.f25366b.e0(this.f25367c);
                return;
            default:
                this.f25366b.h0(this.f25367c, null);
                return;
        }
    }
}
