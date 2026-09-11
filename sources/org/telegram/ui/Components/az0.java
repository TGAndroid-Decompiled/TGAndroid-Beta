package org.telegram.ui.Components;
public class az0 {
    public int f24476a;
    public int f24477b;
    public int f24478c;

    public az0() {
        c();
    }

    public int a(jz0 jz0Var, cz0 cz0Var, vy0 vy0Var, int i10, boolean z10) {
        return this.f24476a - vy0Var.a(cz0Var, i10);
    }

    public void b(int i10, int i11) {
        this.f24476a = Math.max(this.f24476a, i10);
        this.f24477b = Math.max(this.f24477b, i11);
    }

    public void c() {
        this.f24476a = Integer.MIN_VALUE;
        this.f24477b = Integer.MIN_VALUE;
        this.f24478c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i10 = this.f24478c;
            vy0 vy0Var = jz0.R;
            if ((i10 & 2) != 0) {
                return 100000;
            }
        }
        return this.f24476a + this.f24477b;
    }
}
