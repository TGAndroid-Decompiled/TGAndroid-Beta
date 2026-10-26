package org.telegram.ui.Components;
public class h01 {
    public int f28756a;
    public int f28757b;
    public int f28758c;

    public h01() {
        c();
    }

    public int a(q01 q01Var, j01 j01Var, gb1 gb1Var, int i10, boolean z10) {
        return this.f28756a - gb1Var.F(j01Var, i10);
    }

    public void b(int i10, int i11) {
        this.f28756a = Math.max(this.f28756a, i10);
        this.f28757b = Math.max(this.f28757b, i11);
    }

    public void c() {
        this.f28756a = Integer.MIN_VALUE;
        this.f28757b = Integer.MIN_VALUE;
        this.f28758c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i10 = this.f28758c;
            c01 c01Var = q01.R;
            if ((i10 & 2) != 0) {
                return 100000;
            }
        }
        return this.f28756a + this.f28757b;
    }
}
