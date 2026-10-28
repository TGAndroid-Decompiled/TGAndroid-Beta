package org.telegram.ui.Components;
public class i01 {
    public int f29168a;
    public int f29169b;
    public int f29170c;

    public i01() {
        c();
    }

    public int a(r01 r01Var, k01 k01Var, kb1 kb1Var, int i10, boolean z10) {
        return this.f29168a - kb1Var.F(k01Var, i10);
    }

    public void b(int i10, int i11) {
        this.f29168a = Math.max(this.f29168a, i10);
        this.f29169b = Math.max(this.f29169b, i11);
    }

    public void c() {
        this.f29168a = Integer.MIN_VALUE;
        this.f29169b = Integer.MIN_VALUE;
        this.f29170c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i10 = this.f29170c;
            d01 d01Var = r01.R;
            if ((i10 & 2) != 0) {
                return 100000;
            }
        }
        return this.f29168a + this.f29169b;
    }
}
