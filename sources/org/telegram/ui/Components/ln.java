package org.telegram.ui.Components;
public final class ln implements Runnable {
    public final int f28230a;
    public final no f28231b;
    public final int f28232c;

    public ln(no noVar, int i10, int i11) {
        this.f28230a = i11;
        this.f28231b = noVar;
        this.f28232c = i10;
    }

    @Override
    public final void run() {
        switch (this.f28230a) {
            case 0:
                this.f28231b.h0(this.f28232c, null);
                return;
            case 1:
                this.f28231b.e0(this.f28232c);
                return;
            default:
                this.f28231b.h0(this.f28232c, null);
                return;
        }
    }
}
