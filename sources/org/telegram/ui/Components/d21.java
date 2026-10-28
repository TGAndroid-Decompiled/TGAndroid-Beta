package org.telegram.ui.Components;
public final class d21 implements Runnable {
    public final int f27322a;
    public final f21 f27323b;
    public final e21 f27324c;

    public d21(f21 f21Var, e21 e21Var, int i10) {
        this.f27322a = i10;
        this.f27323b = f21Var;
        this.f27324c = e21Var;
    }

    @Override
    public final void run() {
        switch (this.f27322a) {
            case 0:
                this.f27323b.b(this.f27324c);
                return;
            case 1:
                this.f27323b.b(this.f27324c);
                return;
            default:
                this.f27323b.b(this.f27324c);
                return;
        }
    }
}
