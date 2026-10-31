package org.telegram.ui.Components;
public final class f8 extends org.telegram.ui.ActionBar.k {
    public final int f26007a;
    public final o8 f26008b;

    public f8(o8 o8Var, int i10) {
        this.f26007a = i10;
        this.f26008b = o8Var;
    }

    @Override
    public final void b(int i10) {
        switch (this.f26007a) {
            case 0:
                if (i10 == -1) {
                    o8.Y(this.f26008b);
                    return;
                }
                return;
            default:
                o8 o8Var = this.f26008b;
                if (i10 == -1) {
                    o8.Y(o8Var);
                }
                if (i10 == 1) {
                    o8Var.j0();
                    return;
                }
                return;
        }
    }
}
