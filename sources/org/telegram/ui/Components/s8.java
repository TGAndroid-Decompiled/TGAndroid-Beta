package org.telegram.ui.Components;
public final class s8 extends org.telegram.ui.ActionBar.k {
    public final int f32537a;
    public final b9 f32538b;

    public s8(b9 b9Var, int i10) {
        this.f32537a = i10;
        this.f32538b = b9Var;
    }

    @Override
    public final void b(int i10) {
        switch (this.f32537a) {
            case 0:
                if (i10 == -1) {
                    b9.U(this.f32538b);
                    return;
                }
                return;
            default:
                b9 b9Var = this.f32538b;
                if (i10 == -1) {
                    b9.U(b9Var);
                }
                if (i10 == 1) {
                    b9Var.f0();
                    return;
                }
                return;
        }
    }
}
