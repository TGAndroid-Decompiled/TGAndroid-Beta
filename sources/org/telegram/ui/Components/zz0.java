package org.telegram.ui.Components;
public class zz0 {
    public int f31722a;
    public int f31723b;
    public int f31724c;

    public zz0() {
        c();
    }

    public int a(i01 i01Var, b01 b01Var, uz0 uz0Var, int i10, boolean z10) {
        return this.f31722a - uz0Var.a(b01Var, i10);
    }

    public void b(int i10, int i11) {
        this.f31722a = Math.max(this.f31722a, i10);
        this.f31723b = Math.max(this.f31723b, i11);
    }

    public void c() {
        this.f31722a = Integer.MIN_VALUE;
        this.f31723b = Integer.MIN_VALUE;
        this.f31724c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i10 = this.f31724c;
            uz0 uz0Var = i01.R;
            if ((i10 & 2) != 0) {
                return 100000;
            }
        }
        return this.f31722a + this.f31723b;
    }
}
