package org.telegram.ui.Components;
public final class en implements Runnable {
    public final int f27902a;
    public final go f27903b;
    public final int f27904c;

    public en(go goVar, int i10, int i11) {
        this.f27902a = i11;
        this.f27903b = goVar;
        this.f27904c = i10;
    }

    @Override
    public final void run() {
        switch (this.f27902a) {
            case 0:
                this.f27903b.h0(this.f27904c, null);
                return;
            case 1:
                this.f27903b.e0(this.f27904c);
                return;
            default:
                this.f27903b.h0(this.f27904c, null);
                return;
        }
    }
}
