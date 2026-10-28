package org.telegram.ui.Components;
public final class en implements Runnable {
    public final int f27890a;
    public final go f27891b;
    public final int f27892c;

    public en(go goVar, int i10, int i11) {
        this.f27890a = i11;
        this.f27891b = goVar;
        this.f27892c = i10;
    }

    @Override
    public final void run() {
        switch (this.f27890a) {
            case 0:
                this.f27891b.h0(this.f27892c, null);
                return;
            case 1:
                this.f27891b.e0(this.f27892c);
                return;
            default:
                this.f27891b.h0(this.f27892c, null);
                return;
        }
    }
}
