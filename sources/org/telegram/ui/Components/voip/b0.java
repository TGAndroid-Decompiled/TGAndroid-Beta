package org.telegram.ui.Components.voip;
public final class b0 implements Runnable {
    public final int f40914a;
    public final d0 f40915b;

    public b0(d0 d0Var, int i7) {
        this.f40914a = i7;
        this.f40915b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f40914a) {
            case 0:
                d0.a(this.f40915b);
                return;
            default:
                d0.a(this.f40915b);
                return;
        }
    }
}
