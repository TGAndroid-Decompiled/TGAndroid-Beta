package org.telegram.ui.Components;
public class gx0 {
    public int f35080a;
    public int f35081b;
    public int f35082c;

    public gx0() {
        c();
    }

    public int a(px0 px0Var, ix0 ix0Var, bx0 bx0Var, int i7, boolean z10) {
        return this.f35080a - bx0Var.a(ix0Var, i7);
    }

    public void b(int i7, int i10) {
        this.f35080a = Math.max(this.f35080a, i7);
        this.f35081b = Math.max(this.f35081b, i10);
    }

    public void c() {
        this.f35080a = Integer.MIN_VALUE;
        this.f35081b = Integer.MIN_VALUE;
        this.f35082c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i7 = this.f35082c;
            bx0 bx0Var = px0.T;
            if ((i7 & 2) != 0) {
                return 100000;
            }
        }
        return this.f35080a + this.f35081b;
    }
}
