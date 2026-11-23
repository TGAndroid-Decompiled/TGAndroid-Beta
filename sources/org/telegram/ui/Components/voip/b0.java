package org.telegram.ui.Components.voip;
public final class b0 implements Runnable {
    public final int f40915a;
    public final d0 f40916b;

    public b0(d0 d0Var, int i7) {
        this.f40915a = i7;
        this.f40916b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f40915a) {
            case 0:
                d0.a(this.f40916b);
                return;
            default:
                d0.a(this.f40916b);
                return;
        }
    }
}
