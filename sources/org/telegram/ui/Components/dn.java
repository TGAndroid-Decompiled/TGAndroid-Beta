package org.telegram.ui.Components;
public final class dn implements Runnable {
    public final int f25573a;
    public final fo f25574b;
    public final int f25575c;

    public dn(fo foVar, int i10, int i11) {
        this.f25573a = i11;
        this.f25574b = foVar;
        this.f25575c = i10;
    }

    @Override
    public final void run() {
        switch (this.f25573a) {
            case 0:
                this.f25574b.h0(this.f25575c, null);
                return;
            case 1:
                this.f25574b.e0(this.f25575c);
                return;
            default:
                this.f25574b.h0(this.f25575c, null);
                return;
        }
    }
}
