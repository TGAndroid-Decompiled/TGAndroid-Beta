package org.telegram.ui.Components;
public final class i7 implements Runnable {
    public final int f27255a;
    public final l8 f27256b;
    public final p80 f27257c;

    public i7(l8 l8Var, p80 p80Var, int i10) {
        this.f27255a = i10;
        this.f27256b = l8Var;
        this.f27257c = p80Var;
    }

    @Override
    public final void run() {
        switch (this.f27255a) {
            case 0:
                l8 l8Var = this.f27256b;
                l8Var.getClass();
                this.f27257c.u();
                l8Var.u0(1);
                return;
            case 1:
                l8 l8Var2 = this.f27256b;
                l8Var2.getClass();
                this.f27257c.u();
                l8Var2.u0(2);
                return;
            case 2:
                l8 l8Var3 = this.f27256b;
                l8Var3.getClass();
                this.f27257c.u();
                l8Var3.u0(4);
                return;
            case 3:
                l8 l8Var4 = this.f27256b;
                l8Var4.getClass();
                this.f27257c.u();
                l8Var4.u0(7);
                return;
            default:
                l8.s(this.f27256b, this.f27257c);
                return;
        }
    }
}
