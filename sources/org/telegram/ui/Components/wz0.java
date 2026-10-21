package org.telegram.ui.Components;
public class wz0 {
    public int f32282a;
    public int f32283b;
    public int f32284c;

    public wz0() {
        c();
    }

    public int a(f01 f01Var, yz0 yz0Var, rz0 rz0Var, int i10, boolean z10) {
        return this.f32282a - rz0Var.a(yz0Var, i10);
    }

    public void b(int i10, int i11) {
        this.f32282a = Math.max(this.f32282a, i10);
        this.f32283b = Math.max(this.f32283b, i11);
    }

    public void c() {
        this.f32282a = Integer.MIN_VALUE;
        this.f32283b = Integer.MIN_VALUE;
        this.f32284c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i10 = this.f32284c;
            rz0 rz0Var = f01.R;
            if ((i10 & 2) != 0) {
                return 100000;
            }
        }
        return this.f32282a + this.f32283b;
    }
}
