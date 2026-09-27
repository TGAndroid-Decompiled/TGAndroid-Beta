package org.telegram.ui.Components.voip;
public final class u0 implements z4.e {
    public int f29620a = 0;
    public int f29621b;
    public final x0 f29622c;

    public u0(x0 x0Var) {
        this.f29622c = x0Var;
    }

    @Override
    public final void a(int i10) {
        int i11 = this.f29620a;
        x0 x0Var = this.f29622c;
        if (i11 == 0) {
            if (i10 <= x0Var.f29689y) {
                x0Var.f29684n = 1;
            } else {
                x0Var.f29684n = 2;
            }
            x0.a(x0Var);
        } else if (i10 <= x0Var.f29689y) {
            this.f29621b = 1;
        } else {
            this.f29621b = 2;
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        x0 x0Var = this.f29622c;
        x0Var.f29688x = i10;
        x0Var.f29687w = f7;
        x0Var.d();
    }

    @Override
    public final void c(int i10) {
        this.f29620a = i10;
        if (i10 == 0) {
            int i11 = this.f29621b;
            x0 x0Var = this.f29622c;
            x0Var.f29684n = i11;
            x0.a(x0Var);
        }
    }
}
