package org.telegram.ui.Components;
public class gy0 {
    public int f26538a;
    public int f26539b;
    public int f26540c;

    public gy0() {
        c();
    }

    public int a(py0 py0Var, iy0 iy0Var, by0 by0Var, int i10, boolean z10) {
        return this.f26538a - by0Var.a(iy0Var, i10);
    }

    public void b(int i10, int i11) {
        this.f26538a = Math.max(this.f26538a, i10);
        this.f26539b = Math.max(this.f26539b, i11);
    }

    public void c() {
        this.f26538a = Integer.MIN_VALUE;
        this.f26539b = Integer.MIN_VALUE;
        this.f26540c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i10 = this.f26540c;
            by0 by0Var = py0.R;
            if ((i10 & 2) != 0) {
                return 100000;
            }
        }
        return this.f26538a + this.f26539b;
    }
}
