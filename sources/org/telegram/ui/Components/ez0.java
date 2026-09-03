package org.telegram.ui.Components;
public class ez0 {
    public int f26700a;
    public int f26701b;
    public int f26702c;

    public ez0() {
        c();
    }

    public int a(nz0 nz0Var, gz0 gz0Var, zy0 zy0Var, int i10, boolean z4) {
        return this.f26700a - zy0Var.a(gz0Var, i10);
    }

    public void b(int i10, int i11) {
        this.f26700a = Math.max(this.f26700a, i10);
        this.f26701b = Math.max(this.f26701b, i11);
    }

    public void c() {
        this.f26700a = Integer.MIN_VALUE;
        this.f26701b = Integer.MIN_VALUE;
        this.f26702c = 2;
    }

    public int d(boolean z4) {
        if (!z4) {
            int i10 = this.f26702c;
            zy0 zy0Var = nz0.O;
            if ((i10 & 2) != 0) {
                return 100000;
            }
        }
        return this.f26700a + this.f26701b;
    }
}
