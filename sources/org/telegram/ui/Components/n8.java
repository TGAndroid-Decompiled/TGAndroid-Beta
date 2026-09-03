package org.telegram.ui.Components;
public final class n8 extends org.telegram.ui.ActionBar.j {
    public final int f29411a;
    public final w8 f29412b;

    public n8(w8 w8Var, int i10) {
        this.f29411a = i10;
        this.f29412b = w8Var;
    }

    @Override
    public final void b(int i10) {
        switch (this.f29411a) {
            case 0:
                if (i10 == -1) {
                    w8.U(this.f29412b);
                    return;
                }
                return;
            default:
                w8 w8Var = this.f29412b;
                if (i10 == -1) {
                    w8.U(w8Var);
                }
                if (i10 == 1) {
                    w8Var.f0();
                    return;
                }
                return;
        }
    }
}
