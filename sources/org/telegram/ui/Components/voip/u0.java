package org.telegram.ui.Components.voip;
public final class u0 implements z4.e {
    public int f29595a = 0;
    public int f29596b;
    public final x0 f29597c;

    public u0(x0 x0Var) {
        this.f29597c = x0Var;
    }

    @Override
    public final void a(int i10) {
        int i11 = this.f29595a;
        x0 x0Var = this.f29597c;
        if (i11 == 0) {
            if (i10 <= x0Var.f29664y) {
                x0Var.f29659n = 1;
            } else {
                x0Var.f29659n = 2;
            }
            x0.a(x0Var);
        } else if (i10 <= x0Var.f29664y) {
            this.f29596b = 1;
        } else {
            this.f29596b = 2;
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        x0 x0Var = this.f29597c;
        x0Var.f29663x = i10;
        x0Var.f29662w = f7;
        x0Var.d();
    }

    @Override
    public final void c(int i10) {
        this.f29595a = i10;
        if (i10 == 0) {
            int i11 = this.f29596b;
            x0 x0Var = this.f29597c;
            x0Var.f29659n = i11;
            x0.a(x0Var);
        }
    }
}
