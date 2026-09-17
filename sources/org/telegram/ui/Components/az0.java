package org.telegram.ui.Components;
public class az0 {
    public int f24477a;
    public int f24478b;
    public int f24479c;

    public az0() {
        c();
    }

    public int a(jz0 jz0Var, cz0 cz0Var, vy0 vy0Var, int i10, boolean z10) {
        return this.f24477a - vy0Var.a(cz0Var, i10);
    }

    public void b(int i10, int i11) {
        this.f24477a = Math.max(this.f24477a, i10);
        this.f24478b = Math.max(this.f24478b, i11);
    }

    public void c() {
        this.f24477a = Integer.MIN_VALUE;
        this.f24478b = Integer.MIN_VALUE;
        this.f24479c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i10 = this.f24479c;
            vy0 vy0Var = jz0.R;
            if ((i10 & 2) != 0) {
                return 100000;
            }
        }
        return this.f24477a + this.f24478b;
    }
}
