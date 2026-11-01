package org.telegram.ui.Components;
public final class f8 extends org.telegram.ui.ActionBar.k {
    public final int f26106a;
    public final o8 f26107b;

    public f8(o8 o8Var, int i10) {
        this.f26106a = i10;
        this.f26107b = o8Var;
    }

    @Override
    public final void b(int i10) {
        switch (this.f26106a) {
            case 0:
                if (i10 == -1) {
                    o8.Z(this.f26107b);
                    return;
                }
                return;
            default:
                o8 o8Var = this.f26107b;
                if (i10 == -1) {
                    o8.Z(o8Var);
                }
                if (i10 == 1) {
                    o8Var.k0();
                    return;
                }
                return;
        }
    }
}
