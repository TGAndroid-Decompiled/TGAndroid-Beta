package org.telegram.ui.Components;
public final class jn implements Runnable {
    public final int f27791a;
    public final lo f27792b;
    public final int f27793c;

    public jn(lo loVar, int i10, int i11) {
        this.f27791a = i11;
        this.f27792b = loVar;
        this.f27793c = i10;
    }

    @Override
    public final void run() {
        switch (this.f27791a) {
            case 0:
                this.f27792b.h0(this.f27793c, null);
                return;
            case 1:
                this.f27792b.e0(this.f27793c);
                return;
            default:
                this.f27792b.h0(this.f27793c, null);
                return;
        }
    }
}
