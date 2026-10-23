package org.telegram.ui.Components;
public final class dn implements Runnable {
    public final int f25673a;
    public final fo f25674b;
    public final int f25675c;

    public dn(fo foVar, int i10, int i11) {
        this.f25673a = i11;
        this.f25674b = foVar;
        this.f25675c = i10;
    }

    @Override
    public final void run() {
        switch (this.f25673a) {
            case 0:
                this.f25674b.h0(this.f25675c, null);
                return;
            case 1:
                this.f25674b.e0(this.f25675c);
                return;
            default:
                this.f25674b.h0(this.f25675c, null);
                return;
        }
    }
}
