package org.telegram.ui.Components;
public class uz0 {
    public int f31116a;
    public int f31117b;
    public int f31118c;

    public uz0() {
        c();
    }

    public int a(d01 d01Var, wz0 wz0Var, pz0 pz0Var, int i10, boolean z10) {
        return this.f31116a - pz0Var.a(wz0Var, i10);
    }

    public void b(int i10, int i11) {
        this.f31116a = Math.max(this.f31116a, i10);
        this.f31117b = Math.max(this.f31117b, i11);
    }

    public void c() {
        this.f31116a = Integer.MIN_VALUE;
        this.f31117b = Integer.MIN_VALUE;
        this.f31118c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i10 = this.f31118c;
            pz0 pz0Var = d01.R;
            if ((i10 & 2) != 0) {
                return 100000;
            }
        }
        return this.f31116a + this.f31117b;
    }
}
