package org.telegram.ui.Components;
public class ty0 {
    public int f33060a;
    public int f33061b;
    public int f33062c;

    public ty0() {
        c();
    }

    public int a(cz0 cz0Var, vy0 vy0Var, oy0 oy0Var, int i10, boolean z10) {
        return this.f33060a - oy0Var.a(vy0Var, i10);
    }

    public void b(int i10, int i11) {
        this.f33060a = Math.max(this.f33060a, i10);
        this.f33061b = Math.max(this.f33061b, i11);
    }

    public void c() {
        this.f33060a = Integer.MIN_VALUE;
        this.f33061b = Integer.MIN_VALUE;
        this.f33062c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i10 = this.f33062c;
            oy0 oy0Var = cz0.N;
            if ((i10 & 2) != 0) {
                return 100000;
            }
        }
        return this.f33060a + this.f33061b;
    }
}
