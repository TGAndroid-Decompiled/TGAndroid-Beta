package org.telegram.ui.Components;
public final class jn implements Runnable {
    public final int f27744a;
    public final lo f27745b;
    public final int f27746c;

    public jn(lo loVar, int i10, int i11) {
        this.f27744a = i11;
        this.f27745b = loVar;
        this.f27746c = i10;
    }

    @Override
    public final void run() {
        switch (this.f27744a) {
            case 0:
                this.f27745b.h0(this.f27746c, null);
                return;
            case 1:
                this.f27745b.e0(this.f27746c);
                return;
            default:
                this.f27745b.h0(this.f27746c, null);
                return;
        }
    }
}
