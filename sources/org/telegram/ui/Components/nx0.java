package org.telegram.ui.Components;
public class nx0 {
    public int f37870a;
    public int f37871b;
    public int f37872c;

    public nx0() {
        c();
    }

    public int a(wx0 wx0Var, px0 px0Var, ix0 ix0Var, int i7, boolean z10) {
        return this.f37870a - ix0Var.a(px0Var, i7);
    }

    public void b(int i7, int i10) {
        this.f37870a = Math.max(this.f37870a, i7);
        this.f37871b = Math.max(this.f37871b, i10);
    }

    public void c() {
        this.f37870a = Integer.MIN_VALUE;
        this.f37871b = Integer.MIN_VALUE;
        this.f37872c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i7 = this.f37872c;
            ix0 ix0Var = wx0.T;
            if ((i7 & 2) != 0) {
                return 100000;
            }
        }
        return this.f37870a + this.f37871b;
    }
}
