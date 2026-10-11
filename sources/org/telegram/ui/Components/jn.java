package org.telegram.ui.Components;
public final class jn implements Runnable {
    public final int f27707a;
    public final lo f27708b;
    public final int f27709c;

    public jn(lo loVar, int i10, int i11) {
        this.f27707a = i11;
        this.f27708b = loVar;
        this.f27709c = i10;
    }

    @Override
    public final void run() {
        switch (this.f27707a) {
            case 0:
                this.f27708b.h0(this.f27709c, null);
                return;
            case 1:
                this.f27708b.e0(this.f27709c);
                return;
            default:
                this.f27708b.h0(this.f27709c, null);
                return;
        }
    }
}
