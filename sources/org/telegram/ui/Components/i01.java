package org.telegram.ui.Components;
public class i01 {
    public int f27005a;
    public int f27006b;
    public int f27007c;

    public i01() {
        c();
    }

    public int a(r01 r01Var, k01 k01Var, d01 d01Var, int i10, boolean z10) {
        return this.f27005a - d01Var.a(k01Var, i10);
    }

    public void b(int i10, int i11) {
        this.f27005a = Math.max(this.f27005a, i10);
        this.f27006b = Math.max(this.f27006b, i11);
    }

    public void c() {
        this.f27005a = Integer.MIN_VALUE;
        this.f27006b = Integer.MIN_VALUE;
        this.f27007c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i10 = this.f27007c;
            d01 d01Var = r01.R;
            if ((i10 & 2) != 0) {
                return 100000;
            }
        }
        return this.f27005a + this.f27006b;
    }
}
