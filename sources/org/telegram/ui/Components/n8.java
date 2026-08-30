package org.telegram.ui.Components;
public final class n8 extends org.telegram.ui.ActionBar.j {
    public final int f27213a;
    public final w8 f27214b;

    public n8(w8 w8Var, int i10) {
        this.f27213a = i10;
        this.f27214b = w8Var;
    }

    @Override
    public final void b(int i10) {
        switch (this.f27213a) {
            case 0:
                if (i10 == -1) {
                    w8.U(this.f27214b);
                    return;
                }
                return;
            default:
                w8 w8Var = this.f27214b;
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
