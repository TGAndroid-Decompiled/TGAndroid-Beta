package org.telegram.ui.Components.voip;
public final class s0 implements z4.e {
    public int f31805a = 0;
    public int f31806b;
    public final v0 f31807c;

    public s0(v0 v0Var) {
        this.f31807c = v0Var;
    }

    @Override
    public final void a(float f7, int i10, int i11) {
        v0 v0Var = this.f31807c;
        v0Var.f31917x = i10;
        v0Var.f31916w = f7;
        v0Var.d();
    }

    @Override
    public final void b(int i10) {
        int i11 = this.f31805a;
        v0 v0Var = this.f31807c;
        if (i11 == 0) {
            if (i10 <= v0Var.f31918y) {
                v0Var.f31913n = 1;
            } else {
                v0Var.f31913n = 2;
            }
            v0.a(v0Var);
        } else if (i10 <= v0Var.f31918y) {
            this.f31806b = 1;
        } else {
            this.f31806b = 2;
        }
    }

    @Override
    public final void c(int i10) {
        this.f31805a = i10;
        if (i10 == 0) {
            int i11 = this.f31806b;
            v0 v0Var = this.f31807c;
            v0Var.f31913n = i11;
            v0.a(v0Var);
        }
    }
}
