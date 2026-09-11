package org.telegram.ui.Components;
public final class w8 extends org.telegram.ui.ActionBar.j {
    public final int f32197a;
    public final f9 f32198b;

    public w8(f9 f9Var, int i10) {
        this.f32197a = i10;
        this.f32198b = f9Var;
    }

    @Override
    public final void b(int i10) {
        switch (this.f32197a) {
            case 0:
                if (i10 == -1) {
                    f9.U(this.f32198b);
                    return;
                }
                return;
            default:
                f9 f9Var = this.f32198b;
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
