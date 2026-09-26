package org.telegram.ui.Components;
public class lz0 {
    public int f26312a;
    public int f26313b;
    public int f26314c;

    public lz0() {
        c();
    }

    public int a(uz0 uz0Var, nz0 nz0Var, gz0 gz0Var, int i10, boolean z10) {
        return this.f26312a - gz0Var.a(nz0Var, i10);
    }

    public void b(int i10, int i11) {
        this.f26312a = Math.max(this.f26312a, i10);
        this.f26313b = Math.max(this.f26313b, i11);
    }

    public void c() {
        this.f26312a = Integer.MIN_VALUE;
        this.f26313b = Integer.MIN_VALUE;
        this.f26314c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i10 = this.f26314c;
            gz0 gz0Var = uz0.R;
            if ((i10 & 2) != 0) {
                return 100000;
            }
        }
        return this.f26312a + this.f26313b;
    }
}
