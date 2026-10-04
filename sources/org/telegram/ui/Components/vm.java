package org.telegram.ui.Components;
public final class vm implements Runnable {
    public final int f31738a;
    public final xn f31739b;
    public final int f31740c;

    public vm(xn xnVar, int i10, int i11) {
        this.f31738a = i11;
        this.f31739b = xnVar;
        this.f31740c = i10;
    }

    @Override
    public final void run() {
        switch (this.f31738a) {
            case 0:
                this.f31739b.e0(this.f31740c, null);
                return;
            case 1:
                this.f31739b.b0(this.f31740c);
                return;
            default:
                this.f31739b.e0(this.f31740c, null);
                return;
        }
    }
}
