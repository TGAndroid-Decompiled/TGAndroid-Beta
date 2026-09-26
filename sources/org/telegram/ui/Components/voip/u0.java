package org.telegram.ui.Components.voip;
public final class u0 implements z4.e {
    public int f29594a = 0;
    public int f29595b;
    public final x0 f29596c;

    public u0(x0 x0Var) {
        this.f29596c = x0Var;
    }

    @Override
    public final void a(int i10) {
        int i11 = this.f29594a;
        x0 x0Var = this.f29596c;
        if (i11 == 0) {
            if (i10 <= x0Var.f29663y) {
                x0Var.f29658n = 1;
            } else {
                x0Var.f29658n = 2;
            }
            x0.a(x0Var);
        } else if (i10 <= x0Var.f29663y) {
            this.f29595b = 1;
        } else {
            this.f29595b = 2;
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        x0 x0Var = this.f29596c;
        x0Var.f29662x = i10;
        x0Var.f29661w = f7;
        x0Var.d();
    }

    @Override
    public final void c(int i10) {
        this.f29594a = i10;
        if (i10 == 0) {
            int i11 = this.f29595b;
            x0 x0Var = this.f29596c;
            x0Var.f29658n = i11;
            x0.a(x0Var);
        }
    }
}
