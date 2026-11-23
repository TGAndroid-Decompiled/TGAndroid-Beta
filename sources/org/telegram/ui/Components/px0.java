package org.telegram.ui.Components;
public class px0 {
    public int f38673a;
    public int f38674b;
    public int f38675c;

    public px0() {
        c();
    }

    public int a(yx0 yx0Var, rx0 rx0Var, kx0 kx0Var, int i7, boolean z10) {
        return this.f38673a - kx0Var.a(rx0Var, i7);
    }

    public void b(int i7, int i10) {
        this.f38673a = Math.max(this.f38673a, i7);
        this.f38674b = Math.max(this.f38674b, i10);
    }

    public void c() {
        this.f38673a = Integer.MIN_VALUE;
        this.f38674b = Integer.MIN_VALUE;
        this.f38675c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i7 = this.f38675c;
            kx0 kx0Var = yx0.T;
            if ((i7 & 2) != 0) {
                return 100000;
            }
        }
        return this.f38673a + this.f38674b;
    }
}
