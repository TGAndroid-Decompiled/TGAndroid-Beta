package org.telegram.ui.Components;
public final class dn implements Runnable {
    public final int f25570a;
    public final fo f25571b;
    public final int f25572c;

    public dn(fo foVar, int i10, int i11) {
        this.f25570a = i11;
        this.f25571b = foVar;
        this.f25572c = i10;
    }

    @Override
    public final void run() {
        switch (this.f25570a) {
            case 0:
                this.f25571b.h0(this.f25572c, null);
                return;
            case 1:
                this.f25571b.e0(this.f25572c);
                return;
            default:
                this.f25571b.h0(this.f25572c, null);
                return;
        }
    }
}
