package org.telegram.ui.Components;
public class cz0 {
    public int f23161a;
    public int f23162b;
    public int f23163c;

    public cz0() {
        c();
    }

    public int a(lz0 lz0Var, ez0 ez0Var, xy0 xy0Var, int i10, boolean z10) {
        return this.f23161a - xy0Var.a(ez0Var, i10);
    }

    public void b(int i10, int i11) {
        this.f23161a = Math.max(this.f23161a, i10);
        this.f23162b = Math.max(this.f23162b, i11);
    }

    public void c() {
        this.f23161a = Integer.MIN_VALUE;
        this.f23162b = Integer.MIN_VALUE;
        this.f23163c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i10 = this.f23163c;
            xy0 xy0Var = lz0.R;
            if ((i10 & 2) != 0) {
                return 100000;
            }
        }
        return this.f23161a + this.f23162b;
    }
}
