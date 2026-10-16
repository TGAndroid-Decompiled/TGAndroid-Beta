package org.telegram.ui.Components;
public final class gn implements Runnable {
    public final int f25053a;
    public final io f25054b;
    public final int f25055c;

    public gn(io ioVar, int i10, int i11) {
        this.f25053a = i11;
        this.f25054b = ioVar;
        this.f25055c = i10;
    }

    @Override
    public final void run() {
        switch (this.f25053a) {
            case 0:
                this.f25054b.h0(this.f25055c, null);
                return;
            case 1:
                this.f25054b.e0(this.f25055c);
                return;
            default:
                this.f25054b.h0(this.f25055c, null);
                return;
        }
    }
}
