package org.telegram.ui.Components;
public final class dm implements Runnable {
    public final int f33038a;
    public final bn f33039b;
    public final int f33040c;

    public dm(bn bnVar, int i7, int i10) {
        this.f33038a = i10;
        this.f33039b = bnVar;
        this.f33040c = i7;
    }

    @Override
    public final void run() {
        switch (this.f33038a) {
            case 0:
                this.f33039b.j0(this.f33040c, null);
                return;
            case 1:
                this.f33039b.g0(this.f33040c);
                return;
            default:
                this.f33039b.j0(this.f33040c, null);
                return;
        }
    }
}
