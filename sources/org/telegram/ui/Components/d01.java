package org.telegram.ui.Components;
public class d01 {
    public int f25507a;
    public int f25508b;
    public int f25509c;

    public d01() {
        c();
    }

    public int a(m01 m01Var, f01 f01Var, yz0 yz0Var, int i10, boolean z10) {
        return this.f25507a - yz0Var.a(f01Var, i10);
    }

    public void b(int i10, int i11) {
        this.f25507a = Math.max(this.f25507a, i10);
        this.f25508b = Math.max(this.f25508b, i11);
    }

    public void c() {
        this.f25507a = Integer.MIN_VALUE;
        this.f25508b = Integer.MIN_VALUE;
        this.f25509c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i10 = this.f25509c;
            yz0 yz0Var = m01.R;
            if ((i10 & 2) != 0) {
                return 100000;
            }
        }
        return this.f25507a + this.f25508b;
    }
}
