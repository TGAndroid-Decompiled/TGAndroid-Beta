package org.telegram.ui.Components;
public class ez0 {
    public int f24723a;
    public int f24724b;
    public int f24725c;

    public ez0() {
        c();
    }

    public int a(nz0 nz0Var, gz0 gz0Var, zy0 zy0Var, int i10, boolean z4) {
        return this.f24723a - zy0Var.a(gz0Var, i10);
    }

    public void b(int i10, int i11) {
        this.f24723a = Math.max(this.f24723a, i10);
        this.f24724b = Math.max(this.f24724b, i11);
    }

    public void c() {
        this.f24723a = Integer.MIN_VALUE;
        this.f24724b = Integer.MIN_VALUE;
        this.f24725c = 2;
    }

    public int d(boolean z4) {
        if (!z4) {
            int i10 = this.f24725c;
            zy0 zy0Var = nz0.O;
            if ((i10 & 2) != 0) {
                return 100000;
            }
        }
        return this.f24723a + this.f24724b;
    }
}
