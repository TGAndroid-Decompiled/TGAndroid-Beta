package org.telegram.ui.Components;
public final class d21 implements Runnable {
    public final int f25199a;
    public final g21 f25200b;
    public final f21 f25201c;

    public d21(g21 g21Var, f21 f21Var, int i10) {
        this.f25199a = i10;
        this.f25200b = g21Var;
        this.f25201c = f21Var;
    }

    @Override
    public final void run() {
        switch (this.f25199a) {
            case 0:
                this.f25200b.b(this.f25201c);
                return;
            case 1:
                this.f25200b.b(this.f25201c);
                return;
            default:
                this.f25200b.b(this.f25201c);
                return;
        }
    }
}
