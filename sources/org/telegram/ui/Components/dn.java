package org.telegram.ui.Components;
public final class dn implements Runnable {
    public final int f25622a;
    public final fo f25623b;
    public final int f25624c;

    public dn(fo foVar, int i10, int i11) {
        this.f25622a = i11;
        this.f25623b = foVar;
        this.f25624c = i10;
    }

    @Override
    public final void run() {
        switch (this.f25622a) {
            case 0:
                this.f25623b.h0(this.f25624c, null);
                return;
            case 1:
                this.f25623b.e0(this.f25624c);
                return;
            default:
                this.f25623b.h0(this.f25624c, null);
                return;
        }
    }
}
