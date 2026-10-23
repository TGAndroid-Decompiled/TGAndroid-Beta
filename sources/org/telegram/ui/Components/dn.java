package org.telegram.ui.Components;
public final class dn implements Runnable {
    public final int f25574a;
    public final fo f25575b;
    public final int f25576c;

    public dn(fo foVar, int i10, int i11) {
        this.f25574a = i11;
        this.f25575b = foVar;
        this.f25576c = i10;
    }

    @Override
    public final void run() {
        switch (this.f25574a) {
            case 0:
                this.f25575b.h0(this.f25576c, null);
                return;
            case 1:
                this.f25575b.e0(this.f25576c);
                return;
            default:
                this.f25575b.h0(this.f25576c, null);
                return;
        }
    }
}
