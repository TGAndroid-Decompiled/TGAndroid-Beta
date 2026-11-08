package org.telegram.ui.Components;
public class dx0 {
    public int f33107a;
    public int f33108b;
    public int f33109c;

    public dx0() {
        c();
    }

    public int a(mx0 mx0Var, fx0 fx0Var, yw0 yw0Var, int i7, boolean z9) {
        return this.f33107a - yw0Var.a(fx0Var, i7);
    }

    public void b(int i7, int i10) {
        this.f33107a = Math.max(this.f33107a, i7);
        this.f33108b = Math.max(this.f33108b, i10);
    }

    public void c() {
        this.f33107a = Integer.MIN_VALUE;
        this.f33108b = Integer.MIN_VALUE;
        this.f33109c = 2;
    }

    public int d(boolean z9) {
        if (!z9) {
            int i7 = this.f33109c;
            yw0 yw0Var = mx0.S;
            if ((i7 & 2) != 0) {
                return 100000;
            }
        }
        return this.f33107a + this.f33108b;
    }
}
