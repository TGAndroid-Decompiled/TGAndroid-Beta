package org.telegram.ui.Components.voip;
public final class u0 implements z4.e {
    public int f29255a = 0;
    public int f29256b;
    public final x0 f29257c;

    public u0(x0 x0Var) {
        this.f29257c = x0Var;
    }

    @Override
    public final void a(int i10) {
        int i11 = this.f29255a;
        x0 x0Var = this.f29257c;
        if (i11 == 0) {
            if (i10 <= x0Var.f29329y) {
                x0Var.f29324n = 1;
            } else {
                x0Var.f29324n = 2;
            }
            x0.a(x0Var);
        } else if (i10 <= x0Var.f29329y) {
            this.f29256b = 1;
        } else {
            this.f29256b = 2;
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        x0 x0Var = this.f29257c;
        x0Var.f29328x = i10;
        x0Var.f29327w = f7;
        x0Var.d();
    }

    @Override
    public final void c(int i10) {
        this.f29255a = i10;
        if (i10 == 0) {
            int i11 = this.f29256b;
            x0 x0Var = this.f29257c;
            x0Var.f29324n = i11;
            x0.a(x0Var);
        }
    }
}
