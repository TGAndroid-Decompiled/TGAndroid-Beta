package org.telegram.ui.Components;
public class xz0 {
    public int f33123a;
    public int f33124b;
    public int f33125c;

    public xz0() {
        c();
    }

    public int a(g01 g01Var, zz0 zz0Var, sz0 sz0Var, int i10, boolean z10) {
        return this.f33123a - sz0Var.a(zz0Var, i10);
    }

    public void b(int i10, int i11) {
        this.f33123a = Math.max(this.f33123a, i10);
        this.f33124b = Math.max(this.f33124b, i11);
    }

    public void c() {
        this.f33123a = Integer.MIN_VALUE;
        this.f33124b = Integer.MIN_VALUE;
        this.f33125c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i10 = this.f33125c;
            sz0 sz0Var = g01.R;
            if ((i10 & 2) != 0) {
                return 100000;
            }
        }
        return this.f33123a + this.f33124b;
    }
}
