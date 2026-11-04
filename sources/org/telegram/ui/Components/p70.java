package org.telegram.ui.Components;
public final class p70 implements Runnable {
    public final int f37073a;
    public final m2.p0 f37074b;
    public final t70 f37075c;

    public p70(m2.p0 p0Var, t70 t70Var, int i3) {
        this.f37073a = i3;
        this.f37074b = p0Var;
        this.f37075c = t70Var;
    }

    @Override
    public final void run() {
        switch (this.f37073a) {
            case 0:
                this.f37074b.m(this.f37075c, false);
                return;
            default:
                this.f37074b.m(this.f37075c, false);
                return;
        }
    }
}
