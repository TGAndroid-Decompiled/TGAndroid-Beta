package org.telegram.ui.Components;
public class mz0 {
    public int f26512a;
    public int f26513b;
    public int f26514c;

    public mz0() {
        c();
    }

    public int a(vz0 vz0Var, oz0 oz0Var, hz0 hz0Var, int i10, boolean z10) {
        return this.f26512a - hz0Var.a(oz0Var, i10);
    }

    public void b(int i10, int i11) {
        this.f26512a = Math.max(this.f26512a, i10);
        this.f26513b = Math.max(this.f26513b, i11);
    }

    public void c() {
        this.f26512a = Integer.MIN_VALUE;
        this.f26513b = Integer.MIN_VALUE;
        this.f26514c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i10 = this.f26514c;
            hz0 hz0Var = vz0.R;
            if ((i10 & 2) != 0) {
                return 100000;
            }
        }
        return this.f26512a + this.f26513b;
    }
}
