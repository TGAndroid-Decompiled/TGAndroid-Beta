package org.telegram.ui.Components;
public final class dm implements Runnable {
    public final int f33106a;
    public final bn f33107b;
    public final int f33108c;

    public dm(bn bnVar, int i7, int i10) {
        this.f33106a = i10;
        this.f33107b = bnVar;
        this.f33108c = i7;
    }

    @Override
    public final void run() {
        switch (this.f33106a) {
            case 0:
                this.f33107b.j0(this.f33108c, null);
                return;
            case 1:
                this.f33107b.g0(this.f33108c);
                return;
            default:
                this.f33107b.j0(this.f33108c, null);
                return;
        }
    }
}
