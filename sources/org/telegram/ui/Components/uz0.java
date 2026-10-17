package org.telegram.ui.Components;
public class uz0 {
    public int f31109a;
    public int f31110b;
    public int f31111c;

    public uz0() {
        c();
    }

    public int a(d01 d01Var, wz0 wz0Var, pz0 pz0Var, int i10, boolean z10) {
        return this.f31109a - pz0Var.a(wz0Var, i10);
    }

    public void b(int i10, int i11) {
        this.f31109a = Math.max(this.f31109a, i10);
        this.f31110b = Math.max(this.f31110b, i11);
    }

    public void c() {
        this.f31109a = Integer.MIN_VALUE;
        this.f31110b = Integer.MIN_VALUE;
        this.f31111c = 2;
    }

    public int d(boolean z10) {
        if (!z10) {
            int i10 = this.f31111c;
            pz0 pz0Var = d01.R;
            if ((i10 & 2) != 0) {
                return 100000;
            }
        }
        return this.f31109a + this.f31110b;
    }
}
