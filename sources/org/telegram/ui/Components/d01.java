package org.telegram.ui.Components;
public class d01 {
    public int f25569a;
    public int f25570b;
    public int f25571c;

    public d01() {
        c();
    }

    public int a(m01 m01Var, f01 f01Var, yz0 yz0Var, int i10, boolean z10) {
        return this.f25569a - yz0Var.a(f01Var, i10);
    }

    public void b(int i10, int i11) {
        this.f25569a = Math.max(this.f25569a, i10);
        this.f25570b = Math.max(this.f25570b, i11);
    }

    public void c() {
        this.f25569a = Integer.MIN_VALUE;
        this.f25570b = Integer.MIN_VALUE;
        this.f25571c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i10 = this.f25571c;
            yz0 yz0Var = m01.R;
            if ((i10 & 2) != 0) {
                return 100000;
            }
        }
        return this.f25569a + this.f25570b;
    }
}
