package org.telegram.ui.Components.voip;
public final class t0 implements z4.e {
    public int f28444a = 0;
    public int f28445b;
    public final w0 f28446c;

    public t0(w0 w0Var) {
        this.f28446c = w0Var;
    }

    @Override
    public final void a(int i10) {
        int i11 = this.f28444a;
        w0 w0Var = this.f28446c;
        if (i11 == 0) {
            if (i10 <= w0Var.f28514y) {
                w0Var.f28509n = 1;
            } else {
                w0Var.f28509n = 2;
            }
            w0.a(w0Var);
        } else if (i10 <= w0Var.f28514y) {
            this.f28445b = 1;
        } else {
            this.f28445b = 2;
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        w0 w0Var = this.f28446c;
        w0Var.f28513x = i10;
        w0Var.f28512w = f7;
        w0Var.d();
    }

    @Override
    public final void c(int i10) {
        this.f28444a = i10;
        if (i10 == 0) {
            int i11 = this.f28445b;
            w0 w0Var = this.f28446c;
            w0Var.f28509n = i11;
            w0.a(w0Var);
        }
    }
}
