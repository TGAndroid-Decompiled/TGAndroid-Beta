package org.telegram.ui.Components;
public final class w8 extends org.telegram.ui.ActionBar.j {
    public final int f32198a;
    public final f9 f32199b;

    public w8(f9 f9Var, int i10) {
        this.f32198a = i10;
        this.f32199b = f9Var;
    }

    @Override
    public final void b(int i10) {
        switch (this.f32198a) {
            case 0:
                if (i10 == -1) {
                    f9.U(this.f32199b);
                    return;
                }
                return;
            default:
                f9 f9Var = this.f32199b;
                if (i10 == -1) {
                    f9.U(f9Var);
                }
                if (i10 == 1) {
                    f9Var.f0();
                    return;
                }
                return;
        }
    }
}
