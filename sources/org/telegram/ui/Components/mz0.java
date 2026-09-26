package org.telegram.ui.Components;
public class mz0 {
    public int f26624a;
    public int f26625b;
    public int f26626c;

    public mz0() {
        c();
    }

    public int a(vz0 vz0Var, oz0 oz0Var, hz0 hz0Var, int i10, boolean z10) {
        return this.f26624a - hz0Var.a(oz0Var, i10);
    }

    public void b(int i10, int i11) {
        this.f26624a = Math.max(this.f26624a, i10);
        this.f26625b = Math.max(this.f26625b, i11);
    }

    public void c() {
        this.f26624a = Integer.MIN_VALUE;
        this.f26625b = Integer.MIN_VALUE;
        this.f26626c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i10 = this.f26626c;
            hz0 hz0Var = vz0.R;
            if ((i10 & 2) != 0) {
                return 100000;
            }
        }
        return this.f26624a + this.f26625b;
    }
}
