package org.telegram.ui.Components;
public class cx0 {
    public int f32694a;
    public int f32695b;
    public int f32696c;

    public cx0() {
        c();
    }

    public int a(lx0 lx0Var, ex0 ex0Var, xw0 xw0Var, int i7, boolean z9) {
        return this.f32694a - xw0Var.a(ex0Var, i7);
    }

    public void b(int i7, int i10) {
        this.f32694a = Math.max(this.f32694a, i7);
        this.f32695b = Math.max(this.f32695b, i10);
    }

    public void c() {
        this.f32694a = Integer.MIN_VALUE;
        this.f32695b = Integer.MIN_VALUE;
        this.f32696c = 2;
    }

    public int d(boolean z9) {
        if (!z9) {
            int i7 = this.f32696c;
            xw0 xw0Var = lx0.R;
            if ((i7 & 2) != 0) {
                return 100000;
            }
        }
        return this.f32694a + this.f32695b;
    }
}
