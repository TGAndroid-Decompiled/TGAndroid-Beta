package org.telegram.ui.Components;
public class cz0 {
    public int f23158a;
    public int f23159b;
    public int f23160c;

    public cz0() {
        c();
    }

    public int a(lz0 lz0Var, ez0 ez0Var, xy0 xy0Var, int i10, boolean z10) {
        return this.f23158a - xy0Var.a(ez0Var, i10);
    }

    public void b(int i10, int i11) {
        this.f23158a = Math.max(this.f23158a, i10);
        this.f23159b = Math.max(this.f23159b, i11);
    }

    public void c() {
        this.f23158a = Integer.MIN_VALUE;
        this.f23159b = Integer.MIN_VALUE;
        this.f23160c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i10 = this.f23160c;
            xy0 xy0Var = lz0.R;
            if ((i10 & 2) != 0) {
                return 100000;
            }
        }
        return this.f23158a + this.f23159b;
    }
}
