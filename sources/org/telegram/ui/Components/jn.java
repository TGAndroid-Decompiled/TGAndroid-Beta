package org.telegram.ui.Components;
public final class jn implements Runnable {
    public final int f27732a;
    public final lo f27733b;
    public final int f27734c;

    public jn(lo loVar, int i10, int i11) {
        this.f27732a = i11;
        this.f27733b = loVar;
        this.f27734c = i10;
    }

    @Override
    public final void run() {
        switch (this.f27732a) {
            case 0:
                this.f27733b.h0(this.f27734c, null);
                return;
            case 1:
                this.f27733b.e0(this.f27734c);
                return;
            default:
                this.f27733b.h0(this.f27734c, null);
                return;
        }
    }
}
