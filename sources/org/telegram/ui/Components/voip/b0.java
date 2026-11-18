package org.telegram.ui.Components.voip;
public final class b0 implements Runnable {
    public final int f40778a;
    public final d0 f40779b;

    public b0(d0 d0Var, int i7) {
        this.f40778a = i7;
        this.f40779b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f40778a) {
            case 0:
                d0.a(this.f40779b);
                return;
            default:
                d0.a(this.f40779b);
                return;
        }
    }
}
