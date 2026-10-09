package org.telegram.ui.Components;
public class c01 {
    public int f25199a;
    public int f25200b;
    public int f25201c;

    public c01() {
        c();
    }

    public int a(l01 l01Var, e01 e01Var, xz0 xz0Var, int i10, boolean z10) {
        return this.f25199a - xz0Var.a(e01Var, i10);
    }

    public void b(int i10, int i11) {
        this.f25199a = Math.max(this.f25199a, i10);
        this.f25200b = Math.max(this.f25200b, i11);
    }

    public void c() {
        this.f25199a = Integer.MIN_VALUE;
        this.f25200b = Integer.MIN_VALUE;
        this.f25201c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i10 = this.f25201c;
            xz0 xz0Var = l01.R;
            if ((i10 & 2) != 0) {
                return 100000;
            }
        }
        return this.f25199a + this.f25200b;
    }
}
