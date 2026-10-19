package org.telegram.ui.Components;
public final class dn implements Runnable {
    public final int f25595a;
    public final fo f25596b;
    public final int f25597c;

    public dn(fo foVar, int i10, int i11) {
        this.f25595a = i11;
        this.f25596b = foVar;
        this.f25597c = i10;
    }

    @Override
    public final void run() {
        switch (this.f25595a) {
            case 0:
                this.f25596b.h0(this.f25597c, null);
                return;
            case 1:
                this.f25596b.e0(this.f25597c);
                return;
            default:
                this.f25596b.h0(this.f25597c, null);
                return;
        }
    }
}
