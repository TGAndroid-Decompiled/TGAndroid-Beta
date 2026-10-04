package org.telegram.ui.Components;
public final class vm implements Runnable {
    public final int f31731a;
    public final xn f31732b;
    public final int f31733c;

    public vm(xn xnVar, int i10, int i11) {
        this.f31731a = i11;
        this.f31732b = xnVar;
        this.f31733c = i10;
    }

    @Override
    public final void run() {
        switch (this.f31731a) {
            case 0:
                this.f31732b.e0(this.f31733c, null);
                return;
            case 1:
                this.f31732b.b0(this.f31733c);
                return;
            default:
                this.f31732b.e0(this.f31733c, null);
                return;
        }
    }
}
