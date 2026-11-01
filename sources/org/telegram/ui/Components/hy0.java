package org.telegram.ui.Components;
public class hy0 {
    public int f26957a;
    public int f26958b;
    public int f26959c;

    public hy0() {
        c();
    }

    public int a(qy0 qy0Var, jy0 jy0Var, cy0 cy0Var, int i10, boolean z10) {
        return this.f26957a - cy0Var.a(jy0Var, i10);
    }

    public void b(int i10, int i11) {
        this.f26957a = Math.max(this.f26957a, i10);
        this.f26958b = Math.max(this.f26958b, i11);
    }

    public void c() {
        this.f26957a = Integer.MIN_VALUE;
        this.f26958b = Integer.MIN_VALUE;
        this.f26959c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i10 = this.f26959c;
            cy0 cy0Var = qy0.R;
            if ((i10 & 2) != 0) {
                return 100000;
            }
        }
        return this.f26957a + this.f26958b;
    }
}
