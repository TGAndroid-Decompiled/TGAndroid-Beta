package org.telegram.ui.Components;

public class ky0 {

    public int f30223a;

    public int f30224b;

    public int f30225c;

    public ky0() {
        c();
    }

    public int a(ty0 ty0Var, my0 my0Var, fy0 fy0Var, int i10, boolean z10) {
        return this.f30223a - fy0Var.a(my0Var, i10);
    }

    public void b(int i10, int i11) {
        this.f30223a = Math.max(this.f30223a, i10);
        this.f30224b = Math.max(this.f30224b, i11);
    }

    public void c() {
        this.f30223a = Integer.MIN_VALUE;
        this.f30224b = Integer.MIN_VALUE;
        this.f30225c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i10 = this.f30225c;
            fy0 fy0Var = ty0.N;
            if ((i10 & 2) != 0) {
                return 100000;
            }
        }
        return this.f30223a + this.f30224b;
    }
}
