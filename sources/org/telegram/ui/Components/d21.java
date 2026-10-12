package org.telegram.ui.Components;
public final class d21 implements Runnable {
    public final int f25207a;
    public final g21 f25208b;
    public final f21 f25209c;

    public d21(g21 g21Var, f21 f21Var, int i10) {
        this.f25207a = i10;
        this.f25208b = g21Var;
        this.f25209c = f21Var;
    }

    @Override
    public final void run() {
        switch (this.f25207a) {
            case 0:
                this.f25208b.b(this.f25209c);
                return;
            case 1:
                this.f25208b.b(this.f25209c);
                return;
            default:
                this.f25208b.b(this.f25209c);
                return;
        }
    }
}
