package org.telegram.ui.Components;
public class oz0 {
    public int f27201a;
    public int f27202b;
    public int f27203c;

    public oz0() {
        c();
    }

    public int a(xz0 xz0Var, qz0 qz0Var, jz0 jz0Var, int i10, boolean z10) {
        return this.f27201a - jz0Var.a(qz0Var, i10);
    }

    public void b(int i10, int i11) {
        this.f27201a = Math.max(this.f27201a, i10);
        this.f27202b = Math.max(this.f27202b, i11);
    }

    public void c() {
        this.f27201a = Integer.MIN_VALUE;
        this.f27202b = Integer.MIN_VALUE;
        this.f27203c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i10 = this.f27203c;
            jz0 jz0Var = xz0.R;
            if ((i10 & 2) != 0) {
                return 100000;
            }
        }
        return this.f27201a + this.f27202b;
    }
}
