package org.telegram.ui.Components;
public class yz0 {
    public int f31706a;
    public int f31707b;
    public int f31708c;

    public yz0() {
        c();
    }

    public int a(h01 h01Var, a01 a01Var, tz0 tz0Var, int i10, boolean z10) {
        return this.f31706a - tz0Var.a(a01Var, i10);
    }

    public void b(int i10, int i11) {
        this.f31706a = Math.max(this.f31706a, i10);
        this.f31707b = Math.max(this.f31707b, i11);
    }

    public void c() {
        this.f31706a = Integer.MIN_VALUE;
        this.f31707b = Integer.MIN_VALUE;
        this.f31708c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i10 = this.f31708c;
            tz0 tz0Var = h01.R;
            if ((i10 & 2) != 0) {
                return 100000;
            }
        }
        return this.f31706a + this.f31707b;
    }
}
