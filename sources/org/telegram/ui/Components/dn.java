package org.telegram.ui.Components;
public final class dn implements Runnable {
    public final int f25593a;
    public final fo f25594b;
    public final int f25595c;

    public dn(fo foVar, int i10, int i11) {
        this.f25593a = i11;
        this.f25594b = foVar;
        this.f25595c = i10;
    }

    @Override
    public final void run() {
        switch (this.f25593a) {
            case 0:
                this.f25594b.h0(this.f25595c, null);
                return;
            case 1:
                this.f25594b.e0(this.f25595c);
                return;
            default:
                this.f25594b.h0(this.f25595c, null);
                return;
        }
    }
}
