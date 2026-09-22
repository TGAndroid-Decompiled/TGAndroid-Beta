package org.telegram.ui.Components;
public class bz0 {
    public int f22890a;
    public int f22891b;
    public int f22892c;

    public bz0() {
        c();
    }

    public int a(kz0 kz0Var, dz0 dz0Var, wy0 wy0Var, int i10, boolean z10) {
        return this.f22890a - wy0Var.a(dz0Var, i10);
    }

    public void b(int i10, int i11) {
        this.f22890a = Math.max(this.f22890a, i10);
        this.f22891b = Math.max(this.f22891b, i11);
    }

    public void c() {
        this.f22890a = Integer.MIN_VALUE;
        this.f22891b = Integer.MIN_VALUE;
        this.f22892c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i10 = this.f22892c;
            wy0 wy0Var = kz0.R;
            if ((i10 & 2) != 0) {
                return 100000;
            }
        }
        return this.f22890a + this.f22891b;
    }
}
