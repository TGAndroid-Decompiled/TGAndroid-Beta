package org.telegram.ui.Components;
public final class kz0 implements Runnable {
    public final int f36998a;
    public final mz0 f36999b;
    public final lz0 f37000c;

    public kz0(mz0 mz0Var, lz0 lz0Var, int i7) {
        this.f36998a = i7;
        this.f36999b = mz0Var;
        this.f37000c = lz0Var;
    }

    @Override
    public final void run() {
        switch (this.f36998a) {
            case 0:
                this.f36999b.a(this.f37000c);
                return;
            case 1:
                this.f36999b.a(this.f37000c);
                return;
            default:
                this.f36999b.a(this.f37000c);
                return;
        }
    }
}
