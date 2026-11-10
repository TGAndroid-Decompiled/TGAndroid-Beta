package org.telegram.ui.Components;
public class dx0 {
    public int f33096a;
    public int f33097b;
    public int f33098c;

    public dx0() {
        c();
    }

    public int a(mx0 mx0Var, fx0 fx0Var, yw0 yw0Var, int i7, boolean z9) {
        return this.f33096a - yw0Var.a(fx0Var, i7);
    }

    public void b(int i7, int i10) {
        this.f33096a = Math.max(this.f33096a, i7);
        this.f33097b = Math.max(this.f33097b, i10);
    }

    public void c() {
        this.f33096a = Integer.MIN_VALUE;
        this.f33097b = Integer.MIN_VALUE;
        this.f33098c = 2;
    }

    public int d(boolean z9) {
        if (!z9) {
            int i7 = this.f33098c;
            yw0 yw0Var = mx0.S;
            if ((i7 & 2) != 0) {
                return 100000;
            }
        }
        return this.f33096a + this.f33097b;
    }
}
