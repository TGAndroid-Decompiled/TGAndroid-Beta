package org.telegram.ui.Components;
public class iy0 {
    public int f29544a;
    public int f29545b;
    public int f29546c;

    public iy0() {
        c();
    }

    public int a(ry0 ry0Var, ky0 ky0Var, dy0 dy0Var, int i9, boolean z10) {
        return this.f29544a - dy0Var.a(ky0Var, i9);
    }

    public void b(int i9, int i10) {
        this.f29544a = Math.max(this.f29544a, i9);
        this.f29545b = Math.max(this.f29545b, i10);
    }

    public void c() {
        this.f29544a = Integer.MIN_VALUE;
        this.f29545b = Integer.MIN_VALUE;
        this.f29546c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i9 = this.f29546c;
            dy0 dy0Var = ry0.N;
            if ((i9 & 2) != 0) {
                return 100000;
            }
        }
        return this.f29544a + this.f29545b;
    }
}
