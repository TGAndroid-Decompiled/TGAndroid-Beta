package org.telegram.ui.Components;
public final class vm implements Runnable {
    public final int f31805a;
    public final xn f31806b;
    public final int f31807c;

    public vm(xn xnVar, int i10, int i11) {
        this.f31805a = i11;
        this.f31806b = xnVar;
        this.f31807c = i10;
    }

    @Override
    public final void run() {
        switch (this.f31805a) {
            case 0:
                this.f31806b.e0(this.f31807c, null);
                return;
            case 1:
                this.f31806b.b0(this.f31807c);
                return;
            default:
                this.f31806b.e0(this.f31807c, null);
                return;
        }
    }
}
