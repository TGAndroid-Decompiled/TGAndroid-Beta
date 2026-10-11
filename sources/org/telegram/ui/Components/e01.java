package org.telegram.ui.Components;
public class e01 {
    public int f25786a;
    public int f25787b;
    public int f25788c;

    public e01() {
        c();
    }

    public int a(n01 n01Var, g01 g01Var, zz0 zz0Var, int i10, boolean z10) {
        return this.f25786a - zz0Var.a(g01Var, i10);
    }

    public void b(int i10, int i11) {
        this.f25786a = Math.max(this.f25786a, i10);
        this.f25787b = Math.max(this.f25787b, i11);
    }

    public void c() {
        this.f25786a = Integer.MIN_VALUE;
        this.f25787b = Integer.MIN_VALUE;
        this.f25788c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i10 = this.f25788c;
            zz0 zz0Var = n01.R;
            if ((i10 & 2) != 0) {
                return 100000;
            }
        }
        return this.f25786a + this.f25787b;
    }
}
