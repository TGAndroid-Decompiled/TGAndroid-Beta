package org.telegram.ui.Components;
public final class um implements Runnable {
    public final int f40494a;
    public final tn f40495b;
    public final int f40496c;

    public um(tn tnVar, int i7, int i10) {
        this.f40494a = i10;
        this.f40495b = tnVar;
        this.f40496c = i7;
    }

    @Override
    public final void run() {
        switch (this.f40494a) {
            case 0:
                this.f40495b.j0(this.f40496c, null);
                return;
            case 1:
                this.f40495b.g0(this.f40496c);
                return;
            default:
                this.f40495b.j0(this.f40496c, null);
                return;
        }
    }
}
