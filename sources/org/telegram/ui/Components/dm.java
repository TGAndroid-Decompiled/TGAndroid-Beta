package org.telegram.ui.Components;
public final class dm implements Runnable {
    public final int f33009a;
    public final bn f33010b;
    public final int f33011c;

    public dm(bn bnVar, int i7, int i10) {
        this.f33009a = i10;
        this.f33010b = bnVar;
        this.f33011c = i7;
    }

    @Override
    public final void run() {
        switch (this.f33009a) {
            case 0:
                this.f33010b.j0(this.f33011c, null);
                return;
            case 1:
                this.f33010b.g0(this.f33011c);
                return;
            default:
                this.f33010b.j0(this.f33011c, null);
                return;
        }
    }
}
