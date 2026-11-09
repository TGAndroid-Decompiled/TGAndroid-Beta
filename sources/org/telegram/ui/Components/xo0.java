package org.telegram.ui.Components;
public final class xo0 implements Runnable {
    public final int f40441a;
    public final zs0 f40442b;
    public final int f40443c;

    public xo0(zs0 zs0Var, int i7, int i10) {
        this.f40441a = i10;
        this.f40442b = zs0Var;
        this.f40443c = i7;
    }

    @Override
    public final void run() {
        switch (this.f40441a) {
            case 0:
                this.f40442b.s1(this.f40443c);
                return;
            case 1:
                zs0 zs0Var = this.f40442b;
                zs0Var.a1(zs0Var.f41127x1, zs0Var.l1, this.f40443c);
                return;
            case 2:
                this.f40442b.r1(this.f40443c, false);
                return;
            case 3:
                this.f40442b.s1(this.f40443c);
                return;
            default:
                zs0 zs0Var2 = this.f40442b;
                zs0Var2.b1(zs0Var2.f41127x1, zs0Var2.l1, this.f40443c);
                return;
        }
    }
}
