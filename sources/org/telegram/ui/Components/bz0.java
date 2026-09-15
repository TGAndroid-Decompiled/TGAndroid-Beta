package org.telegram.ui.Components;
public class bz0 {
    public int f22892a;
    public int f22893b;
    public int f22894c;

    public bz0() {
        c();
    }

    public int a(kz0 kz0Var, dz0 dz0Var, wy0 wy0Var, int i10, boolean z10) {
        return this.f22892a - wy0Var.a(dz0Var, i10);
    }

    public void b(int i10, int i11) {
        this.f22892a = Math.max(this.f22892a, i10);
        this.f22893b = Math.max(this.f22893b, i11);
    }

    public void c() {
        this.f22892a = Integer.MIN_VALUE;
        this.f22893b = Integer.MIN_VALUE;
        this.f22894c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i10 = this.f22894c;
            wy0 wy0Var = kz0.R;
            if ((i10 & 2) != 0) {
                return 100000;
            }
        }
        return this.f22892a + this.f22893b;
    }
}
