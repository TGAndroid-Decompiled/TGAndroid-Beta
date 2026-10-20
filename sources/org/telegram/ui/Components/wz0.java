package org.telegram.ui.Components;
public class wz0 {
    public int f32281a;
    public int f32282b;
    public int f32283c;

    public wz0() {
        c();
    }

    public int a(f01 f01Var, yz0 yz0Var, rz0 rz0Var, int i10, boolean z10) {
        return this.f32281a - rz0Var.a(yz0Var, i10);
    }

    public void b(int i10, int i11) {
        this.f32281a = Math.max(this.f32281a, i10);
        this.f32282b = Math.max(this.f32282b, i11);
    }

    public void c() {
        this.f32281a = Integer.MIN_VALUE;
        this.f32282b = Integer.MIN_VALUE;
        this.f32283c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i10 = this.f32283c;
            rz0 rz0Var = f01.R;
            if ((i10 & 2) != 0) {
                return 100000;
            }
        }
        return this.f32281a + this.f32282b;
    }
}
