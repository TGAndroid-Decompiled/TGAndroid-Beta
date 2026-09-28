package org.telegram.ui.Components;
public final class um implements Runnable {
    public final int f28832a;
    public final wn f28833b;
    public final int f28834c;

    public um(wn wnVar, int i10, int i11) {
        this.f28832a = i11;
        this.f28833b = wnVar;
        this.f28834c = i10;
    }

    @Override
    public final void run() {
        switch (this.f28832a) {
            case 0:
                this.f28833b.e0(this.f28834c, null);
                return;
            case 1:
                this.f28833b.b0(this.f28834c);
                return;
            default:
                this.f28833b.e0(this.f28834c, null);
                return;
        }
    }
}
