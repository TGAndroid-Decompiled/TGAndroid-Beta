package org.telegram.ui.Components;
public final class vm implements Runnable {
    public final int f31732a;
    public final xn f31733b;
    public final int f31734c;

    public vm(xn xnVar, int i10, int i11) {
        this.f31732a = i11;
        this.f31733b = xnVar;
        this.f31734c = i10;
    }

    @Override
    public final void run() {
        switch (this.f31732a) {
            case 0:
                this.f31733b.e0(this.f31734c, null);
                return;
            case 1:
                this.f31733b.b0(this.f31734c);
                return;
            default:
                this.f31733b.e0(this.f31734c, null);
                return;
        }
    }
}
