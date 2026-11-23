package org.telegram.ui.Components;
public class px0 {
    public int f38627a;
    public int f38628b;
    public int f38629c;

    public px0() {
        c();
    }

    public int a(yx0 yx0Var, rx0 rx0Var, kx0 kx0Var, int i7, boolean z10) {
        return this.f38627a - kx0Var.a(rx0Var, i7);
    }

    public void b(int i7, int i10) {
        this.f38627a = Math.max(this.f38627a, i7);
        this.f38628b = Math.max(this.f38628b, i10);
    }

    public void c() {
        this.f38627a = Integer.MIN_VALUE;
        this.f38628b = Integer.MIN_VALUE;
        this.f38629c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i7 = this.f38629c;
            kx0 kx0Var = yx0.T;
            if ((i7 & 2) != 0) {
                return 100000;
            }
        }
        return this.f38627a + this.f38628b;
    }
}
