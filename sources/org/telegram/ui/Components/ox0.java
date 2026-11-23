package org.telegram.ui.Components;
public class ox0 {
    public int f38274a;
    public int f38275b;
    public int f38276c;

    public ox0() {
        c();
    }

    public int a(xx0 xx0Var, qx0 qx0Var, jx0 jx0Var, int i7, boolean z10) {
        return this.f38274a - jx0Var.a(qx0Var, i7);
    }

    public void b(int i7, int i10) {
        this.f38274a = Math.max(this.f38274a, i7);
        this.f38275b = Math.max(this.f38275b, i10);
    }

    public void c() {
        this.f38274a = Integer.MIN_VALUE;
        this.f38275b = Integer.MIN_VALUE;
        this.f38276c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i7 = this.f38276c;
            jx0 jx0Var = xx0.T;
            if ((i7 & 2) != 0) {
                return 100000;
            }
        }
        return this.f38274a + this.f38275b;
    }
}
