package org.telegram.ui.Components;
public final class n8 extends org.telegram.ui.ActionBar.j {
    public final int f29422a;
    public final w8 f29423b;

    public n8(w8 w8Var, int i10) {
        this.f29422a = i10;
        this.f29423b = w8Var;
    }

    @Override
    public final void b(int i10) {
        switch (this.f29422a) {
            case 0:
                if (i10 == -1) {
                    w8.U(this.f29423b);
                    return;
                }
                return;
            default:
                w8 w8Var = this.f29423b;
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
