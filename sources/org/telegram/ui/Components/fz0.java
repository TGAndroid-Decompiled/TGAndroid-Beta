package org.telegram.ui.Components;
public class fz0 {
    public int f27049a;
    public int f27050b;
    public int f27051c;

    public fz0() {
        c();
    }

    public int a(oz0 oz0Var, hz0 hz0Var, az0 az0Var, int i10, boolean z4) {
        return this.f27049a - az0Var.a(hz0Var, i10);
    }

    public void b(int i10, int i11) {
        this.f27049a = Math.max(this.f27049a, i10);
        this.f27050b = Math.max(this.f27050b, i11);
    }

    public void c() {
        this.f27049a = Integer.MIN_VALUE;
        this.f27050b = Integer.MIN_VALUE;
        this.f27051c = 2;
    }

    public int d(boolean z4) {
        if (!z4) {
            int i10 = this.f27051c;
            az0 az0Var = oz0.O;
            if ((i10 & 2) != 0) {
                return 100000;
            }
        }
        return this.f27049a + this.f27050b;
    }
}
