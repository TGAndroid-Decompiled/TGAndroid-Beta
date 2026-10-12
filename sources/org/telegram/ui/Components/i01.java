package org.telegram.ui.Components;
public class i01 {
    public int f26990a;
    public int f26991b;
    public int f26992c;

    public i01() {
        c();
    }

    public int a(r01 r01Var, k01 k01Var, d01 d01Var, int i10, boolean z10) {
        return this.f26990a - d01Var.a(k01Var, i10);
    }

    public void b(int i10, int i11) {
        this.f26990a = Math.max(this.f26990a, i10);
        this.f26991b = Math.max(this.f26991b, i11);
    }

    public void c() {
        this.f26990a = Integer.MIN_VALUE;
        this.f26991b = Integer.MIN_VALUE;
        this.f26992c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i10 = this.f26992c;
            d01 d01Var = r01.R;
            if ((i10 & 2) != 0) {
                return 100000;
            }
        }
        return this.f26990a + this.f26991b;
    }
}
