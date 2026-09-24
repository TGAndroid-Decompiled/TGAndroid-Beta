package org.telegram.ui.Components;
public class lz0 {
    public int f26305a;
    public int f26306b;
    public int f26307c;

    public lz0() {
        c();
    }

    public int a(uz0 uz0Var, nz0 nz0Var, gz0 gz0Var, int i10, boolean z10) {
        return this.f26305a - gz0Var.a(nz0Var, i10);
    }

    public void b(int i10, int i11) {
        this.f26305a = Math.max(this.f26305a, i10);
        this.f26306b = Math.max(this.f26306b, i11);
    }

    public void c() {
        this.f26305a = Integer.MIN_VALUE;
        this.f26306b = Integer.MIN_VALUE;
        this.f26307c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i10 = this.f26307c;
            gz0 gz0Var = uz0.R;
            if ((i10 & 2) != 0) {
                return 100000;
            }
        }
        return this.f26305a + this.f26306b;
    }
}
