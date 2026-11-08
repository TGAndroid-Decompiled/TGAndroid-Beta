package org.telegram.ui.Components;
public final class dm implements Runnable {
    public final int f33046a;
    public final bn f33047b;
    public final int f33048c;

    public dm(bn bnVar, int i7, int i10) {
        this.f33046a = i10;
        this.f33047b = bnVar;
        this.f33048c = i7;
    }

    @Override
    public final void run() {
        switch (this.f33046a) {
            case 0:
                this.f33047b.j0(this.f33048c, null);
                return;
            case 1:
                this.f33047b.g0(this.f33048c);
                return;
            default:
                this.f33047b.j0(this.f33048c, null);
                return;
        }
    }
}
