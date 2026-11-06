package org.telegram.ui.Components;
public class cx0 {
    public int f32690a;
    public int f32691b;
    public int f32692c;

    public cx0() {
        c();
    }

    public int a(lx0 lx0Var, ex0 ex0Var, xw0 xw0Var, int i7, boolean z9) {
        return this.f32690a - xw0Var.a(ex0Var, i7);
    }

    public void b(int i7, int i10) {
        this.f32690a = Math.max(this.f32690a, i7);
        this.f32691b = Math.max(this.f32691b, i10);
    }

    public void c() {
        this.f32690a = Integer.MIN_VALUE;
        this.f32691b = Integer.MIN_VALUE;
        this.f32692c = 2;
    }

    public int d(boolean z9) {
        if (!z9) {
            int i7 = this.f32692c;
            xw0 xw0Var = lx0.R;
            if ((i7 & 2) != 0) {
                return 100000;
            }
        }
        return this.f32690a + this.f32691b;
    }
}
