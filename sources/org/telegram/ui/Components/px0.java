package org.telegram.ui.Components;
public class px0 {
    public int f38675a;
    public int f38676b;
    public int f38677c;

    public px0() {
        c();
    }

    public int a(yx0 yx0Var, rx0 rx0Var, kx0 kx0Var, int i7, boolean z10) {
        return this.f38675a - kx0Var.a(rx0Var, i7);
    }

    public void b(int i7, int i10) {
        this.f38675a = Math.max(this.f38675a, i7);
        this.f38676b = Math.max(this.f38676b, i10);
    }

    public void c() {
        this.f38675a = Integer.MIN_VALUE;
        this.f38676b = Integer.MIN_VALUE;
        this.f38677c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i7 = this.f38677c;
            kx0 kx0Var = yx0.T;
            if ((i7 & 2) != 0) {
                return 100000;
            }
        }
        return this.f38675a + this.f38676b;
    }
}
