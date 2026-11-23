package org.telegram.ui.Components;
public final class g80 implements Runnable {
    public final int f35354a;
    public final n2.p0 f35355b;
    public final k80 f35356c;

    public g80(n2.p0 p0Var, k80 k80Var, int i7) {
        this.f35354a = i7;
        this.f35355b = p0Var;
        this.f35356c = k80Var;
    }

    @Override
    public final void run() {
        switch (this.f35354a) {
            case 0:
                this.f35355b.m(this.f35356c, false);
                return;
            default:
                this.f35355b.m(this.f35356c, false);
                return;
        }
    }
}
