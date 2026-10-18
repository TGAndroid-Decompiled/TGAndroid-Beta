package org.telegram.ui.Components;
public final class dn implements Runnable {
    public final int f25629a;
    public final fo f25630b;
    public final int f25631c;

    public dn(fo foVar, int i10, int i11) {
        this.f25629a = i11;
        this.f25630b = foVar;
        this.f25631c = i10;
    }

    @Override
    public final void run() {
        switch (this.f25629a) {
            case 0:
                this.f25630b.h0(this.f25631c, null);
                return;
            case 1:
                this.f25630b.e0(this.f25631c);
                return;
            default:
                this.f25630b.h0(this.f25631c, null);
                return;
        }
    }
}
