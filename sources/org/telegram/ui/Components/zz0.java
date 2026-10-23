package org.telegram.ui.Components;
public class zz0 {
    public int f33374a;
    public int f33375b;
    public int f33376c;

    public zz0() {
        c();
    }

    public int a(i01 i01Var, b01 b01Var, uz0 uz0Var, int i10, boolean z10) {
        return this.f33374a - uz0Var.a(b01Var, i10);
    }

    public void b(int i10, int i11) {
        this.f33374a = Math.max(this.f33374a, i10);
        this.f33375b = Math.max(this.f33375b, i11);
    }

    public void c() {
        this.f33374a = Integer.MIN_VALUE;
        this.f33375b = Integer.MIN_VALUE;
        this.f33376c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i10 = this.f33376c;
            uz0 uz0Var = i01.R;
            if ((i10 & 2) != 0) {
                return 100000;
            }
        }
        return this.f33374a + this.f33375b;
    }
}
