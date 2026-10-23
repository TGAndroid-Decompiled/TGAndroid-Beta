package org.telegram.ui.Components;
public class wz0 {
    public int f32286a;
    public int f32287b;
    public int f32288c;

    public wz0() {
        c();
    }

    public int a(f01 f01Var, yz0 yz0Var, rz0 rz0Var, int i10, boolean z10) {
        return this.f32286a - rz0Var.a(yz0Var, i10);
    }

    public void b(int i10, int i11) {
        this.f32286a = Math.max(this.f32286a, i10);
        this.f32287b = Math.max(this.f32287b, i11);
    }

    public void c() {
        this.f32286a = Integer.MIN_VALUE;
        this.f32287b = Integer.MIN_VALUE;
        this.f32288c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i10 = this.f32288c;
            rz0 rz0Var = f01.R;
            if ((i10 & 2) != 0) {
                return 100000;
            }
        }
        return this.f32286a + this.f32287b;
    }
}
