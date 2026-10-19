package org.telegram.ui.Components.voip;
public final class s0 implements z4.e {
    public int f31733a = 0;
    public int f31734b;
    public final v0 f31735c;

    public s0(v0 v0Var) {
        this.f31735c = v0Var;
    }

    @Override
    public final void a(float f7, int i10, int i11) {
        v0 v0Var = this.f31735c;
        v0Var.f31838x = i10;
        v0Var.f31837w = f7;
        v0Var.d();
    }

    @Override
    public final void b(int i10) {
        int i11 = this.f31733a;
        v0 v0Var = this.f31735c;
        if (i11 == 0) {
            if (i10 <= v0Var.f31839y) {
                v0Var.f31834n = 1;
            } else {
                v0Var.f31834n = 2;
            }
            v0.a(v0Var);
        } else if (i10 <= v0Var.f31839y) {
            this.f31734b = 1;
        } else {
            this.f31734b = 2;
        }
    }

    @Override
    public final void c(int i10) {
        this.f31733a = i10;
        if (i10 == 0) {
            int i11 = this.f31734b;
            v0 v0Var = this.f31735c;
            v0Var.f31834n = i11;
            v0.a(v0Var);
        }
    }
}
