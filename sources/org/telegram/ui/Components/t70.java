package org.telegram.ui.Components;
public final class t70 implements Runnable {
    public final int f38279a;
    public final n2.n0 f38280b;
    public final x70 f38281c;

    public t70(n2.n0 n0Var, x70 x70Var, int i7) {
        this.f38279a = i7;
        this.f38280b = n0Var;
        this.f38281c = x70Var;
    }

    @Override
    public final void run() {
        switch (this.f38279a) {
            case 0:
                this.f38280b.m(this.f38281c, false);
                return;
            default:
                this.f38280b.m(this.f38281c, false);
                return;
        }
    }
}
