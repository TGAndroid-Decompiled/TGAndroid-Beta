package org.telegram.ui.Components;
public class ex0 {
    public int f33516a;
    public int f33517b;
    public int f33518c;

    public ex0() {
        c();
    }

    public int a(nx0 nx0Var, gx0 gx0Var, zw0 zw0Var, int i7, boolean z9) {
        return this.f33516a - zw0Var.a(gx0Var, i7);
    }

    public void b(int i7, int i10) {
        this.f33516a = Math.max(this.f33516a, i7);
        this.f33517b = Math.max(this.f33517b, i10);
    }

    public void c() {
        this.f33516a = Integer.MIN_VALUE;
        this.f33517b = Integer.MIN_VALUE;
        this.f33518c = 2;
    }

    public int d(boolean z9) {
        if (!z9) {
            int i7 = this.f33518c;
            zw0 zw0Var = nx0.S;
            if ((i7 & 2) != 0) {
                return 100000;
            }
        }
        return this.f33516a + this.f33517b;
    }
}
