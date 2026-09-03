package org.telegram.ui.Components;
public final class g7 implements Runnable {
    public final int f25070a;
    public final c8 f25071b;

    public g7(c8 c8Var, int i10) {
        this.f25070a = i10;
        this.f25071b = c8Var;
    }

    @Override
    public final void run() {
        switch (this.f25070a) {
            case 0:
                c8.n(this.f25071b);
                return;
            default:
                c8.F(this.f25071b);
                return;
        }
    }
}
