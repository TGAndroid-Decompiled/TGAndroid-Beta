package org.telegram.ui.Components;
public final class um implements Runnable {
    public final int f40501a;
    public final tn f40502b;
    public final int f40503c;

    public um(tn tnVar, int i7, int i10) {
        this.f40501a = i10;
        this.f40502b = tnVar;
        this.f40503c = i7;
    }

    @Override
    public final void run() {
        switch (this.f40501a) {
            case 0:
                this.f40502b.j0(this.f40503c, null);
                return;
            case 1:
                this.f40502b.g0(this.f40503c);
                return;
            default:
                this.f40502b.j0(this.f40503c, null);
                return;
        }
    }
}
