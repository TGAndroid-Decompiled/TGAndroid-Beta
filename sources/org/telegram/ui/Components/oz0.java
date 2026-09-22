package org.telegram.ui.Components;
public class oz0 {
    public int f27208a;
    public int f27209b;
    public int f27210c;

    public oz0() {
        c();
    }

    public int a(xz0 xz0Var, qz0 qz0Var, jz0 jz0Var, int i10, boolean z10) {
        return this.f27208a - jz0Var.a(qz0Var, i10);
    }

    public void b(int i10, int i11) {
        this.f27208a = Math.max(this.f27208a, i10);
        this.f27209b = Math.max(this.f27209b, i11);
    }

    public void c() {
        this.f27208a = Integer.MIN_VALUE;
        this.f27209b = Integer.MIN_VALUE;
        this.f27210c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i10 = this.f27210c;
            jz0 jz0Var = xz0.R;
            if ((i10 & 2) != 0) {
                return 100000;
            }
        }
        return this.f27208a + this.f27209b;
    }
}
