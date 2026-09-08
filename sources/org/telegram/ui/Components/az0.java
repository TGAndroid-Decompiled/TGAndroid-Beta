package org.telegram.ui.Components;
public class az0 {
    public int f24503a;
    public int f24504b;
    public int f24505c;

    public az0() {
        c();
    }

    public int a(jz0 jz0Var, cz0 cz0Var, vy0 vy0Var, int i10, boolean z10) {
        return this.f24503a - vy0Var.a(cz0Var, i10);
    }

    public void b(int i10, int i11) {
        this.f24503a = Math.max(this.f24503a, i10);
        this.f24504b = Math.max(this.f24504b, i11);
    }

    public void c() {
        this.f24503a = Integer.MIN_VALUE;
        this.f24504b = Integer.MIN_VALUE;
        this.f24505c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i10 = this.f24505c;
            vy0 vy0Var = jz0.R;
            if ((i10 & 2) != 0) {
                return 100000;
            }
        }
        return this.f24503a + this.f24504b;
    }
}
