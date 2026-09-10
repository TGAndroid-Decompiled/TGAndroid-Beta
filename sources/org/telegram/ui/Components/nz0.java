package org.telegram.ui.Components;
public class nz0 {
    public int f25621a;
    public int f25622b;
    public int f25623c;

    public nz0() {
        c();
    }

    public int a(wz0 wz0Var, pz0 pz0Var, iz0 iz0Var, int i10, boolean z10) {
        return this.f25621a - iz0Var.a(pz0Var, i10);
    }

    public void b(int i10, int i11) {
        this.f25621a = Math.max(this.f25621a, i10);
        this.f25622b = Math.max(this.f25622b, i11);
    }

    public void c() {
        this.f25621a = Integer.MIN_VALUE;
        this.f25622b = Integer.MIN_VALUE;
        this.f25623c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i10 = this.f25623c;
            iz0 iz0Var = wz0.R;
            if ((i10 & 2) != 0) {
                return 100000;
            }
        }
        return this.f25621a + this.f25622b;
    }
}
