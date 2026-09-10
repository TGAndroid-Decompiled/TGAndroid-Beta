package org.telegram.ui.Components;
public final class i90 implements Runnable {
    public final int f23957a;
    public final j90 f23958b;
    public final n90 f23959c;

    public i90(j90 j90Var, n90 n90Var, int i10) {
        this.f23957a = i10;
        this.f23958b = j90Var;
        this.f23959c = n90Var;
    }

    @Override
    public final void run() {
        switch (this.f23957a) {
            case 0:
                this.f23958b.k(this.f23959c, false);
                return;
            default:
                this.f23958b.k(this.f23959c, false);
                return;
        }
    }
}
