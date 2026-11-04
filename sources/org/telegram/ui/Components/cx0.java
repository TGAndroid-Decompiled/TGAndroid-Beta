package org.telegram.ui.Components;
public class cx0 {
    public int f32850a;
    public int f32851b;
    public int f32852c;

    public cx0() {
        c();
    }

    public int a(lx0 lx0Var, ex0 ex0Var, xw0 xw0Var, int i3, boolean z10) {
        return this.f32850a - xw0Var.a(ex0Var, i3);
    }

    public void b(int i3, int i10) {
        this.f32850a = Math.max(this.f32850a, i3);
        this.f32851b = Math.max(this.f32851b, i10);
    }

    public void c() {
        this.f32850a = Integer.MIN_VALUE;
        this.f32851b = Integer.MIN_VALUE;
        this.f32852c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i3 = this.f32852c;
            xw0 xw0Var = lx0.S;
            if ((i3 & 2) != 0) {
                return 100000;
            }
        }
        return this.f32850a + this.f32851b;
    }
}
