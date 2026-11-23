package org.telegram.ui.Components;
public final class um implements Runnable {
    public final int f40493a;
    public final tn f40494b;
    public final int f40495c;

    public um(tn tnVar, int i7, int i10) {
        this.f40493a = i10;
        this.f40494b = tnVar;
        this.f40495c = i7;
    }

    @Override
    public final void run() {
        switch (this.f40493a) {
            case 0:
                this.f40494b.j0(this.f40495c, null);
                return;
            case 1:
                this.f40494b.g0(this.f40495c);
                return;
            default:
                this.f40494b.j0(this.f40495c, null);
                return;
        }
    }
}
