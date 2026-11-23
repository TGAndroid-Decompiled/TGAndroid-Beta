package org.telegram.ui.Components;
public final class kz0 implements Runnable {
    public final int f37042a;
    public final mz0 f37043b;
    public final lz0 f37044c;

    public kz0(mz0 mz0Var, lz0 lz0Var, int i7) {
        this.f37042a = i7;
        this.f37043b = mz0Var;
        this.f37044c = lz0Var;
    }

    @Override
    public final void run() {
        switch (this.f37042a) {
            case 0:
                this.f37043b.a(this.f37044c);
                return;
            case 1:
                this.f37043b.a(this.f37044c);
                return;
            default:
                this.f37043b.a(this.f37044c);
                return;
        }
    }
}
