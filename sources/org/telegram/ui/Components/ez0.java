package org.telegram.ui.Components;
public class ez0 {
    public int f24704a;
    public int f24705b;
    public int f24706c;

    public ez0() {
        c();
    }

    public int a(nz0 nz0Var, gz0 gz0Var, zy0 zy0Var, int i10, boolean z4) {
        return this.f24704a - zy0Var.a(gz0Var, i10);
    }

    public void b(int i10, int i11) {
        this.f24704a = Math.max(this.f24704a, i10);
        this.f24705b = Math.max(this.f24705b, i11);
    }

    public void c() {
        this.f24704a = Integer.MIN_VALUE;
        this.f24705b = Integer.MIN_VALUE;
        this.f24706c = 2;
    }

    public int d(boolean z4) {
        if (!z4) {
            int i10 = this.f24706c;
            zy0 zy0Var = nz0.O;
            if ((i10 & 2) != 0) {
                return 100000;
            }
        }
        return this.f24704a + this.f24705b;
    }
}
