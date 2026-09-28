package org.telegram.ui.Components.voip;
public final class u0 implements z4.e {
    public int f29598a = 0;
    public int f29599b;
    public final x0 f29600c;

    public u0(x0 x0Var) {
        this.f29600c = x0Var;
    }

    @Override
    public final void a(int i10) {
        int i11 = this.f29598a;
        x0 x0Var = this.f29600c;
        if (i11 == 0) {
            if (i10 <= x0Var.f29667y) {
                x0Var.f29662n = 1;
            } else {
                x0Var.f29662n = 2;
            }
            x0.a(x0Var);
        } else if (i10 <= x0Var.f29667y) {
            this.f29599b = 1;
        } else {
            this.f29599b = 2;
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        x0 x0Var = this.f29600c;
        x0Var.f29666x = i10;
        x0Var.f29665w = f7;
        x0Var.d();
    }

    @Override
    public final void c(int i10) {
        this.f29598a = i10;
        if (i10 == 0) {
            int i11 = this.f29599b;
            x0 x0Var = this.f29600c;
            x0Var.f29662n = i11;
            x0.a(x0Var);
        }
    }
}
