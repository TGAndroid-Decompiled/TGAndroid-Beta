package org.telegram.ui.Components;
public final class ln implements Runnable {
    public final int f28241a;
    public final no f28242b;
    public final int f28243c;

    public ln(no noVar, int i10, int i11) {
        this.f28241a = i11;
        this.f28242b = noVar;
        this.f28243c = i10;
    }

    @Override
    public final void run() {
        switch (this.f28241a) {
            case 0:
                this.f28242b.h0(this.f28243c, null);
                return;
            case 1:
                this.f28242b.e0(this.f28243c);
                return;
            default:
                this.f28242b.h0(this.f28243c, null);
                return;
        }
    }
}
