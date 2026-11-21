package org.telegram.ui.Components.voip;
public final class b0 implements Runnable {
    public final int f40913a;
    public final d0 f40914b;

    public b0(d0 d0Var, int i7) {
        this.f40913a = i7;
        this.f40914b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f40913a) {
            case 0:
                d0.a(this.f40914b);
                return;
            default:
                d0.a(this.f40914b);
                return;
        }
    }
}
