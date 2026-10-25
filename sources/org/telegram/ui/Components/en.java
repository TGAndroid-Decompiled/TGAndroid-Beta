package org.telegram.ui.Components;
public final class en implements Runnable {
    public final int f27900a;
    public final go f27901b;
    public final int f27902c;

    public en(go goVar, int i10, int i11) {
        this.f27900a = i11;
        this.f27901b = goVar;
        this.f27902c = i10;
    }

    @Override
    public final void run() {
        switch (this.f27900a) {
            case 0:
                this.f27901b.h0(this.f27902c, null);
                return;
            case 1:
                this.f27901b.e0(this.f27902c);
                return;
            default:
                this.f27901b.h0(this.f27902c, null);
                return;
        }
    }
}
