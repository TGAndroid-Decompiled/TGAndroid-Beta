package org.telegram.ui.Components;
public class az0 {
    public int f22534a;
    public int f22535b;
    public int f22536c;

    public az0() {
        c();
    }

    public int a(jz0 jz0Var, cz0 cz0Var, vy0 vy0Var, int i10, boolean z10) {
        return this.f22534a - vy0Var.a(cz0Var, i10);
    }

    public void b(int i10, int i11) {
        this.f22534a = Math.max(this.f22534a, i10);
        this.f22535b = Math.max(this.f22535b, i11);
    }

    public void c() {
        this.f22534a = Integer.MIN_VALUE;
        this.f22535b = Integer.MIN_VALUE;
        this.f22536c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i10 = this.f22536c;
            vy0 vy0Var = jz0.R;
            if ((i10 & 2) != 0) {
                return 100000;
            }
        }
        return this.f22534a + this.f22535b;
    }
}
