package org.telegram.ui.Components.voip;
public final class c0 implements Runnable {
    public final int f40532a;
    public final e0 f40533b;

    public c0(e0 e0Var, int i7) {
        this.f40532a = i7;
        this.f40533b = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f40532a) {
            case 0:
                e0.a(this.f40533b);
                return;
            default:
                e0.a(this.f40533b);
                return;
        }
    }
}
