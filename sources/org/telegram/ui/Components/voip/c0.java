package org.telegram.ui.Components.voip;
public final class c0 implements z4.e {
    public int f31355a = 0;
    public int f31356b;
    public final e0 f31357c;

    public c0(e0 e0Var) {
        this.f31357c = e0Var;
    }

    @Override
    public final void a(int i10) {
        int i11 = this.f31355a;
        e0 e0Var = this.f31357c;
        if (i11 == 0) {
            if (i10 <= e0Var.D) {
                e0Var.f31399n = 1;
            } else {
                e0Var.f31399n = 2;
            }
            e0.a(e0Var);
        } else if (i10 <= e0Var.D) {
            this.f31356b = 1;
        } else {
            this.f31356b = 2;
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        e0 e0Var = this.f31357c;
        e0Var.f31404y = i10;
        e0Var.f31403x = f7;
        e0Var.d();
    }

    @Override
    public final void c(int i10) {
        this.f31355a = i10;
        if (i10 == 0) {
            int i11 = this.f31356b;
            e0 e0Var = this.f31357c;
            e0Var.f31399n = i11;
            e0.a(e0Var);
        }
    }
}
