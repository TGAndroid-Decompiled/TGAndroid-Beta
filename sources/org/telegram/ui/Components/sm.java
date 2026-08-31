package org.telegram.ui.Components;
public final class sm implements Runnable {
    public final int f31088a;
    public final sn f31089b;
    public final int f31090c;

    public sm(sn snVar, int i10, int i11) {
        this.f31088a = i11;
        this.f31089b = snVar;
        this.f31090c = i10;
    }

    @Override
    public final void run() {
        switch (this.f31088a) {
            case 0:
                this.f31089b.e0(this.f31090c, null);
                return;
            case 1:
                this.f31089b.b0(this.f31090c);
                return;
            default:
                this.f31089b.e0(this.f31090c, null);
                return;
        }
    }
}
