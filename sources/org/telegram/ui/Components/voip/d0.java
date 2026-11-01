package org.telegram.ui.Components.voip;
public final class d0 implements z4.e {
    public int f31432a = 0;
    public int f31433b;
    public final f0 f31434c;

    public d0(f0 f0Var) {
        this.f31434c = f0Var;
    }

    @Override
    public final void a(int i10) {
        int i11 = this.f31432a;
        f0 f0Var = this.f31434c;
        if (i11 == 0) {
            if (i10 <= f0Var.D) {
                f0Var.f31477n = 1;
            } else {
                f0Var.f31477n = 2;
            }
            f0.a(f0Var);
        } else if (i10 <= f0Var.D) {
            this.f31433b = 1;
        } else {
            this.f31433b = 2;
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        f0 f0Var = this.f31434c;
        f0Var.f31482y = i10;
        f0Var.f31481x = f7;
        f0Var.d();
    }

    @Override
    public final void c(int i10) {
        this.f31432a = i10;
        if (i10 == 0) {
            int i11 = this.f31433b;
            f0 f0Var = this.f31434c;
            f0Var.f31477n = i11;
            f0.a(f0Var);
        }
    }
}
