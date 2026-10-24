package org.telegram.ui.Components;
public class yz0 {
    public int f33092a;
    public int f33093b;
    public int f33094c;

    public yz0() {
        c();
    }

    public int a(h01 h01Var, a01 a01Var, tz0 tz0Var, int i10, boolean z10) {
        return this.f33092a - tz0Var.a(a01Var, i10);
    }

    public void b(int i10, int i11) {
        this.f33092a = Math.max(this.f33092a, i10);
        this.f33093b = Math.max(this.f33093b, i11);
    }

    public void c() {
        this.f33092a = Integer.MIN_VALUE;
        this.f33093b = Integer.MIN_VALUE;
        this.f33094c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i10 = this.f33094c;
            tz0 tz0Var = h01.R;
            if ((i10 & 2) != 0) {
                return 100000;
            }
        }
        return this.f33092a + this.f33093b;
    }
}
