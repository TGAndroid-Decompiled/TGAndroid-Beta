package org.telegram.ui.Components;
public class vz0 {
    public int f31956a;
    public int f31957b;
    public int f31958c;

    public vz0() {
        c();
    }

    public int a(e01 e01Var, xz0 xz0Var, qz0 qz0Var, int i10, boolean z10) {
        return this.f31956a - qz0Var.a(xz0Var, i10);
    }

    public void b(int i10, int i11) {
        this.f31956a = Math.max(this.f31956a, i10);
        this.f31957b = Math.max(this.f31957b, i11);
    }

    public void c() {
        this.f31956a = Integer.MIN_VALUE;
        this.f31957b = Integer.MIN_VALUE;
        this.f31958c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i10 = this.f31958c;
            qz0 qz0Var = e01.R;
            if ((i10 & 2) != 0) {
                return 100000;
            }
        }
        return this.f31956a + this.f31957b;
    }
}
