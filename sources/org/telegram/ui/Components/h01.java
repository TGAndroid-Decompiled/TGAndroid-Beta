package org.telegram.ui.Components;
public class h01 {
    public int f28754a;
    public int f28755b;
    public int f28756c;

    public h01() {
        c();
    }

    public int a(q01 q01Var, j01 j01Var, gb1 gb1Var, int i10, boolean z10) {
        return this.f28754a - gb1Var.F(j01Var, i10);
    }

    public void b(int i10, int i11) {
        this.f28754a = Math.max(this.f28754a, i10);
        this.f28755b = Math.max(this.f28755b, i11);
    }

    public void c() {
        this.f28754a = Integer.MIN_VALUE;
        this.f28755b = Integer.MIN_VALUE;
        this.f28756c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i10 = this.f28756c;
            c01 c01Var = q01.R;
            if ((i10 & 2) != 0) {
                return 100000;
            }
        }
        return this.f28754a + this.f28755b;
    }
}
