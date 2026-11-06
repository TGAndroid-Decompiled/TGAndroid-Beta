package org.telegram.ui.Components;
public class dx0 {
    public int f33089a;
    public int f33090b;
    public int f33091c;

    public dx0() {
        c();
    }

    public int a(mx0 mx0Var, fx0 fx0Var, yw0 yw0Var, int i7, boolean z9) {
        return this.f33089a - yw0Var.a(fx0Var, i7);
    }

    public void b(int i7, int i10) {
        this.f33089a = Math.max(this.f33089a, i7);
        this.f33090b = Math.max(this.f33090b, i10);
    }

    public void c() {
        this.f33089a = Integer.MIN_VALUE;
        this.f33090b = Integer.MIN_VALUE;
        this.f33091c = 2;
    }

    public int d(boolean z9) {
        if (!z9) {
            int i7 = this.f33091c;
            yw0 yw0Var = mx0.S;
            if ((i7 & 2) != 0) {
                return 100000;
            }
        }
        return this.f33089a + this.f33090b;
    }
}
