package org.telegram.ui.Components;
public final class kz0 implements Runnable {
    public final int f37041a;
    public final mz0 f37042b;
    public final lz0 f37043c;

    public kz0(mz0 mz0Var, lz0 lz0Var, int i7) {
        this.f37041a = i7;
        this.f37042b = mz0Var;
        this.f37043c = lz0Var;
    }

    @Override
    public final void run() {
        switch (this.f37041a) {
            case 0:
                this.f37042b.a(this.f37043c);
                return;
            case 1:
                this.f37042b.a(this.f37043c);
                return;
            default:
                this.f37042b.a(this.f37043c);
                return;
        }
    }
}
