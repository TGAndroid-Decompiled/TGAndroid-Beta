package org.telegram.ui.Components;
public class wz0 {
    public int f32285a;
    public int f32286b;
    public int f32287c;

    public wz0() {
        c();
    }

    public int a(f01 f01Var, yz0 yz0Var, rz0 rz0Var, int i10, boolean z10) {
        return this.f32285a - rz0Var.a(yz0Var, i10);
    }

    public void b(int i10, int i11) {
        this.f32285a = Math.max(this.f32285a, i10);
        this.f32286b = Math.max(this.f32286b, i11);
    }

    public void c() {
        this.f32285a = Integer.MIN_VALUE;
        this.f32286b = Integer.MIN_VALUE;
        this.f32287c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i10 = this.f32287c;
            rz0 rz0Var = f01.R;
            if ((i10 & 2) != 0) {
                return 100000;
            }
        }
        return this.f32285a + this.f32286b;
    }
}
