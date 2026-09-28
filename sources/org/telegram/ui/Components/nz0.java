package org.telegram.ui.Components;
public class nz0 {
    public int f26884a;
    public int f26885b;
    public int f26886c;

    public nz0() {
        c();
    }

    public int a(wz0 wz0Var, pz0 pz0Var, iz0 iz0Var, int i10, boolean z10) {
        return this.f26884a - iz0Var.a(pz0Var, i10);
    }

    public void b(int i10, int i11) {
        this.f26884a = Math.max(this.f26884a, i10);
        this.f26885b = Math.max(this.f26885b, i11);
    }

    public void c() {
        this.f26884a = Integer.MIN_VALUE;
        this.f26885b = Integer.MIN_VALUE;
        this.f26886c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i10 = this.f26886c;
            iz0 iz0Var = wz0.R;
            if ((i10 & 2) != 0) {
                return 100000;
            }
        }
        return this.f26884a + this.f26885b;
    }
}
